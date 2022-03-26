package java_HomeWork.HW_l6;

public abstract class Animal {

    protected String name;
    public static int animalsCount = 0;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    abstract public void run(int distance);

    abstract public void swim(int distance);

    protected boolean isNegative(int value) {
        if(value <= 0) {
            System.out.println("Incorrect value");
            return true;
        } else return false;
    }
}
