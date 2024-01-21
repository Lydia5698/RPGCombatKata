public class Player {
    private int health;

    private boolean alive;
    private int maxHealth = 1000;

    public Player() {
        this.health = maxHealth;
        this.alive = true;
    }

    public int getHealth() {
        return this.health;
    }

    public void receiveDamage(int damage) {
        health -= damage;

        if (health <= 0){
            health = 0;
            alive = false;
        }
    }

    public void receiveHealing(int healing) {
        health += healing;

        if (health >= maxHealth){
            health = maxHealth;
        }
    }

    public boolean getAlive() {
        return this.alive;
    }

}
