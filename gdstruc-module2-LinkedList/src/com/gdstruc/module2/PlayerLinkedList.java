package com.gdstruc.module2;

public class PlayerLinkedList {
    public PlayerNode head;

    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current.getPlayer().toString());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removeFirstElement(){

        head = head.getNextPlayer();

    }

    public void elementCounter(){
        int counter = 0;
        PlayerNode current = head;
        while (current != null)
        {
            current = current.getNextPlayer();
            counter++;
        }
        System.out.println("Total Elements: " + counter);

    }

    public void elementSearch(String player){
        PlayerNode current = head;
         String name;

        while (current != null){
            name = current.getPlayer().getName();
            current = current.getNextPlayer();
           System.out.println(name.contains(player));
           System.out.println(name.indexOf(player));
        }

    }
}
