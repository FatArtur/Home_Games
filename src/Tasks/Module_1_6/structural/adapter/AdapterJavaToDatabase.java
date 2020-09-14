package Tasks.Module_1_6.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void insert() {
        saveOject();
    }

    @Override
    public void update() {
        updateOject();
    }

    @Override
    public void select() {
        loadOject();
    }

    @Override
    public void remove() {
        deleteOject();
    }
}
