package org.lena;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int scanInt() {
        int number;
        while (true) {
            try {
                number = sc.nextInt();
                sc.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }

    public static String scanString() {
        return sc.nextLine().trim();
    }

    public static DifficultyLevel scanDifficultyLevel() {
        DifficultyLevel difficultyLevel;
        while (true) {
            try {
                difficultyLevel = DifficultyLevel.values()[scanInt()];
                return difficultyLevel;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input.");
            }
        }
    }
}
