public class Main {
    public static void main(String[] args) {
        Player gamer= new Player("Patryk", 100);
        Monster monster= new Monster(100, 30);
        while (gamer.getHealthPlayer()>0 && monster.getHealthMonster()>0) {
            monster.setHealthMonster(gamer.attackPlayer(monster.getHealthMonster()));
            System.out.println(gamer.getName()+ " is attacking");
            if(monster.getHealthMonster()<0){
                monster.setHealthMonster(0);
                System.out.println("Monster have now: " + monster.getHealthMonster() + "hp");
                System.out.println("Monster died and Player won battle");
                break;
            }
            System.out.println("Monster have now: " + monster.getHealthMonster() + "hp");
            gamer.setHealthPlayer(monster.attackMonster(gamer.getHealthPlayer()));
            if(gamer.getHealthPlayer()<0){
                gamer.setHealthPlayer(0);
                System.out.println(gamer.getName()+" have now: " + gamer.getHealthPlayer() + "hp");
                System.out.println(gamer.getName()+" died and Monster won battle");
                break;
            }
            System.out.println(gamer.getName()+" have now: " + gamer.getHealthPlayer() + "hp");
        }
        }

    }