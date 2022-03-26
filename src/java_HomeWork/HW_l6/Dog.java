package java_HomeWork.HW_l6;

public class Dog extends Animal{

    public static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int distance) {
        if(isNegative(distance)) return;
        if(distance > 500) {
            System.out.println(name + " ran 500 m. and got tired");
        } else {
            System.out.println(name + " ran " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        if(isNegative(distance)) return;
        if(distance > 10) {
            System.out.println(name + " swam 10 m. and drowned");
        } else {
            System.out.println(name + " swam " + distance + " m.");
        }
    }
}
