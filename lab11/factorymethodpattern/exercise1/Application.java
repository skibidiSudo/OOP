package hus.oop.lab11.factorymethodpattern.exercise1;

public class Application {
    private Dialog dialog;

    public void initialize(String type) throws Exception {
        if (type.equals("Windows")) {
            dialog = new WindowDialog();
        } else if (type.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error!");
        }
    }

    public void create(String type) throws Exception{
        this.initialize(type);
        dialog.render();
    }
}
