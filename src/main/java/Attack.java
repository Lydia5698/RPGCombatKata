public class Attack {

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

    public void heal(Attack healer, Attack receiver, int i) {
    }
}
