public class Pinguin extends Bird{

    boolean fly= false;

    @Override
    public void eat() {
        System.out.println("Eat fish");

    }

    @Override
    public void move() {
        System.out.println("Walk and swim.");
    }
}
