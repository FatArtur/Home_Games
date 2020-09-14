package Tasks.Module_1_6.creational.abstractfactory.home;

import Tasks.Module_1_6.creational.abstractfactory.AnimalTeamFactory;
import Tasks.Module_1_6.creational.abstractfactory.Cat;
import Tasks.Module_1_6.creational.abstractfactory.Dog;
import Tasks.Module_1_6.creational.abstractfactory.Parrot;

public class HomeAnimalTeamFactory implements AnimalTeamFactory {
    @Override
    public Cat getCat() {
        return new HomeCat();
    }

    @Override
    public Dog getDog() {
        return new HomeDog();
    }

    @Override
    public Parrot getParrot() {
        return new HomeParrot();
    }
}
