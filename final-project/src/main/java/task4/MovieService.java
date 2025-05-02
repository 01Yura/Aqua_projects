package task4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> map = new HashMap<>();

    public Map<Movie, List<Rating<T>>> getMap () {
        return map;
    }

    public synchronized boolean addGrade(String title, T rating) {
        if (rating.doubleValue() < 0 || rating.doubleValue() > 10) return false;

        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            if (!map.containsKey(new Movie(title))) {
                System.out.println("Movie is not in library");
                return false;
            }

            if (entry.getKey().getTitle().equals(title)){
                map.get(entry.getKey()).add(new Rating<>(rating));
            }

        }
        return true;
    }

    public synchronized double average(String title) {

        List<Rating<T>> list = new ArrayList<>();

        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            if (entry.getKey().getTitle().equals(title)){
                list = entry.getValue();
            }
        }

        return list.stream()
                .mapToDouble(e -> e.getRating().doubleValue())
                .average()
                .getAsDouble();
    }

    public synchronized LinkedHashMap<Movie, Double> sortByAverageRating() {
        Map<Movie, Double> hashMap = new LinkedHashMap<>();

        double sum = 0;
        double counter = 0;
        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            for (Rating<T> rating : entry.getValue()) {
                sum += rating.getRating().doubleValue();
                counter++;
            }
            double average = sum/counter;
            hashMap.put(entry.getKey(),average);
            sum = 0;
            counter = 0;
        }
        return hashMap.entrySet().stream()
                .sorted(Map.Entry.<Movie,Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (e1,e2) -> e1, () -> new LinkedHashMap<>()));



    }

    public synchronized boolean addMovie(String title) {
        if (map.containsKey(new Movie(title))) {
            System.out.println("Movie is already in library");
            return false;
        } else {
            map.put(new Movie(title), new ArrayList<>());
            System.out.println("Movie " + title + " has been added to library");
            return true;
        }
    }


}