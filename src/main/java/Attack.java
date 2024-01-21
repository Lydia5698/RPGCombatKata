public class Attack {

    public void makeDamage(Player attacker, Player victim, int damage) {
        if (attacker.equals(victim)){
            victim.receiveDamage(0);
        }
        else {
            victim.receiveDamage(damage);

        }
    }

    public void heal(Player healer, Player receiver, int healing) {
        if (healer.equals(receiver) && receiver.getAlive()){
            receiver.receiveHealing(healing);
        }
    }
}
