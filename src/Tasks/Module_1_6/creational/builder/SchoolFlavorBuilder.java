package Tasks.Module_1_6.creational.builder;

public class SchoolFlavorBuilder extends FlavorBuilder{
    @Override
    void buildName() {
        flavor.setName("ShcoolFlavor");
    }

    @Override
    void buildFlower() {
        flavor.setFlower(Flower.ASTER);
    }

    @Override
    void buildCount() {
        flavor.setCount(15);
    }

    @Override
    void buildPrice() {
        flavor.setPrice(40);
    }
}
