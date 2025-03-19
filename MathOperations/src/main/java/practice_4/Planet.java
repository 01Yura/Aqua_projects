package practice_4;

enum Planet {
    MERCURY(1, 0.055),
    VENUS(2, 0.815),
    EARTH(3, 1.0),
    MARS(4, 0.107),
    JUPITER(5, 317.8),
    SATURN(6, 95.2),
    URANUS(7, 14.5),
    NEPTUNE(8, 17.1);

//    -      **Меркурий** →  1, 0.055
//            - **Венера** → 2, 0.815
//            - **Земля** →  3, 1.0
//            - **Марс** →   4, 0.107
//            - **Юпитер** → 5, 317.8
//            - **Сатурн** → 6, 95.2
//            - **Уран** →   7, 14.5
//            - **Нептун** → 8, 17.1

    int order;
    double mass;

    Planet(int order, double mass) {
        this.order = order;
        this.mass = mass;
    }

    void printInfo() {
        System.out.println("Ordinal number: " + this.order);
        System.out.println("Mass relative to Earth: " + this.mass);

    }


}


