public class Player {
    private int health;

    private boolean alive;

    public Player() {
        this.health = 1000;
        this.alive = true;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void setAlive(boolean liveStatus) {
        this.alive = liveStatus;
    }

}
