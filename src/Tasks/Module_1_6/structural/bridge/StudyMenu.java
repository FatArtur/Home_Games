package Tasks.Module_1_6.structural.bridge;

public class StudyMenu extends FoodMenu{
    protected StudyMenu(Cook cook) {
        super(cook);
    }

    @Override
    public void cookFoodMenu() {
        System.out.print("Study menu...");
        cook.cookFood();
    }
}
