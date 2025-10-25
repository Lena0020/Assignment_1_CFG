package org.lena;

import java.util.ArrayList;
import java.util.List;


public class MainMenuService {
    public void printMainMenu() {
        int choice;
        boolean isDone = false;
        while (!isDone) {
            System.out.println("\n--------------------------------------\nWelcome to the game generator application!\nWhat would you like to create today?\n--------------------------------------");
            System.out.println("1. Create a new platformer game.\n2. Create a new shooter game.\n3. Exit the application.");
            choice = InputUtil.scanInt();
            switch (choice) {
                case 1 -> printPlatformer();
                case 2 -> printShooter();
                case 3 -> isDone = true;
                default -> System.out.println("This value is not on the list yet :)\nTry again.");
            }
        }
    }

    private void printShooter() {
        System.out.println("How many shooter games do you want to create?");
        List<Shooter> shooters = createShooters(InputUtil.scanInt());
        System.out.println("You have created the following shooter games:");
        System.out.println(shooters);
    }

    private void printPlatformer() {
        System.out.println("How many platformer games do you want to create?");
        List<Platformer> platformers = createPlatformers(InputUtil.scanInt());
        System.out.println("You have created the following platformer games:");
        System.out.println(platformers);
    }


    private List<Platformer> createPlatformers(int amountToCreate) {
        System.out.println("You chose to create " + amountToCreate + " platformer/platformers.");
        List<Platformer> platformers = new ArrayList<>();
        for (int i = 0; i < amountToCreate; i++) {
            Platformer platformer = new Platformer();
            System.out.println("--- Platformer " + (i + 1) + " ---");
            System.out.println("Name: ");
            platformer.setName(InputUtil.scanString());
            System.out.println("Difficulty (0 - EASY, 1 - NORMAL, 2 - HARD): ");
            platformer.setDifficultyLevel(InputUtil.scanDifficultyLevel());
            System.out.println("Amount of Players: ");
            platformer.setAmountOfPlayers(InputUtil.scanInt());
            System.out.println("Obstacle: ");
            platformer.setObstacleName(InputUtil.scanString());
            platformer.printIntroMessage();
            platformers.add(platformer);
        }
        return platformers;
    }

    private List<Shooter> createShooters(int amountToCreate) {
        System.out.println("You chose to create " + amountToCreate + " shooter/shooters.");
        List<Shooter> shooters = new ArrayList<>();
        for (int i = 0; i < amountToCreate; i++) {
            Shooter shooter = new Shooter();
            System.out.println("--- Shooter " + (i + 1) + " ---");
            System.out.println("Name: ");
            shooter.setName(InputUtil.scanString());
            System.out.println("Difficulty (0 - EASY, 1 - NORMAL, 2 - HARD): ");
            shooter.setDifficultyLevel(InputUtil.scanDifficultyLevel());
            System.out.println("Amount of Players: ");
            shooter.setAmountOfPlayers(InputUtil.scanInt());
            System.out.println("Enemy: ");
            shooter.setEnemyName(InputUtil.scanString());
            shooter.printIntroMessage();
            shooters.add(shooter);
        }
        return shooters;
    }
}
