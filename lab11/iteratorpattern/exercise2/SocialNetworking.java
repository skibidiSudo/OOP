package hus.oop.lab11.iteratorpattern.exercise2;

public interface SocialNetworking {
    void addProfile(String type, Profile profile);

    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkerIterator(String profileId);
}
