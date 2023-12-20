package LOTR;

import java.util.Random;
import java.util.Scanner;

public class Character {
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

    private Item[] equipment;

//======================================================================================================================

    // Method for creating a hero with user input
    public static Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int weaponSkill = 0;
        int ballisticSkill = 0;
        int strength = 0;
        int resistance = 0;
        int dexterity = 0;
        int intelligence = 0;
        int willPower = 0;
        int charisma = 0;

        System.out.println("Hero creation");

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Race:\n" +
                "1. Human\n" +
                "2. Elf\n" +
                "3. Dwarf\n" +
                "4. Hobbit\n" +
                "5. Maia\n" +
                "Your choice: ");

        String race = scanner.next().toLowerCase();
        while (!race.equals("human") && !race.equals("elf") && !race.equals("dwarf") && !race.equals("hobbit") && !race.equals("maia")) {
            System.out.println("Invalid choice. Please enter a valid race.");
            race = scanner.next().toLowerCase();
        }

        // Adjusting statistics based on the selected race.

        switch (race) {
            case "human":
                weaponSkill += 20;
                ballisticSkill += 20;
                strength += 20;
                resistance += 20;
                dexterity += 20;
                intelligence += 20;
                willPower += 20;
                charisma += 20;
                break;

            case "elf":
                weaponSkill += 20;
                ballisticSkill += 30;
                strength += 20;
                resistance += 20;
                dexterity += 30;
                intelligence += 20;
                willPower += 20;
                charisma += 20;
                break;

            case "dwarf":
                weaponSkill += 30;
                ballisticSkill += 20;
                strength += 20;
                resistance += 30;
                dexterity += 10;
                intelligence += 20;
                willPower += 20;
                charisma += 10;
                break;

            case "hobbit":
                weaponSkill += 10;
                ballisticSkill += 30;
                strength += 10;
                resistance += 10;
                dexterity += 30;
                intelligence += 20;
                willPower += 20;
                charisma += 30;
                break;

            case "maia":
                weaponSkill += 30;
                ballisticSkill += 30;
                strength += 30;
                resistance += 30;
                dexterity += 30;
                intelligence += 30;
                willPower += 30;
                charisma += 30;
                break;
        }

        System.out.println("""
                It's time to configure your character's statistics.\s
                You have the option to either allocate random amount of points\s
                to your base race stats or personally distribute up to 20 points
                across each statistic as you see fit.
                1. Random points
                2. I choose my destiny""");

        // Validate user input for menu choice
        int pointsDistributionChoice = scanner.nextInt();
        while (pointsDistributionChoice != 1 && pointsDistributionChoice != 2) {
            System.out.println("Please enter a valid choice (1 or 2): ");
            pointsDistributionChoice = scanner.nextInt();
        }

        if (pointsDistributionChoice == 1){

            weaponSkill += random.nextInt(21);
            ballisticSkill += random.nextInt(21);
            strength += random.nextInt(21);
            resistance += random.nextInt(21);
            dexterity += random.nextInt(21);
            intelligence += random.nextInt(21);
            willPower += random.nextInt(21);
            charisma += random.nextInt(21);

        } else {

            // Weapon Skill with
            System.out.print("Weapon Skill: ");
            int weaponSkillUser = scanner.nextInt();
            while (weaponSkillUser < 0 || weaponSkillUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                weaponSkillUser = scanner.nextInt();
            }
            weaponSkill += weaponSkillUser;

            // Ballistic Skill
            System.out.print("Ballistic Skill: ");
            int ballisticSkillUser = scanner.nextInt();
            while (ballisticSkillUser < 0 || ballisticSkillUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                ballisticSkillUser = scanner.nextInt();
            }
            ballisticSkill += ballisticSkillUser;

            // Strength
            System.out.print("Strength: ");
            int strengthUser = scanner.nextInt();
            while (strengthUser < 0 || strengthUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                strengthUser = scanner.nextInt();
            }
            strength += strengthUser;

            // Resistance
            System.out.print("Resistance: ");
            int resistanceUser = scanner.nextInt();
            while (resistanceUser < 0 || resistanceUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                resistanceUser = scanner.nextInt();
            }
            resistance += resistanceUser;

            // Dexterity
            System.out.print("Dexterity: ");
            int dexterityUser = scanner.nextInt();
            while (dexterityUser < 0 || dexterityUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                dexterityUser = scanner.nextInt();
            }
            dexterity += dexterityUser;

            // Intelligence
            System.out.print("Intelligence: ");
            int intelligenceUser = scanner.nextInt();
            while (intelligenceUser < 0 || intelligenceUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                intelligenceUser = scanner.nextInt();
            }
            intelligence += intelligenceUser;

            // Will Power
            System.out.print("Will Power: ");
            int willPowerUser = scanner.nextInt();
            while (willPowerUser < 0 || willPowerUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                willPowerUser = scanner.nextInt();
            }
            willPower += willPowerUser;

            // Charisma
            System.out.print("Charisma: ");
            int charismaUser = scanner.nextInt();
            while (charismaUser < 0 || charismaUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                charismaUser = scanner.nextInt();
            }
            charisma += charismaUser;


        }

        int attack = 1;
        int health = 10;
        int magic = 0;
        int mana = 0;

        //TODO Tutaj bedzie odzielna klasa która bedzie skupiała się na wyborze klasy postaci
        //TODO Tutaj bedzie odzielna klasa na losowanie i wybór ekwipnuku w zaleznosci od klasy

        Item[] equipment = new Item[5];
        equipment[0] = Item.ItemFactory.createCommonSword(); // You can modify this based on your actual equipment representation

        System.out.println("Congratulations! You've just brought your own hero to life in the enchanting realm of Middle-Earth.");

        // Close the scanner to prevent resource leaks
        scanner.close();

        return new Character(name, race, weaponSkill, ballisticSkill, strength, resistance, dexterity,
                intelligence, willPower, charisma, attack, health, magic, mana, equipment);
    }

//======================================================================================================================

    // Method for showing hero's stats in a table format
    public void showStats() {
        System.out.println("--------------------------------");
        System.out.printf("| %-15s | %-10s |%n", "Attribute", "Value");
        System.out.println("--------------------------------");
        System.out.printf("| %-15s | %-10s |%n", "Name", name);
        System.out.printf("| %-15s | %-10s |%n", "Race", race);
        System.out.printf("| %-15s | %-10s |%n", "Weapon Skill", weaponSkill);
        System.out.printf("| %-15s | %-10s |%n", "Ballistic Skill", ballisticSkill);
        System.out.printf("| %-15s | %-10s |%n", "Strength", strength);
        System.out.printf("| %-15s | %-10s |%n", "Resistance", resistance);
        System.out.printf("| %-15s | %-10s |%n", "Dexterity", dexterity);
        System.out.printf("| %-15s | %-10s |%n", "Intelligence", intelligence);
        System.out.printf("| %-15s | %-10s |%n", "Will Power", willPower);
        System.out.printf("| %-15s | %-10s |%n", "Charisma", charisma);
        System.out.printf("| %-15s | %-10s |%n", "Attack", attack);
        System.out.printf("| %-15s | %-10s |%n", "Health", health);
        System.out.printf("| %-15s | %-10s |%n", "Magic", magic);
        System.out.printf("| %-15s | %-10s |%n", "Mana", mana);
        System.out.println("--------------------------------");

        System.out.println("Equipment:");
        for (Item item : equipment) {
            if (item != null) {
                System.out.printf("| %-15s | %-10s | %-10s |%n", "-", "-", item);
            }
        }
        System.out.println("--------------------------------");
    }

//======================================================================================================================

    // Constructor
    public Character(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                     int dexterity, int intelligence, int willPower, int charisma, int attack, int health, int magic, int mana, Item[] equipment) {
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
        this.equipment = equipment;
    }

//======================================================================================================================

    // Setters and getters
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

    public Item[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Item[] equipment) {
        this.equipment = equipment;
    }
}

