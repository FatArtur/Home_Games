package Tasks.Module_1_6.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class HomeAnimalsRunner {
    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<Animal> animals = new ArrayList<>();

        animals.add(animalsFactory.getAnimalForSpecialty("Cat"));
        animals.add(animalsFactory.getAnimalForSpecialty("Cat"));
        animals.add(animalsFactory.getAnimalForSpecialty("Cat"));
        animals.add(animalsFactory.getAnimalForSpecialty("Cat"));
        animals.add(animalsFactory.getAnimalForSpecialty("Cat"));
        animals.add(animalsFactory.getAnimalForSpecialty("Dog"));
        animals.add(animalsFactory.getAnimalForSpecialty("Dog"));
        animals.add(animalsFactory.getAnimalForSpecialty("Dog"));
        animals.add(animalsFactory.getAnimalForSpecialty("Dog"));

        for (Animal animal: animals) {
            animal.say();
            System.out.println(animal);
        }
    }
}
