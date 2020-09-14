package Tasks.Module_1_6.structural.bridge;

public abstract class FoodMenu {
    protected Cook cook;

    protected FoodMenu(Cook cook) {
        this.cook = cook;
    }

    public abstract void cookFoodMenu();
}
