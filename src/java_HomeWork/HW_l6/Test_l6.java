package java_HomeWork.HW_l6;

public class Test_l6 {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Bobik"), new Dog("Max"), new Dog("Shawarma"), new Dog("Anton")};
        Cat[] cats = {new Cat("Murka"), new Cat("Belyash"), new Cat("Pie"), new Cat("Barsik")};

       animalsTest(dogs, -300, -7);
       animalsTest(cats, -150, -4);

        System.out.println("Animals: " + Dog.animalsCount);
        System.out.println("Dogs: " + Dog.dogsCount);
        System.out.println("Cats: " + Cat.catsCount);
    }

    public static void animalsTest(Animal[] animals, int startRunDistance, int startSwimDistance) {
        int runDistanceStep = -startRunDistance;
        int swimDistanceStep = -startSwimDistance;
        for (Animal animal : animals) {
            animal.run(startRunDistance);
            animal.swim(startSwimDistance);
            startRunDistance += runDistanceStep;
            startSwimDistance += swimDistanceStep;
        }
    }
}
