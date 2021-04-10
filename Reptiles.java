public class Reptiles implements Animal {

    @Override
    public void move() {
        System.out.println("Walk");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat!");
    }
}
