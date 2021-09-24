package com.gdstruc.module3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int round = 1;
    int deck = 30;
    int discardPile = 0;

      CardStack stack = new CardStack(31);
      CardStack hand = new CardStack(31);
      CardStack discard = new CardStack(31);

      stack.push(new Card(1, "Nayeon"));
      stack.push(new Card(2, "Jeongyeon"));
      stack.push(new Card(3, "Momo"));
      stack.push(new Card(4, "Sana"));
      stack.push(new Card(5, "Jihyo"));
      stack.push(new Card(6, "Mina"));
      stack.push(new Card(7, "Dahyun"));
      stack.push(new Card(8, "Chaeyoung"));
      stack.push(new Card(9, "Tzuyu"));
      stack.push(new Card(10, "Ryujin"));
      stack.push(new Card(11, "Yeji"));
      stack.push(new Card(12, "Chaeryeong"));
      stack.push(new Card(13, "Lia"));
      stack.push(new Card(14, "Yuna"));
      stack.push(new Card(15, "Naruto"));
      stack.push(new Card(16, "Sasuke"));
      stack.push(new Card(17, "Sakura"));
      stack.push(new Card(18, "Kakashi"));
      stack.push(new Card(19, "Guy"));
      stack.push(new Card(20, "Lee"));
      stack.push(new Card(21, "Tenten"));
      stack.push(new Card(22, "Neji"));
      stack.push(new Card(23, "Hinata"));
      stack.push(new Card(24, "Shino"));
      stack.push(new Card(25, "Kiba"));
      stack.push(new Card(26, "Kurenai"));
      stack.push(new Card(27, "Shikamaru"));
      stack.push(new Card(28, "Choji"));
      stack.push(new Card(29, "Ino"));
      stack.push(new Card(30, "Asuma"));



        System.out.println("Type r to roll: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

     do {

        if (input.equals("r")) {
            System.out.println("Rolling....");

            System.out.println("Round: " + round + "\n");
            int command = (int) (Math.random() * (3 - 1 + 1) + 1);


            if (command == 1 || round == 0) //deck->hand
            {
                int draw = (int) (Math.random() * (5 - 1 + 1) + 1);

                if (draw > 1) {
                    System.out.println("Draw " + draw + " cards");
                } else {
                    System.out.println("Draw " + draw + " card");
                }

                for (int i = 0; i < draw; i++) {
                    hand.push(stack.pop());
                    deck--;
                }

            }
            if (command == 2 && round != 0 && !hand.isEmpty()) //hand->pile
            {
                int draw = (int) (Math.random() * (5 - 1 + 1) + 1);

                if (draw > 1) {
                    System.out.println("Discard " + draw + " cards");
                } else {
                    System.out.println("Discard " + draw + " card");
                }

                for (int i = 0; i < draw; i++) {
                    discard.push(hand.pop());
                    discardPile++;
                    if (hand.isEmpty()) {
                        break;
                    }

                }
            }

            if (command == 3 && round != 0 && !discard.isEmpty())//pile->hand
            {
                int draw = (int) (Math.random() * (5 - 1 + 1) + 1);

                if (draw > 1) {
                    System.out.println("Draw " + draw + " cards");
                } else {
                    System.out.println("Draw " + draw + " card");
                }

                for (int i = 0; i < draw; i++) {
                    hand.push(discard.pop());
                    discardPile--;
                    if (discard.isEmpty()) {
                        break;
                    }
                }

            }
            round++;

            System.out.println("Number of cards in deck: " + deck + "\n");
            System.out.println(" Hand Cards:  ");
            hand.printStack();
            System.out.println("\n Discarded Cards:  " + discardPile);

            System.out.println("\nType r to roll: ");


        }else System.out.println("Invalid input: " + input);
         input = scanner.nextLine();
     }while (!stack.isEmpty() || input.equals("r")) ;

    }

}

