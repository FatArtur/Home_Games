package Tasks.Module_1_6.creational.abstractfactory.home;

import Tasks.Module_1_6.creational.abstractfactory.Cat;

public class HomeCat implements Cat {
    @Override
    public void sleep() {
        System.out.println("Home Cat sleep...");
    }
}
