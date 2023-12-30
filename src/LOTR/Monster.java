package LOTR;


import java.util.ArrayList;
import java.util.Random;

public class Monster extends Character {

    private int expToGive;

    public Monster(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                   int dexterity, int intelligence, int willPower, int attack, int health, int magic, int mana, CharacterProfession profession, int expToGive) {
        super(name, race, weaponSkill, ballisticSkill, strength, resistance, dexterity, intelligence, willPower, 0, attack, health, magic, mana, null);
        this.expToGive = expToGive;
    }

    public static class MonsterFactory {
        public static Monster createGoblinMiner(){
            return new Monster("Goblin Miner","goblin",10,0,20,0,25,0,0,1,2,0,0,null,10);
        }

        public static Monster createGoblinScout(){
            return new Monster("Goblin Scout","goblin",20,20,15,10,25,0,0,1,3,0,0,null,15);
        }

        public static Monster createGoblinSkirmisher(){
            return new Monster("Goblin Skirmisher","goblin",25,0,20,10,25,0,0,1,4,0,0,null,20);
        }

        public static Monster createGoblinWarrior(){
            return new Monster("Goblin Warrior","goblin",30,30,25,10,25,0,0,1,4,0,0,null,30);
        }

        public static Monster createGoblinSpearman(){
            return new Monster("Goblin Spearman","goblin",35,0,10,10,25,0,0,1,4,0,0,null,30);
        }

        public static Monster createGoblinArcher(){
            return new Monster("Goblin Archer","goblin",10,35,10,10,25,0,0,1,4,0,0,null,20);
        }

        public static Monster createGoblinShaman(){
            return new Monster("Goblin Shaman","goblin",5,0,10,10,25,25,25,1,3,1,10,null,25);
        }

        public static Monster createGoblinDrummer(){
            return new Monster("Goblin Drummer","goblin",10,10,10,10,25,0,0,1,3,0,0,null,20);
        }

        public static Monster createGoblinChief(){
            return new Monster("Goblin Chief","goblin",60,0,40,40,50,25,25,2,10,0,0,null,100);
        }

        public static Monster createCaveTroll(){
            return new Monster("Cave Troll","goblin",40,0,80,80,20,0,0,1,20,0,0,null,100);
        }

    }



    public static class EnemyGroupGenerator {

        public static ArrayList<Monster> generateGroupOfEnemy(int minEnemies, int maxEnemies) {
            Random random = new Random();
            int enemyAmount = random.nextInt(maxEnemies - minEnemies + 1) + minEnemies;

            ArrayList<Monster> generatedGroupOfEnemy = new ArrayList<>();

            for (int i = 0; i < enemyAmount; i++) {
                int randomEnemy = random.nextInt(8) + 1;
                switch (randomEnemy) {
                    case 1 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinMiner());
                    case 2 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinScout());
                    case 3 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinSkirmisher());
                    case 4 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinWarrior());
                    case 5 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinSpearman());
                    case 6 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinArcher());
                    case 7 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinShaman());
                    case 8 -> generatedGroupOfEnemy.add(MonsterFactory.createGoblinDrummer());
                    default -> throw new IllegalStateException("Unexpected value: " + randomEnemy);
                }
            }

            return generatedGroupOfEnemy;
        }

        public static ArrayList<Monster> generateSmallGroupOfEnemy() {
            return generateGroupOfEnemy(1, 5);
        }

        public static ArrayList<Monster> generateMediumGroupOfEnemy() {
            return generateGroupOfEnemy(6, 8);
        }

        public static ArrayList<Monster> generateBigGroupOfEnemy() {
            return generateGroupOfEnemy(9, 10);
        }

        public static ArrayList<Monster> generateVeryBigGroupOfEnemy() {
            return generateGroupOfEnemy(11, 15);
        }
    }
}
