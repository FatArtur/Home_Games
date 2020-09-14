package Tasks.Module_1_6.structural.composite;

import java.util.ArrayList;

public class Team {
    private ArrayList<Animal> animals= new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public void songAnimals(){
        System.out.println("Animals Song...");
        for (Animal animal: animals) {
            animal.say();
        }
    }

}
