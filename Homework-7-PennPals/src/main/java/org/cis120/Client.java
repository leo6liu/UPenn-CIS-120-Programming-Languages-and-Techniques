package org.cis120;

/**
 * Holds individual client data (ID, nickname, channels?).
 */
public class Client {
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
}
