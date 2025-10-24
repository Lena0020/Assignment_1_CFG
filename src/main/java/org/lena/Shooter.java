package org.lena;

public class Shooter extends Game {
    String enemyName;

    public Shooter(String enemyName,DifficultyLevel difficultyLevel, int amountOfPlayers, String name) {
        super(difficultyLevel, amountOfPlayers, name);
        this.enemyName = enemyName;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
    @Override
    public String toString() {
        return "Shooter {" +
                "name='" + this.getName() + '\'' +
                ", players=" + this.getAmountOfPlayers() +
                ", difficulty=" + this.getDifficultyLevel() +
                ", obstacle='" + this.enemyName + '\'' +
                '}';
    }
}
