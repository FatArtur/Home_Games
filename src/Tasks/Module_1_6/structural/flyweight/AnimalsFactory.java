package Tasks.Module_1_6.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalsFactory {
    private static final Map<String, Animal> animals = new HashMap<>();

    public Animal getAnimalForSpecialty(String specialty){
        Animal animal = animals.get(specialty);

        if (animal == null){
            switch (specialty){
                case "Cat":
                    System.out.println("Add Cat in factory");
                    animal = new Cat();
                    break;
                case "Dog":
                    System.out.println("Add Dog in factory");
                    animal = new Dog();
            }
            animals.put(specialty, animal);
        }
        return animal;
    }
}
