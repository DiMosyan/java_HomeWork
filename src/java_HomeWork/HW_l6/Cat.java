package java_HomeWork.HW_l6;

public class Cat extends Animal{

    public static int catsCount = 0;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if(isNegative(distance)) return;
        if(distance > 200) {
            System.out.println(name + " ran 200 m. and got tired");
        } else {
            System.out.println(name + " ran " + distance + "m.");
        }
    }

    @Override
    public void swim(int distance) {
        if(isNegative(distance)) return;
        System.out.println(name + " can't swim");
    }
}
