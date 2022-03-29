package java_HomeWork.HW_l7;

public class Test {
    public static void main(String[] args) {
        play();
    }

    private static void play() {
        Cat[] cats = new Cat[] {new Cat("Shawarma", (int) (Math.random() * 10)), new Cat("Pie", (int) (Math.random() * 10)), new Cat("Belyash", (int) (Math.random() * 10))};
        Plate plate = new Plate((int) (Math.random() * 20));

        for(Cat cat : cats) {
            cat.eat(plate);
            cat.printIsFull();
        }

        plate.info();
        plate.pullPlate((int) (Math.random() * 20));
        plate.info();
    }
}
