public class Monster {
    private int health;
    private int strength;

    public Monster(int health, int strength) {
        this.health=health;
        this.strength=strength;

    }

    public int getHealthMonster() {
        return health;
    }
    public void setHealthMonster(int newHealth){
        health=newHealth;
    }
    public int attackMonster(int playerHp){
        playerHp-=strength;
        return playerHp;
    }
}
