package LOTR;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Character implements Serializable {
    private String name;
    private String race;

    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int resistance;
    private int dexterity;
    private int intelligence;
    private int willPower;
    private int charisma;

    private int attack;
    private int health;
    private int magic;
    private int mana;

    private CharacterProfession profession;

    private Equipment[] equipment;

    private int experience;
    private int level;
    private int levelPointAmount;


//======================================================================================================================

    public static Character createHero() {
        Character hero = StatisticAndProfessionChoice.createCharacter();
        Equipment[] equipment = Equipment.startEquipmentOfHero(hero.profession);
        hero.setEquipment(equipment);
        return hero;
    }

//======================================================================================================================

    // Method for showing hero's stats in a table format
    public void showStats() {
        System.out.println("----------------------------------------");
        System.out.printf("| %-15s | %-18s |%n", "Attribute", "Value");
        System.out.println("----------------------------------------");
        System.out.printf("| %-15s | %-18s |%n", "Name", this.getName());
        System.out.printf("| %-15s | %-18s |%n", "Race", this.getRace());
        System.out.printf("| %-15s | %-18s |%n", "Weapon Skill", this.getWeaponSkill());
        System.out.printf("| %-15s | %-18s |%n", "Ballistic Skill", this.getBallisticSkill());
        System.out.printf("| %-15s | %-18s |%n", "Strength", this.getStrength());
        System.out.printf("| %-15s | %-18s |%n", "Resistance", this.getResistance());
        System.out.printf("| %-15s | %-18s |%n", "Dexterity", this.getDexterity());
        System.out.printf("| %-15s | %-18s |%n", "Intelligence", this.getIntelligence());
        System.out.printf("| %-15s | %-18s |%n", "Will Power", this.getWillPower());
        System.out.printf("| %-15s | %-18s |%n", "Charisma", this.getCharisma());
        System.out.printf("| %-15s | %-18s |%n", "Attack", this.getAttack());
        System.out.printf("| %-15s | %-18s |%n", "Health", this.getHealth());
        System.out.printf("| %-15s | %-18s |%n", "Magic", this.getMagic());
        System.out.printf("| %-15s | %-18s |%n", "Mana", this.getMana());
        System.out.printf("| %-15s | %-18s |%n", "Level", this.getLevel());
        System.out.println("----------------------------------------");


    }

    public static void barStats(Character hero) {
        System.out.println("==========================================" + "\n" +
                "Name: " + hero.name + " The " + hero.race + " | HP: " + hero.health + " | Attack: " + hero.attack + "   |" + "\n" +
                "==========================================");
    }

    //TODO poprawic to bo sie rozjezdza
//======================================================================================================================
    public void takeDamage(int damage) {
        if (damage > 0) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
        }
    }
//======================================================================================================================

    public Character(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                     int dexterity, int intelligence, int willPower, int charisma, int attack, int health, int magic, int mana, CharacterProfession profession, Equipment[] equipment) {
        this.name = name;
        this.race = race;
        this.weaponSkill = weaponSkill;
        this.ballisticSkill = ballisticSkill;
        this.strength = strength;
        this.resistance = resistance;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.willPower = willPower;
        this.charisma = charisma;
        this.attack = attack;
        this.health = health;
        this.magic = magic;
        this.mana = mana;
        this.profession = profession;
        this.equipment = equipment;
        this.experience = 0;
        this.level = 1;
        this.levelPointAmount = 0;
    }

//======================================================================================================================

    public static void checkLevelPossibility(Character hero) {
        if (hero.getExperience() > hero.getLevel() * 500) {
            hero.setLevel(hero.getLevel() + 1);
            hero.setLevelPointAmount((hero.getLevelPointAmount() + 10));
        }
    }

    public static void gainExperience(Character hero, ArrayList<Monster> monsters) {
        int expToGain = 0;
        for (Monster monster : monsters) expToGain += monster.getExpToGive();
        hero.setExperience(expToGain);
    }

    public static void levelRemainder(Character hero) {
        if (hero.getLevelPointAmount() > 0) {
            System.out.println("You have points to spent");
        }

    }

    public static void levelUpStats(Character hero) {
        Scanner scanner = new Scanner(System.in);

        if (hero.getLevelPointAmount() == 0) {
            System.out.println("You have 0 points to spend");
            Character.levelUpMenu(hero);
        } else {
            while (hero.getLevelPointAmount() > 0) {
                System.out.println("These are your statistics:");
                hero.showStats();
                System.out.println("You have " + hero.getLevelPointAmount() + " points to spend");

                System.out.println("Which statistic would you like to develop? ");
                System.out.println("""
                        Basic skills:
                        1. Weapon Skill
                        2. Ballistic Skill 
                        3. Strength
                        4. Resistance
                        5. Dexterity
                        6. Intelligence 
                        7. Willpower
                        8. Charisma
                                            
                        Advanced skills:
                        9. Attack
                        10. Health
                        11. Magic
                        12. Mana\n
                        """);
                System.out.println("Your choice: ");
                int chosenStatistic = scanner.nextInt();

                System.out.println("How many points would you like to spend?");
                System.out.println("Type the amount: ");
                int howManyPoints = scanner.nextInt();

                while (howManyPoints <= 0 || howManyPoints > hero.getLevelPointAmount()) {
                    System.out.println("Type a valid amount");
                    System.out.println("Type the amount: ");
                    howManyPoints = scanner.nextInt();
                }

                updateStatistic(hero, chosenStatistic, howManyPoints);
            }
        }

        System.out.println("Congratulations! You spent all your free points");
        System.out.println();
    }

    private static void updateStatistic(Character hero, int chosenStatistic, int howManyPoints) {
        final int STAT_INCREMENT = 5;

        switch (chosenStatistic) {
            case 1 -> hero.setWeaponSkill(hero.getWeaponSkill() + howManyPoints * STAT_INCREMENT);
            case 2 -> hero.setBallisticSkill(hero.getBallisticSkill() + howManyPoints * STAT_INCREMENT);
            case 3 -> hero.setStrength(hero.getStrength() + howManyPoints * STAT_INCREMENT);
            case 4 -> hero.setResistance(hero.getResistance() + howManyPoints * STAT_INCREMENT);
            case 5 -> hero.setDexterity(hero.getDexterity() + howManyPoints * STAT_INCREMENT);
            case 6 -> hero.setIntelligence(hero.getIntelligence() + howManyPoints * STAT_INCREMENT);
            case 7 -> hero.setWillPower(hero.getWillPower() + howManyPoints * STAT_INCREMENT);
            case 8 -> hero.setCharisma(hero.getCharisma() + howManyPoints * STAT_INCREMENT);
            case 9 -> hero.setAttack(hero.getAttack() + howManyPoints);
            case 10 -> hero.setHealth(hero.getHealth() + howManyPoints);
            case 11 -> hero.setMagic(hero.getMagic() + howManyPoints);
            case 12 -> hero.setMana(hero.getMana() + howManyPoints);
        }

        hero.setLevelPointAmount(hero.getLevelPointAmount() - howManyPoints);
    }

    public static void levelUpMenu(Character hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1. Gaze upon your mighty statistics
                2. Distribute your precious level points
                3. Information about points distribution
                4. Return to main menu
                Your choice:
                """);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("These are yours statistics");
                hero.showStats();
                Character.levelUpMenu(hero);

            }
            case 2: {
                levelUpStats(hero);
                Character.levelUpMenu(hero);
            }
            case 3: {
                System.out.println("""
                        One point can be spent to develop basic statistic (+5) or advanced one (+1).
                        1. Basic skills are: weapon skills, ballistic skills, strength, resistance, dexterity, intelligence, willpower, charisma
                        2. Advanced skills are: attack, health, magic, mana
                                                
                        """);
                Character.levelUpMenu(hero);

            }
            case 4: {
                GameMethods.gameMenu(hero);
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }

    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWillPower() {
        return willPower;
    }

    public void setWillPower(int willPower) {
        this.willPower = willPower;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public CharacterProfession getProfession() {
        return profession;
    }

    public void setProfession(CharacterProfession profession) {
        this.profession = profession;
    }

    public Equipment[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevelPointAmount() {
        return levelPointAmount;
    }

    public void setLevelPointAmount(int levelPointAmount) {
        this.levelPointAmount = levelPointAmount;
    }
}

