package Tasks.Module_1_6.creational.builder;

public abstract class FlavorBuilder {
    Flavor flavor;

    void createFlavor(){
        flavor = new Flavor();
    }

    abstract void buildName();
    abstract void buildFlower();
    abstract void buildCount();
    abstract void buildPrice();

    Flavor getFlavor(){
        return flavor;
    }
}
