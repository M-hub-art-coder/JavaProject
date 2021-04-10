public class Fish implements Animal{

    String kindOfFish;


    @Override
    public void move() {
        System.out.println("Swim");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}
