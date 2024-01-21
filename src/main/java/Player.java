public class Player {
    private int health;

    private boolean alive;

    public Player() {
        this.health = 1000;
        this.alive = true;
    }
    public void makeDamage(Player attacker, Player victim, int damage) {
        int healthLeft;
        if (attacker.equals(victim)){
            healthLeft = victim.getHealth();
        }
        else {
            healthLeft = victim.getHealth() - damage;
        }

        victim.setHealth(healthLeft);
        if (victim.getHealth() <= 0){
            victim.setAlive(false);
            victim.setHealth(0);
        }
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
