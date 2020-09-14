package Tasks.Module_1_6.creational.abstractfactory;

import Tasks.Module_1_6.creational.abstractfactory.street.StreetAnimalFactory;

public class StreetTeam {
    public static void main(String[] args) {
        AnimalTeamFactory animalTeamFactory = new StreetAnimalFactory();
        Cat cat = animalTeamFactory.getCat();
        Dog dog = animalTeamFactory.getDog();
        Parrot parrot = animalTeamFactory.getParrot();

        System.out.println("Animal now:");
        dog.play();
        cat.sleep();
        parrot.fly();
    }
}
