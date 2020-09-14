package Tasks.Module_1_6.creational.builder;

public class Director {
    FlavorBuilder builder;

    public void setBuilder(FlavorBuilder builder) {
        this.builder = builder;
    }

    Flavor buildFlavor(){
        builder.createFlavor();
        builder.buildName();
        builder.buildFlower();
        builder.buildCount();
        builder.buildPrice();

        Flavor flavor = builder.getFlavor();
        return flavor;
    }
}
