
public class Main {
    public static void main(String[] args) {

        Cobra c = new Cobra();
        c.move();
        c.eat();

        System.out.println("------------------------");

        Animal[] flyingAnimals={
                new flyingFish(),
               new Bat() ,
               new Eagle()

        };
        for(int i=0; i<flyingAnimals.length; i++){
            flyingAnimals[i].move();

        }

        System.out.println("----------------------");

        Animal[] swimmingAnimals={
                new Dolphin() ,
                new GuppyFish(),
                new Pinguin()
        };

        for(int j=0; j<swimmingAnimals.length; j++){
            swimmingAnimals[j].move();
        }

        System.out.println("----------------------------");

        Zoo z= new Zoo(10);
        z.addAnimal(new Pinguin());
        z.addAnimal(new GuppyFish());
        z.addAnimal(new Eagle());
        z.addAnimal(new flyingFish());
        z.addAnimal(new Dolphin());
        z.addAnimal(new Turtle());
        z.addAnimal(new Cobra());

        z.petTheAnimal(new Cobra());
        z.petTheAnimal(new Dolphin());

    }
}