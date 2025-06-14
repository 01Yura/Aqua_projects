package no_bugs.homework_1.pet_package;

public class Main {
    public static void main(String[] args) {
        PetHotel myPetHotel = new PetHotel();
        Dog myDog = new Dog("Dog Sharik");
        Cat myCat = new Cat("Cat Murzik");
        myPetHotel.addPet(myDog);
        myPetHotel.addPet(myCat);
        myPetHotel.feed(myCat);
        myPetHotel.walk(myDog);
        myPetHotel.play(myCat);

    }
}
