package org.lena;

import java.util.Scanner;

public class MainMenuService {
    static void printMainMenu() {
        int amountToCreate;
        System.out.println("Welcome to the game generator application!\nWhat would you like to create today?\n---------------------------------" );
        System.out.println("1. Create a new platformer game.\n2. Create a new shooter game.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("How many platformer games do you want to create?");
                break;
            }
            case 2: {
                System.out.println("How many shooter games do you want to create?");
                break;
            }
            default:{
                System.out.println("Invalid choice.");
                break;
            }
        }
    }
}
