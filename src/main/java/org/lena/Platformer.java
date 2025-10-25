package org.lena;

public class Platformer extends Game {
    private String obstacleName;

    public Platformer(String obstacleName, DifficultyLevel difficultyLevel, int amountOfPlayers, String name) {
        super(difficultyLevel, amountOfPlayers, name);
        this.obstacleName = obstacleName;
    }

    public Platformer() {
    }

    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
    }

    @Override
    public String toString() {
        return "Platformer {" +
                "name='" + this.getName() + '\'' +
                ", players=" + this.getAmountOfPlayers() +
                ", difficulty=" + this.getDifficultyLevel() +
                ", obstacle='" + this.obstacleName + '\'' +
                '}';
    }

    @Override
    void printIntroMessage() {
        System.out.println("Welcome to the " + this.getName() + " Platformer! Your main obstacle would be the " + this.getObstacleName() + "!");
    }
}
