package Tasks.Module_1_6.creational.builder;

public class BuildFlavorRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SchoolFlavorBuilder());
        Flavor flavor = director.buildFlavor();

        System.out.println(flavor);

    }
}
