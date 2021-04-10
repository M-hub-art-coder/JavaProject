public abstract class Human extends Mammal {

    @Override
    public void move() {
        System.out.println("Walk, run, jump, swim");
    }

    public void talk(){
        System.out.println("Say something");
    }
    public void laugh(){
        System.out.println("Ha ha  ha");
    }
}
