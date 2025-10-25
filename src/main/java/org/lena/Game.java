package org.lena;

public abstract class Game {
    private String name;
    private int amountOfPlayers;
    private DifficultyLevel difficultyLevel;

    public Game(DifficultyLevel difficultyLevel, int amountOfPlayers, String name) {
        this.difficultyLevel = difficultyLevel;
        this.amountOfPlayers = amountOfPlayers;
        this.name = name;
    }

    public Game() {

    }

    abstract void printIntroMessage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    public void setAmountOfPlayers(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
