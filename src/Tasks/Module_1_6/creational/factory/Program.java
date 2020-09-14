package Tasks.Module_1_6.creational.factory;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalByView("cat");
        Animal animal = animalFactory.createAnimal();

        animal.say();

    }
    static AnimalFactory createAnimalByView(String view){
        if (view.equalsIgnoreCase("Dog")){
            return new DogAnimalFactory();
        } else if (view.equalsIgnoreCase("Cat")) {
            return new CatAnimalFactory();
        } else {
            throw new RuntimeException(view + " is unknown view");
        }
    }
}
