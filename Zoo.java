public class Zoo {

    private Animal[] animals;

    public Zoo(int maxAnimalCount){
        animals= new Animal[maxAnimalCount];
    }

    public boolean addAnimal(Animal a){
        for(int i=0; i<animals.length; i++){
            if(animals[i] == null){
                animals[i]= a;

                return true;
            }
        }
        return false;

    }

    public boolean petTheAnimal(Animal b) {
        if (b instanceof Cobra || b instanceof Fish || b instanceof Eagle) {
            System.out.println("Don't touch!");
            return false;

        } else {

            System.out.println("I like it!");

        }
        return true;
    }
}
