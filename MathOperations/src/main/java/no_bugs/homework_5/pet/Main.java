package no_bugs.homework_5.pet;

public class Main {
    public static void main(String[] args) {
        PetHotel myPetHotel = new PetHotel();
        Dog myDog = new Dog("Dog Sharik");
        Cat myCat = new Cat("Cat Murzik");

        myPetHotel.addPet(myCat);
//        myPetHotel.addPet(myDog);
        System.out.println();

        myPetHotel.walkWithPet();
        System.out.println();

        myPetHotel.feedPet();
        System.out.println();

        myPetHotel.playWithPet();
    }
}
