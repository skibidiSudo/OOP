package hus.oop.lab11.iteratorpattern.exercise2;

import java.util.List;

public class Facebook implements SocialNetworking {
    private List<Profile> friends;
    private List<Profile> coworkers;

    public Facebook(List<Profile> friends, List<Profile> coworkers) {
        this.friends = friends;
        this.coworkers = coworkers;
    }

    @Override
    public void addProfile(String type, Profile profile) {
        if (type.equals("friends")) {
            friends.add(profile);
        } else if (type.equals("coworkers")) {
            coworkers.add(profile);
        }
    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        if (type.equals("friends")) {
            return friends.toArray(new Profile[0]);
        } else if (type.equals("coworkers")) {
            return coworkers.toArray(new Profile[0]);
        }
        return new Profile[0];
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkerIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
