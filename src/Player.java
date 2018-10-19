import java.util.Random;

public class Player {
    private String name;
    private int health;
    private int difficult;

    public Player(String name, int health) {
        this.name=name;
        this.health = health;
    }
    public int attackPlayer(int monsterHp){
        Random rand= new Random();
        int n= rand.nextInt(50)+1;
        monsterHp-=n;
        return monsterHp;
    }
    public int getHealthPlayer(){
        return health;
    }
    public void setHealthPlayer(int newHealth){
        health=newHealth;
    }

    public String getName() {
        return name;
    }
}
