package com.LanceMarcusIvoBacale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name?");
        String name = scanner.nextLine();

        System.out.println("Helllo " + name);
    }
}
