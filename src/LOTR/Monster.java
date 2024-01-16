package LOTR;


import java.util.ArrayList;
import java.util.Random;

public class Monster extends Character {

    private int expToGive;


    public Monster(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                   int dexterity, int intelligence, int willPower, int attack, int health, int magic, int mana, CharacterProfession profession, int expToGive) {
        super(name, race, weaponSkill, ballisticSkill, strength, resistance, dexterity, intelligence, willPower, 0, attack, health, magic, mana, null, Equipment.goblinEquipment(name));
        this.expToGive = expToGive;
    }

    public static class GoblinFactory {
        public static Monster createGoblinMiner() {
            return new Monster("Goblin Miner", "goblin", 10, 0, 20, 0, 25, 0, 0, 1, 2, 0, 0, null, 10);
        }

        public static Monster createGoblinScout() {
            return new Monster("Goblin Scout", "goblin", 20, 20, 15, 10, 25, 0, 0, 1, 3, 0, 0, null, 15);
        }

        public static Monster createGoblinSkirmisher() {
            return new Monster("Goblin Skirmisher", "goblin", 25, 0, 20, 10, 25, 0, 0, 1, 4, 0, 0, null, 20);
        }

        public static Monster createGoblinWarrior() {
            return new Monster("Goblin Warrior", "goblin", 30, 30, 25, 10, 25, 0, 0, 1, 4, 0, 0, null, 30);
        }

        public static Monster createGoblinSpearman() {
            return new Monster("Goblin Spearman", "goblin", 35, 0, 10, 10, 25, 0, 0, 1, 4, 0, 0, null, 30);
        }

        public static Monster createGoblinArcher() {
            return new Monster("Goblin Archer", "goblin", 10, 35, 10, 10, 25, 0, 0, 1, 4, 0, 0, null, 20);
        }

        public static Monster createGoblinShaman() {
            return new Monster("Goblin Shaman", "goblin", 5, 0, 10, 10, 25, 25, 25, 1, 3, 1, 10, null, 25);
        }

        public static Monster createGoblinDrummer() {
            return new Monster("Goblin Drummer", "goblin", 10, 10, 10, 10, 25, 0, 0, 1, 3, 0, 0, null, 20);
        }

        public static Monster createGoblinChief() {
            return new Monster("Goblin Chief", "goblin", 60, 0, 40, 40, 50, 25, 25, 2, 10, 0, 0, null, 100);
        }

        public static Monster createCaveTroll() {
            return new Monster("Cave Troll", "goblin", 40, 0, 80, 80, 20, 0, 0, 1, 20, 0, 0, null, 100);
        }

    }

    public class OrcFactory {
        public static Monster createOrcWarrior() {
            return new Monster("Orc Warrior", "orc", 30, 10, 35, 15, 20, 0, 0, 1, 4, 0, 0, null, 30);
        }

        public static Monster createOrcArcher() {
            return new Monster("Orc Archer", "orc", 20, 35, 25, 10, 20, 0, 0, 1, 4, 0, 0, null, 25);
        }

        public static Monster createOrcBerserker() {
            return new Monster("Orc Berserker", "orc", 35, 15, 40, 20, 15, 0, 0, 1, 5, 0, 0, null, 35);
        }

        public static Monster createOrcShaman() {
            return new Monster("Orc Shaman", "orc", 15, 25, 20, 25, 25, 30, 30, 1, 3, 1, 10, null, 40);
        }

        public static Monster createOrcChieftain() {
            return new Monster("Orc Chieftain", "orc", 40, 20, 45, 25, 30, 0, 0, 2, 6, 0, 0, null, 50);
        }

        public static Monster createOrcAssassin() {
            return new Monster("Orc Assassin", "orc", 25, 40, 30, 15, 25, 0, 0, 1, 5, 0, 0, null, 45);
        }

        public static Monster createOrcDefender() {
            return new Monster("Orc Defender", "orc", 40, 10, 50, 30, 15, 0, 0, 1, 5, 0, 0, null, 40);
        }

        public static Monster createOrcSorcerer() {
            return new Monster("Orc Sorcerer", "orc", 10, 30, 15, 40, 40, 40, 40, 1, 4, 3, 20, null, 60);
        }

        public static Monster createOrcSniper() {
            return new Monster("Orc Sniper", "orc", 15, 50, 20, 10, 30, 0, 0, 1, 6, 0, 0, null, 55);
        }

        public static Monster createOrcExecutioner() {
            return new Monster("Orc Executioner", "orc", 50, 20, 60, 25, 20, 0, 0, 2, 7, 0, 0, null, 70);
        }

    }


    public static class EnemyGroupGenerator {

        public static ArrayList<Monster> generateGroupOfGoblins(int minEnemies, int maxEnemies) {
            Random random = new Random();
            int enemyAmount = random.nextInt(maxEnemies - minEnemies + 1) + minEnemies;

            ArrayList<Monster> generatedGroupOfGoblin = new ArrayList<>();

            for (int i = 0; i < enemyAmount; i++) {
                int randomEnemy = random.nextInt(8) + 1;
                switch (randomEnemy) {
                    case 1 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinMiner());
                    case 2 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinScout());
                    case 3 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinSkirmisher());
                    case 4 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinWarrior());
                    case 5 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinSpearman());
                    case 6 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinArcher());
                    case 7 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinShaman());
                    case 8 -> generatedGroupOfGoblin.add(GoblinFactory.createGoblinDrummer());
                    default -> throw new IllegalStateException("Unexpected value: " + randomEnemy);
                }
            }

            return generatedGroupOfGoblin;
        }

        public static ArrayList<Monster> generateSmallGroupOfGoblin() {
            return generateGroupOfGoblins(1, 5);
        }

        public static ArrayList<Monster> generateMediumGroupOfGoblin() {
            return generateGroupOfGoblins(6, 8);
        }

        public static ArrayList<Monster> generateBigGroupOfGoblin() {
            return generateGroupOfGoblins(9, 10);
        }

        public static ArrayList<Monster> generateVeryBigGroupOfGoblin() {
            return generateGroupOfGoblins(11, 15);
        }





        public static ArrayList<Monster> generateGroupOfOrcs(int minEnemies, int maxEnemies) {
            Random random = new Random();
            int enemyAmount = random.nextInt(maxEnemies - minEnemies + 1) + minEnemies;

            ArrayList<Monster> generatedGroupOfOrcs = new ArrayList<>();

            for (int i = 0; i < enemyAmount; i++) {
                int randomOrc = random.nextInt(10) + 1;
                switch (randomOrc) {
                    case 1 -> generatedGroupOfOrcs.add(OrcFactory.createOrcWarrior());
                    case 2 -> generatedGroupOfOrcs.add(OrcFactory.createOrcArcher());
                    case 3 -> generatedGroupOfOrcs.add(OrcFactory.createOrcBerserker());
                    case 4 -> generatedGroupOfOrcs.add(OrcFactory.createOrcShaman());
                    case 5 -> generatedGroupOfOrcs.add(OrcFactory.createOrcChieftain());
                    case 6 -> generatedGroupOfOrcs.add(OrcFactory.createOrcAssassin());
                    case 7 -> generatedGroupOfOrcs.add(OrcFactory.createOrcDefender());
                    case 8 -> generatedGroupOfOrcs.add(OrcFactory.createOrcSorcerer());
                    case 9 -> generatedGroupOfOrcs.add(OrcFactory.createOrcSniper());
                    case 10 -> generatedGroupOfOrcs.add(OrcFactory.createOrcExecutioner());
                    default -> throw new IllegalStateException("Unexpected value: " + randomOrc);
                }
            }

            return generatedGroupOfOrcs;
        }

        public static ArrayList<Monster> generateSmallOrcGroup() {
            return generateGroupOfOrcs(1, 5);
        }

        public static ArrayList<Monster> generateMediumOrcGroup() {
            return generateGroupOfOrcs(6, 8);
        }

        public static ArrayList<Monster> generateBigOrcGroup() {
            return generateGroupOfOrcs(9, 10);
        }

        public static ArrayList<Monster> generateVeryBigOrcGroup() {
            return generateGroupOfOrcs(11, 15);
        }


    }


    public int getExpToGive() {
        return expToGive;
    }

    public void setExpToGive(int expToGive) {
        this.expToGive = expToGive;
    }
}
