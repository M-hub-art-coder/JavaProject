public class Eagle extends Bird{

    boolean haveHeaters=true;

    boolean fly= true;

    @Override
    public void move() {
        System.out.println("Fly high!");
    }

    @Override
    public void eat() {
        System.out.println("Go hunting!");
    }
}
