package org.cis120;

/**
 * Holds individual client data (ID, nickname).
 */
public class Client implements Comparable<Client> {
    private int id;
    private String nickname;

    public Client(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public int getId() {
        return this.id;
    }

    public String getNickname() {
        return this.nickname;
    }

    /**
     * Clients are equal if they share the same ID.
     */
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself, return true
        if (o == this) {
            return true;
        }

        // If o is not an instance of Client, return false
        if (!(o instanceof Client)) {
            return false;
        }

        // typecast o to Client so that we can compare data members
        Client c = (Client) o;

        // check if clients share the same ID
        return (this.id == c.getId());
    }

    @Override
    public int compareTo(Client c) {
        if (this.id > c.getId()) {
            return 1;
        } else if (this.id < c.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
