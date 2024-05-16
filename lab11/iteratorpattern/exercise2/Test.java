package hus.oop.lab11.iteratorpattern.exercise2;

public class Test {
    public static void main(String[] args) {
        Application app = new Application();
        app.config();

        SocialNetworking facebook = app.networking;
        Profile user = new Profile("0", "user@example.com");

        facebook.addProfile("friends", new Profile("1", "alice@example.com"));
        facebook.addProfile("friends", new Profile("2", "bob@example.com"));
        facebook.addProfile("friends", new Profile("3", "charlie@example.com"));

        facebook.addProfile("coworkers", new Profile("4", "dave@example.com"));
        facebook.addProfile("coworkers", new Profile("5", "eve@example.com"));


        System.out.println("Sending spam to friends:");
        app.sendSpamToFriends(user);

        System.out.println("---");

        System.out.println("Sending spam to coworkers:");
        app.sendSpamToCoworkers(user);
    }
}
