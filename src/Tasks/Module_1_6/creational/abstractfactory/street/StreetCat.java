package Tasks.Module_1_6.creational.abstractfactory.street;

import Tasks.Module_1_6.creational.abstractfactory.Cat;

public class StreetCat implements Cat {
    @Override
    public void sleep() {
        System.out.println("Street Cat sleep...");
    }
}
