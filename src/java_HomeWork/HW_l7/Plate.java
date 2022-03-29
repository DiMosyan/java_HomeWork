package java_HomeWork.HW_l7;

public class Plate {

    private int food;

    public Plate(int food) {
        if(food < 0) {
            System.out.println("Incorrect value. Count of food = 0");
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public void info() {
        System.out.println("Count of food - " + food);
    }

    public boolean decreaseFood(int count) {
        if(food < count) {
            System.out.println("Can't take more");
            return false;
        } else {
            food -= count;
            return true;
        }
    }

    public void pullPlate(int count) {
        if(food + count < 0) {
            System.out.println("Can't take more. Plate is empty");
            food = 0;
        } else {
            food += count;
        }
    }
}
