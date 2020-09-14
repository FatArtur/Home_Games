package Tasks.Module_1_6.structural.bridge;

public class ShcoolMenu extends FoodMenu{
    protected ShcoolMenu(Cook cook) {
        super(cook);
    }

    @Override
    public void cookFoodMenu() {
        System.out.print("SchoolMenu...");
        cook.cookFood();
    }
}
