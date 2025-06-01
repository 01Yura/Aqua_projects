package homework13_same_as_12.task4_tets_comparison;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> map = new HashMap<>();

    public Map<Movie, List<Rating<T>>> getMap() {
        return map;
    }

    public synchronized boolean addGrade(String title, T rating) {
        if (rating.doubleValue() < 0 || rating.doubleValue() > 10) return false;

        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            if (!map.containsKey(new Movie(title))) {
                System.out.println("Movie is not in library");
                return false;
            }

            if (entry.getKey().getTitle().equals(title)) {
                map.get(entry.getKey()).add(new Rating<>(rating));
            }

        }
        return true;
    }

    public synchronized double average(String title) {
        double sum = 0;
        double counter = 0;

        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            if (entry.getKey().getTitle().equals(title)) {
                for (Rating<T> rating : entry.getValue()) {
                    sum += rating.getRating().doubleValue();
                    counter++;
                }
            }
        }
        double average = sum / counter;
        return average;
//
//        List<Rating<T>> list = new ArrayList<>();
//
//        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
//            if (entry.getKey().getTitle().equals(title)){
//                list = entry.getValue();
//            }
//        }
//
//        return list.stream()
//                .mapToDouble(e -> e.getRating().doubleValue())
//                .average()
//                .getAsDouble();
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
            double average = sum / counter;
            hashMap.put(entry.getKey(), average);
            sum = 0;
            counter = 0;
        }
        return hashMap.entrySet().stream()
                .sorted(Map.Entry.<Movie, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (e1, e2) -> e1, () -> new LinkedHashMap<>()));


    }

    public synchronized TreeMap<Movie, List<Rating<T>>> sortByTitle() {
        TreeMap<Movie, List<Rating<T>>> treeMap = new TreeMap<>(Comparator.comparing(Movie::getTitle));

        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }

        return treeMap;

    }

    public synchronized LinkedHashMap<Movie, Double> sortByAverageRatingWithoutStreamAPI() {
        Map<Movie, Double> hashMap = new LinkedHashMap<>();

        double sum = 0;
        double counter = 0;
        for (Map.Entry<Movie, List<Rating<T>>> entry : map.entrySet()) {
            for (Rating<T> rating : entry.getValue()) {
                sum += rating.getRating().doubleValue();
                counter++;
            }
            double average = sum / counter;
            hashMap.put(entry.getKey(), average);
            sum = 0;
            counter = 0;
        }

        List<Map.Entry<Movie, Double>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.<Movie, Double>comparingByValue().reversed());

        LinkedHashMap<Movie, Double> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Movie, Double> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        return linkedHashMap;
    }


    public synchronized void addMovie(String title) {
        if (map.containsKey(new Movie(title))) {
            System.out.println("Movie is already in library");
        } else {
            map.putIfAbsent(new Movie(title), new ArrayList<>());
            System.out.println("Movie " + title + " has been added to library");
        }
    }


}