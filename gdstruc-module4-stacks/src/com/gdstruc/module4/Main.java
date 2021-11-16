package com.gdstruc.module4;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(9);


        queue.add(new Player(1,  14));
        queue.add(new Player(2,  21));
        queue.add(new Player(3,  32));
        queue.add(new Player(4,  10));
        queue.add(new Player(5,  31));
        queue.add(new Player(6,  25));
        queue.add(new Player(7,  55));
        queue.add(new Player(8, 4));
        queue.add(new Player(9,  60));


        System.out.println("Press enter to roll: ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int round = 1;
        int playerCounter = 0;

        while(round != 11 && input != null)
        {
            int playerpick = (int) (Math.random() * (7 - 1 + 1) + 1);

                System.out.println("Number of players in queue: " + playerpick);

            if (playerpick >= 5)
            {

                System.out.println("Game: " + round);

                for (int i = 0; i < 5; i++)
                {
                    int playerAdd = (int) (Math.random() * (30 - 1 + 1) + 1);
                    int playerLevel = (int) (Math.random() * (100 - 1 + 1) + 1);

                    queue.add(new Player(playerAdd, playerLevel));

                    System.out.println(queue.remove());
                }
                round++;
            }  else
                    {
                        System.out.println("Not enough players roll again! ");
                    }

           input = scanner.nextLine();

        }

    }
}
