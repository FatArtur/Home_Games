package Tasks.Module_1_6.creational.abstractfactory;

import Tasks.Module_1_6.creational.abstractfactory.home.HomeAnimalTeamFactory;

public class HomeTeam {
    public static void main(String[] args) {
        AnimalTeamFactory animalTeamFactory = new HomeAnimalTeamFactory();
        Cat cat = animalTeamFactory.getCat();
        Dog dog = animalTeamFactory.getDog();
        Parrot parrot = animalTeamFactory.getParrot();

        System.out.println("Animal now:");
        cat.sleep();
        dog.play();
        parrot.fly();
    }
}
