package java_HomeWork.HW_l7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean isFull = false;

    public void printIsFull() {
        System.out.println(name + " " + isFull);
    }

    public Cat(String name, int appetite) {
        this.name = name;
        if(appetite < 1) {
            System.out.println("Incorrect value. Appetite = 1");
            this.appetite = 1;
        } else {
            this.appetite = appetite;
        }
    }

    public void eat(Plate plate) {
        if(!isFull) {
            isFull = plate.decreaseFood(appetite);
        }
    }
}
