package Tasks.Module_1_6.creational.builder;

public class Flavor {
    private String name;
    private Flower flower;
    private int count;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flavor{" +
                "name='" + name + '\'' +
                ", flower=" + flower +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
