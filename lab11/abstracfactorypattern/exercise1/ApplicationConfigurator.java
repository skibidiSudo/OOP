package hus.oop.lab11.abstracfactorypattern.exercise1;

import java.util.Scanner;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GUIFactory factory;

        System.out.print("Enter operating system: ");
        String type = sc.next();

        if (type.equals("Window")) {
            factory = new WinFactory();
        } else if (type.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error!");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
