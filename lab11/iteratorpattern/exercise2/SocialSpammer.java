package hus.oop.lab11.iteratorpattern.exercise2;

public class SocialSpammer {
    public void send(ProfileIterator profileIterator, String message){
        while (profileIterator.hasMore()){
            System.out.println(profileIterator.getNext().getEmail() + " " + message);
        }
    }
}
