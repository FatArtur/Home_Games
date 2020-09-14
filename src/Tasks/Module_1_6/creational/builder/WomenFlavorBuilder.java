package Tasks.Module_1_6.creational.builder;

public class WomenFlavorBuilder extends FlavorBuilder{
    @Override
    void buildName() {
        flavor.setName("WomenFlavor");
    }

    @Override
    void buildFlower() {
        flavor.setFlower(Flower.ROSE);
    }

    @Override
    void buildCount() {
        flavor.setCount(55);
    }

    @Override
    void buildPrice() {
        flavor.setPrice(150);
    }
}
