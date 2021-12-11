package HW7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("A", 5),
                new Cat("B", 6),
                new Cat("C", 7),
                new Cat("D", 8),
                new Cat("E", 9)
        };

        Plate plate = new Plate(20);
        plate.foodInfo();

        // Let's eat
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        // Print info
        plate.foodInfo();

        // Cat's print info
        for (Cat cat : cats) {
            cat.catInfo();
        }

        // add some food
        plate.addFood(20);

        // Let's eat
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        // Cat's print info
        for (Cat cat : cats) {
            cat.catInfo();
        }

    }
}

