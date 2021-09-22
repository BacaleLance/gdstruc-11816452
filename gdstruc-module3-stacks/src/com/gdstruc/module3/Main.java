package com.gdstruc.module3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int round = 0;

      CardStack stack = new CardStack(31);

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

     // stack.printStack();
    //stack.printDrawStack();

        System.out.println("Type r to roll: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

     do {

        input = scanner.nextLine();
        System.out.println("You have entered: " + input);

         int command = (int)(Math.random()* (2-1 + 1)+1);
         System.out.println(command);

          if (command == 1 || round == 0)
          {
              int draw = (int)(Math.random()* (5-1 + 1)+1);
              System.out.println(draw);
              for (int i = 0; i < draw; i++)
              {
                  stack.drawCard();
                  //stack.pop();
              }

          }
          if (command == 2 && round != 0)
          {
              int draw = (int)(Math.random()* (5-1 + 1)+1);
              System.out.println(draw);
              for (int i = 0; i < draw; i++)
              {
                  stack.discardCard();

              }
          }
            round++;

     }while (!stack.isEmpty() && input.equals("r"));

    }
}
