package com.gdstruc.module4;

import java.util.Objects;

public class Player {

    private int playerId;
    private int level;

    public Player(int playerId, int level) {
        this.playerId = playerId;
        this.level = level;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerId == player.playerId &&
                level == player.level;
    }

    @Override
    public int hashCode() {return Objects.hash(playerId, level); }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +

                ", level=" + level +
                "}";
    }
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
