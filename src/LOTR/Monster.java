package LOTR;



public class Monster {
    private String name;
    private int hp;
    private int expToGive;
    private int attack;

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Hp: " + hp);
        System.out.println("Attack: " + attack);
    }

    public Monster(String name, int hp, int expToGive, int attack) {
        this.name = name;
        this.hp = hp;
        this.expToGive = expToGive;
        this.attack = attack;
    }

    public static class MonsterFactory{

        public static Monster createOrk(){
            return new Monster("Ork", 10,20,5);
        }

    }

}
