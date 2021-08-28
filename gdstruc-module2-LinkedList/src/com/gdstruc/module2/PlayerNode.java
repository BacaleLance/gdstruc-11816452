package com.gdstruc.module2;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;
    private PlayerNode firstElement;

    public PlayerNode getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(PlayerNode firstElement) {
        this.firstElement = firstElement;
    }

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
