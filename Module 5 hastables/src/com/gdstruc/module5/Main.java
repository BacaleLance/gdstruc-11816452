package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player yeji = new Player(152, "Yedong", 24 );
        Player lia = new Player(823, "Liaia", 101 );
        Player ryujin = new Player(9999, "Ryudeong", 290 );
        Player chaeryeong = new Player(293, "Chaechae", 53 );
        Player yuna = new Player(453, "Hussey", 84 );

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(yeji.getUserName(),yeji);
        hashtable.put(lia.getUserName(),lia);
        hashtable.put(ryujin.getUserName(),ryujin);
        hashtable.put(chaeryeong.getUserName(),chaeryeong);
        hashtable.put(yuna.getUserName(),yuna);

        System.out.println("Before remove: ");
        hashtable.printHashtable();

        System.out.println(hashtable.remove("Yedong"));

        System.out.println("After remove: ");
        hashtable.printHashtable();



    }
}
