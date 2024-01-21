public class Player {
    private int health;
    private String liveStatus;
    public Player() {
        this.health = 1000;
        this.liveStatus = "Alive";
    }

    public int getHealth() {
        return health;
    }

    public String getStatus() {
        return liveStatus;
    }
}
