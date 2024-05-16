package hus.oop.lab11.iteratorpattern.exercise2;

import java.util.LinkedList;
import java.util.List;

public class Application {
    SocialNetworking networking;
    SocialSpammer socialSpammer;

    public void config() {
        networking = new Facebook(new LinkedList<>(), new LinkedList<>());
        socialSpammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator profileIterator = networking.createFriendsIterator(profile.getId());
        socialSpammer.send(profileIterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator profileIterator = networking.createCoworkerIterator(profile.getId());
        socialSpammer.send(profileIterator, "Very important message");
    }
}
