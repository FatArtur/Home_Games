package Tasks.Module_1_6.creational.factory;

public class DogAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
