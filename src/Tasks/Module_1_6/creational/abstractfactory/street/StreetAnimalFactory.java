package Tasks.Module_1_6.creational.abstractfactory.street;

import Tasks.Module_1_6.creational.abstractfactory.AnimalTeamFactory;
import Tasks.Module_1_6.creational.abstractfactory.Cat;
import Tasks.Module_1_6.creational.abstractfactory.Dog;
import Tasks.Module_1_6.creational.abstractfactory.Parrot;

public class StreetAnimalFactory implements AnimalTeamFactory {
    @Override
    public Cat getCat() {
        return new StreetCat();
    }

    @Override
    public Dog getDog() {
        return new StreetDog();
    }

    @Override
    public Parrot getParrot() {
        return new StreetParrot();
    }
}
