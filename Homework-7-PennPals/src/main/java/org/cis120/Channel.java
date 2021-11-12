package org.cis120;

import java.util.*;

/**
 * Holds individual channel data (ID, name, owner, users).
 */
public class Channel {
    private int id;
    private String name;
    private Client owner;
    private Collection<Client> users;

    public Channel(int id, String name, Client owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.users = new TreeSet<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Client getOwner() {
        return this.owner;
    }

    public Collection<String> getUserNicknames() {
        // list to hold collection of user nicknames
        Collection<String> userNicknames = new ArrayList<>();

        // iterate over users, adding all nicknames
        for (Client user : users) {
            userNicknames.add(user.getNickname());
        }

        // return list of user nicknames
        return userNicknames;
    }

    public Collection<Integer> getUserIds() {
        // list to hold collection of user nicknames
        Collection<Integer> userIds = new ArrayList<>();

        // iterate over users, adding all nicknames
        for (Client user : users) {
            userIds.add(user.getId());
        }

        // return list of user nicknames
        return userIds;
    }
}
