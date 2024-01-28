package LOTR;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Represents a character in the Lord of the Rings (LOTR) universe.
 * This class includes various attributes such as name, race, skills, health, and more,
 * as well as methods for handling character-related operations.
 */
public class Character implements Serializable {

    // Basic attributes
    private String name;
    private String race;

    // Combat attributes
    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int resistance;
    private int dexterity;
    private int intelligence;
    private int willPower;
    private int charisma;

    // Combat stats
    private int attack;
    private int health;
    private int magic;
    private int mana;

    // Profession of the character
    private CharacterProfession profession;

    // Equipment array
    private Equipment[] equipment;

    // Experience and leveling attributes
    private int experience;
    private int level;
    private int levelPointAmount;


    /**
     * Creates a new hero character by invoking the character creation process
     * and initializing it with starting equipment based on the chosen profession.
     *
     * @return The newly created hero character.
     */
    public static Character createHero() {
        // Invoke the character creation process
        Character hero = StatisticAndProfessionChoice.createCharacter();

        // Initialize the hero's equipment based on the chosen profession
        Equipment[] equipment = Equipment.startEquipmentOfHero(hero.getProfession());
        hero.setEquipment(equipment);

        // Return the newly created hero character
        return hero;
    }


    /**
     * Displays the detailed attributes and values of the character in a formatted table.
     */
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
        System.out.printf("| %-15s | %-18s |%n", "Experience", this.getExperience());
        System.out.printf("| %-15s | %-18s |%n", "Level", this.getLevel());
        System.out.printf("| %-15s | %-18s |%n", "Level Points", this.getLevelPointAmount());
        System.out.println("----------------------------------------");
    }


    /**
     * Displays a formatted bar representing the character's essential stats,
     * including name, race, health points (HP), weapon damage, and armor defense.
     *
     * @param hero The character whose stats are to be displayed.
     */
    public static void barStats(Character hero) {
        System.out.println("=======================================================" + "\n" +
                "Name: " + hero.name + " The " + hero.race + " | HP: " + hero.health +
                " | Weapon DMG: " + ((Weapon) hero.getEquipment()[0]).getBaseDmg() +
                " | Armor: " + ((Armor) hero.getEquipment()[1]).getDefense() + " |" + "\n" +
                "=======================================================");
    }

    /**
     * Reduces the character's health points (HP) based on the specified damage.
     * If the damage is greater than 0, the character's health is decreased by that amount.
     * If the resulting health is less than 0, it is set to 0 to prevent negative health values.
     *
     * @param damage The amount of damage to be taken by the character.
     */
    public void takeDamage(int damage) {
        if (damage > 0) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
        }
    }


    /**
     * Constructor for the Character class.
     * Initializes a character with the specified attributes and sets default values for experience, level, and level points.
     *
     * @param name           The name of the character.
     * @param race           The race of the character.
     * @param weaponSkill    The weapon skill level of the character.
     * @param ballisticSkill The ballistic skill level of the character.
     * @param strength       The strength level of the character.
     * @param resistance     The resistance level of the character.
     * @param dexterity      The dexterity level of the character.
     * @param intelligence   The intelligence level of the character.
     * @param willPower      The willpower level of the character.
     * @param charisma       The charisma level of the character.
     * @param attack         The attack level of the character.
     * @param health         The health level of the character.
     * @param magic          The magic level of the character.
     * @param mana           The mana level of the character.
     * @param profession     The profession of the character.
     * @param equipment      The equipment array of the character.
     */
    public Character(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                     int dexterity, int intelligence, int willPower, int charisma, int attack, int health, int magic,
                     int mana, CharacterProfession profession, Equipment[] equipment) {
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


    /**
     * Checks if the character's experience is sufficient to level up and
     * updates the character's level and level points accordingly.
     * <p>
     * If the character's experience exceeds the required amount for the next level
     * (calculated as current level multiplied by 500), the character's level is increased
     * by 1 and the level points are incremented by 1.
     * <p>
     * After updating the level and level points, the method calls {@link #levelRemainder(Character)}
     * to perform any additional actions related to leveling up.
     *
     * @param hero The character for which the level possibility is being checked.
     */

    /**
     * Checks if the character's experience is sufficient to level up.
     * If the experience is greater than the product of the character's level and 500,
     * increments the character's level by 1 and adds 1 to the level point amount.
     * Afterward, calls the {@link #levelRemainder(Character)} method.
     *
     * @param hero The character whose level possibility is being checked.
     */
    public static void checkLevelPossibility(Character hero) {
        if (hero.getExperience() > hero.getLevel() * 500) {
            hero.setLevel(hero.getLevel() + 1);
            hero.setLevelPointAmount(hero.getLevelPointAmount() + 1);
        }
        levelRemainder(hero);
    }

    /**
     * Checks if the character has remaining level points.
     * If the character has points to spend, prints a message indicating that there are points available.
     *
     * @param hero The character whose level points are being checked.
     */
    public static void levelRemainder(Character hero) {
        if (hero.getLevelPointAmount() > 0) {
            System.out.println("---!!! You have points to spend !!!---");
        }
    }

    /**
     * Increases the character's experience by the experience points obtained from defeating a monster.
     *
     * @param hero    The character gaining experience.
     * @param monster The monster defeated by the hero.
     */
    public static void gainExperience(Character hero, Monster monster) {
        hero.setExperience(hero.getExperience() + monster.getExpToGive());
    }

    /**
     * Allows the character to allocate level-up points to different statistics.
     * Displays the character's current stats and presents a menu for the player to choose
     * which statistics to develop. The player can allocate points until they have none left.
     *
     * @param hero The character who is leveling up.
     */
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
                        +----------------------+
                        | Basic skills         |
                        +----------------------+
                        | 1. Weapon Skill      |
                        | 2. Ballistic Skill   |
                        | 3. Strength          |
                        | 4. Resistance        |
                        | 5. Dexterity         |
                        | 6. Intelligence      |
                        | 7. Willpower         |
                        | 8. Charisma          |
                        +----------------------+
                        | Advanced skills      |
                        +----------------------+
                        | 9. Attack            |
                        |10. Health            |
                        |11. Magic             |
                        |12. Mana              |
                        +----------------------+
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


    /**
     * Updates the specified statistic of the character based on the chosen statistic and the number of points to spend.
     * The increment value is a constant (STAT_INCREMENT), and the method subtracts spent points from the character's
     * level point amount.
     *
     * @param hero             The character whose statistic is being updated.
     * @param chosenStatistic  The code representing the chosen statistic to be updated.
     * @param howManyPoints    The number of points to spend on the chosen statistic.
     */
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

        // Subtract spent points from the character's level point amount
        hero.setLevelPointAmount(hero.getLevelPointAmount() - howManyPoints);
    }


    /**
     * Displays the level-up menu for the character, allowing the player to choose from different options.
     * Options include viewing statistics, distributing level points, obtaining information about points distribution,
     * and returning to the main menu.
     *
     * @param hero The character for whom the level-up menu is displayed.
     */
    public static void levelUpMenu(Character hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
            1. Gaze upon your mighty statistics
            2. Distribute your precious level points
            3. Information about points distribution
            4. Return to the main menu
            Your choice:
            """);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("These are your statistics:");
                hero.showStats();
                Character.levelUpMenu(hero);
                break;
            }
            case 2: {
                levelUpStats(hero);
                Character.levelUpMenu(hero);
                break;
            }
            case 3: {
                System.out.println("""
                    One point can be spent to develop basic statistics (+5) or advanced ones (+1).
                    1. Basic skills are: weapon skills, ballistic skills, strength, resistance, dexterity, intelligence, willpower, charisma
                    2. Advanced skills are: attack, health, magic, mana
                                                
                    """);
                Character.levelUpMenu(hero);
                break;
            }
            case 4: {
                GameMethods.gameMenu(hero);
                break;
            }
            default: {
                System.out.println("Invalid choice. Please choose a valid option.");
                Character.levelUpMenu(hero);
            }
        }
    }



    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character.
     *
     * @param name The new name to be set for the character.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the race of the character.
     *
     * @return The race of the character.
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the race of the character.
     *
     * @param race The new race to be set for the character.
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Gets the weapon skill level of the character.
     *
     * @return The weapon skill level of the character.
     */
    public int getWeaponSkill() {
        return weaponSkill;
    }

    /**
     * Sets the weapon skill level of the character.
     *
     * @param weaponSkill The new weapon skill level to be set for the character.
     */
    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    /**
     * Gets the ballistic skill level of the character.
     *
     * @return The ballistic skill level of the character.
     */
    public int getBallisticSkill() {
        return ballisticSkill;
    }

    /**
     * Sets the ballistic skill level of the character.
     *
     * @param ballisticSkill The new ballistic skill level to be set for the character.
     */
    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    /**
     * Gets the strength level of the character.
     *
     * @return The strength level of the character.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength level of the character.
     *
     * @param strength The new strength level to be set for the character.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets the resistance level of the character.
     *
     * @return The resistance level of the character.
     */
    public int getResistance() {
        return resistance;
    }

    /**
     * Sets the resistance level of the character.
     *
     * @param resistance The new resistance level to be set for the character.
     */
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    /**
     * Gets the dexterity level of the character.
     *
     * @return The dexterity level of the character.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Sets the dexterity level of the character.
     *
     * @param dexterity The new dexterity level to be set for the character.
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Gets the intelligence level of the character.
     *
     * @return The intelligence level of the character.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Sets the intelligence level of the character.
     *
     * @param intelligence The new intelligence level to be set for the character.
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Gets the willpower level of the character.
     *
     * @return The willpower level of the character.
     */
    public int getWillPower() {
        return willPower;
    }

    /**
     * Sets the willpower level of the character.
     *
     * @param willPower The new willpower level to be set for the character.
     */
    public void setWillPower(int willPower) {
        this.willPower = willPower;
    }

    /**
     * Gets the charisma level of the character.
     *
     * @return The charisma level of the character.
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Sets the charisma level of the character.
     *
     * @param charisma The new charisma level to be set for the character.
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /**
     * Gets the attack level of the character.
     *
     * @return The attack level of the character.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the attack level of the character.
     *
     * @param attack The new attack level to be set for the character.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Gets the health level of the character.
     *
     * @return The health level of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health level of the character.
     *
     * @param health The new health level to be set for the character.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the magic level of the character.
     *
     * @return The magic level of the character.
     */
    public int getMagic() {
        return magic;
    }

    /**
     * Sets the magic level of the character.
     *
     * @param magic The new magic level to be set for the character.
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * Gets the mana level of the character.
     *
     * @return The mana level of the character.
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sets the mana level of the character.
     *
     * @param mana The new mana level to be set for the character.
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * Gets the profession of the character.
     *
     * @return The profession of the character.
     */
    public CharacterProfession getProfession() {
        return profession;
    }

    /**
     * Sets the profession of the character.
     *
     * @param profession The new profession to be set for the character.
     */
    public void setProfession(CharacterProfession profession) {
        this.profession = profession;
    }

    /**
     * Gets the equipment array of the character.
     *
     * @return The equipment array of the character.
     */
    public Equipment[] getEquipment() {
        return equipment;
    }

    /**
     * Sets the equipment array of the character.
     *
     * @param equipment The new equipment array to be set for the character.
     */
    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

    /**
     * Gets the experience points of the character.
     *
     * @return The experience points of the character.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the experience points of the character.
     *
     * @param experience The new experience points to be set for the character.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Gets the level of the character.
     *
     * @return The level of the character.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level of the character.
     *
     * @param level The new level to be set for the character.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets the amount of level points of the character.
     *
     * @return The amount of level points of the character.
     */
    public int getLevelPointAmount() {
        return levelPointAmount;
    }

    /**
     * Sets the amount of level points of the character.
     *
     * @param levelPointAmount The new amount of level points to be set for the character.
     */
    public void setLevelPointAmount(int levelPointAmount) {
        this.levelPointAmount = levelPointAmount;
    }

}

