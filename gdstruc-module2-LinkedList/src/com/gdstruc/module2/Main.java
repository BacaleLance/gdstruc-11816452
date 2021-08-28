package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player astral = new Player(1, "Astral",10);
        Player stellar = new Player(2,"Stellar", 45);
        Player ryujin = new Player(3,"Ryujin", 19);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(astral);
        playerLinkedList.addToFront(stellar);
        playerLinkedList.addToFront(ryujin);

        playerLinkedList.printList();
    }
}
