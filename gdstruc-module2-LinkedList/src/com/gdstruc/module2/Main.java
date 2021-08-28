package com.gdstruc.module2;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        Player astral = new Player(1,"Astral",10);
        Player stellar = new Player(2,"Stellar",45);
        Player ryujin = new Player(3,"Ryujin",19);
        Player asdf = new Player(4,"Asdf",19);
        Player asdfg = new Player(5,"Asdfg",19);


        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(astral);
        playerLinkedList.addToFront(stellar);
        playerLinkedList.addToFront(ryujin);
        playerLinkedList.addToFront(asdf);
        playerLinkedList.addToFront(asdfg);


        playerLinkedList.removeFirstElement();
        playerLinkedList.printList();
        playerLinkedList.elementCounter();
        playerLinkedList.elementSearch("Astral");
    }
}
