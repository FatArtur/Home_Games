package Tasks.Module_1_6.creational.factory;

public class CatAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
