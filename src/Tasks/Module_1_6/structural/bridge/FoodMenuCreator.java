package Tasks.Module_1_6.structural.bridge;

public class FoodMenuCreator {
    public static void main(String[] args) {
        FoodMenu[] foodMenus = {
                new ShcoolMenu(new WomanCook()),
                new StudyMenu(new ManCook())
        };

        for (FoodMenu foodMenu: foodMenus) {
            foodMenu.cookFoodMenu();
        }

    }
}
