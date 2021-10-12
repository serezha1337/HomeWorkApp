package OOP_7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, 10);
        Cat cat2 = new Cat("Pushok", 4,20);
        Cat[] arrayCats = new Cat[2];
        arrayCats[0] = cat;
        arrayCats[1] = cat2;
        Plate plate = new Plate(50);
        plate.info();
        cat.eat(plate);
        System.out.println(cat.toString());
        plate.addFood(40);
        plate.info();

        for (int i = 0; i < arrayCats.length; i++) {
            arrayCats[i].eat(plate);
            plate.addFood(8);
        }
    }

}
