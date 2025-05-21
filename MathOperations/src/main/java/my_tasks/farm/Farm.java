package my_tasks.farm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Farm<T extends Animal> {
    List<T> list;

    public Farm() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public boolean addAnimal(T animal) {
        return list.add(animal);
    }

    public void feedAnimal(String species) {
        for (T element : list) {
            if (species.equals(element.getClass().getSimpleName())) {
                System.out.println("We are feeding the " + element.getClass().getSimpleName() + " " + element.name);
                element.eat();
            }
        }
    }

    public void makeSomeSound(String species) {
        for (T element : list) {
            if (species.equals(element.getClass().getSimpleName())) {
                element.makeSound();
            }
        }
    }

    public void feedAnimal(Food food) throws NonexistingAnimalException {
        boolean flag = false;
        for (T element : list) {
            if (element.food.toString().equals(food.toString())) {
                System.out.println("We are feeding the " + element.getClass().getSimpleName() + " " + element.name);
                element.eat();
                flag = true;
            }
        }
        if (!flag) {
            throw new NonexistingAnimalException("Animal which eats this food is not in our farm");
        }
    }

    public void sortByAge() {
        list.stream().sorted(Comparator.comparing(Animal::getAge)).forEach(System.out::println);
    }

    public void filterByAge(int max) {
        list.stream().filter(t -> t.age <= max).forEach(System.out::println);
    }


}
