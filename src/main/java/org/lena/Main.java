package org.lena;

public class Main {
    public static void main(String[] args) {
        Game game = new Platformer("Rocks", DifficultyLevel.EASY, 1, "To Heaven's Gate");
        System.out.println(game);
    }
}