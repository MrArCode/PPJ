package LOTR;

import java.io.Serializable;
import java.util.Scanner;

/**
 * The CharacterProfession class represents a profession for a character in a Lord of the Rings (LOTR) game.
 * It includes attributes such as name, description, skills, and stats related to the character's profession.
 * This class implements the Serializable interface for object serialization.
 */
public class CharacterProfession implements Serializable {
    private String name;
    private String professionDescription;

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

    /**
     * Constructs a CharacterProfession with the specified attributes.
     *
     * @param name                  The name of the character profession.
     * @param professionDescription A description of the character profession.
     * @param weaponSkill           The level of proficiency in weapon usage.
     * @param ballisticSkill        The level of proficiency in ranged combat.
     * @param strength              The physical strength of the character.
     * @param resistance            The ability to resist damage or effects.
     * @param dexterity             The agility and reflexes of the character.
     * @param intelligence          The intellectual capability of the character.
     * @param willPower             The mental strength and willpower of the character.
     * @param charisma              The charm and social skills of the character.
     * @param attack                The overall combat effectiveness of the character.
     * @param health                The total health points of the character.
     * @param magic                 The proficiency in using magical abilities.
     * @param mana                  The magical energy or mana reserves of the character.
     */
    public CharacterProfession(String name, String professionDescription, int weaponSkill, int ballisticSkill, int strength,
                               int resistance, int dexterity, int intelligence, int willPower, int charisma, int attack,
                               int health, int magic, int mana) {
        this.name = name;
        this.professionDescription = professionDescription;
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
    }

    /**
     * The {@code ClassFactory} class serves as a factory for creating instances of the {@link CharacterProfession} class.
     * Each method in this class corresponds to a different character profession in a fantasy role-playing game.
     */
    public static class ClassFactory {

        /**
         * Creates a new instance of the Archer character profession.
         *
         * @return A new {@code Archer} character profession.
         */
        public static CharacterProfession archer() {
            return new CharacterProfession("Archer", "A nimble hero with a keen eye and unparalleled skill in distant combat. " +
                    "The Archer excels in precision, striking foes from afar with a bow and avoiding direct confrontation.",
                    0, 10, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Barbarian character profession.
         *
         * @return A new {@code Barbarian} character profession.
         */
        public static CharacterProfession barbarian() {
            return new CharacterProfession("Barbarian", "A mighty warrior with untamed strength and a ferocious fighting style. " +
                    "The Barbarian charges into battle without hesitation, throwing themselves at enemies with wild determination and powerful attacks.",
                    15, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Beastlord character profession.
         *
         * @return A new {@code Beastlord} character profession.
         */
        public static CharacterProfession beastlord() {
            return new CharacterProfession("Beastlord", "A master of creatures, capable of controlling and summoning the wild beings of the land. " +
                    "The Beastlord commands the forces of nature, bringing forth allies and harnessing the power of the untamed wilderness.",
                    0, 0, 0, 10, 0, 10, 10, 5, 0, 0, 1, 10);
        }

        /**
         * Creates a new instance of the Druid character profession.
         *
         * @return A new {@code Druid} character profession.
         */
        public static CharacterProfession druid() {
            return new CharacterProfession("Druid", "A mystic guardian deeply connected to the natural world. " +
                    "The Druid wields the magic of the earth, capable of healing and shaping the environment, and can transform into animals to adapt to the challenges that arise.",
                    0, 0, 10, 15, 0, 5, 5, 0, 0, 2, 1, 10);
        }

        /**
         * Creates a new instance of the Knight character profession.
         *
         * @return A new {@code Knight} character profession.
         */
        public static CharacterProfession knight() {
            return new CharacterProfession("Knight", "A noble and disciplined warrior clad in armor, sworn to protect the realm. " +
                    "The Knight is the embodiment of chivalry, skilled in both offense and defense, and upholds a code of honor on the battlefield.",
                    15, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Mage character profession.
         *
         * @return A new {@code Mage} character profession.
         */
        public static CharacterProfession mage() {
            return new CharacterProfession("Mage", "A wielder of arcane powers, tapping into the mysteries of magic to cast devastating spells. " +
                    "The Mage is a master of the arcane arts, manipulating reality to unleash destructive forces upon their enemies.",
                    0, 0, 0, 0, 0, 15, 15, 5, 0, 0, 2, 20);
        }

        /**
         * Creates a new instance of the Paladin character profession.
         *
         * @return A new {@code Paladin} character profession.
         */
        public static CharacterProfession paladin() {
            return new CharacterProfession("Paladin", " A holy warrior dedicated to justice and righteousness. " +
                    "The Paladin fights with divine blessings, combining martial prowess with potent spells to smite evil and protect the innocent.",
                    5, 0, 10, 15, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Rogue character profession.
         *
         * @return A new {@code Rogue} character profession.
         */
        public static CharacterProfession rogue() {
            return new CharacterProfession("Rogue", "A cunning and stealthy operative skilled in subterfuge and surprise attacks. " +
                    "The Rogue excels in navigating the shadows, striking from behind, and using their agility to outmaneuver adversaries.",
                    5, 5, 0, 0, 10, 0, 0, 0, 1, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Warlock character profession.
         *
         * @return A new {@code Warlock} character profession.
         */
        public static CharacterProfession warlock() {
            return new CharacterProfession("Warlock", "A spellcaster who forms pacts with otherworldly entities for dark powers. " +
                    "The Warlock's magic is tainted by the mysterious forces they have bargained with, granting them eldritch abilities that come at a price.",
                    0, 0, 0, 0, 0, 10, 30, 0, 0, 0, 2, 20);
        }

        /**
         * Creates a new instance of the Warrior character profession.
         *
         * @return A new {@code Warrior} character profession.
         */
        public static CharacterProfession warrior() {
            return new CharacterProfession("Warrior", "A versatile and resilient fighter, trained in a variety of weapons and tactics. " +
                    "The Warrior is a stalwart defender and formidable attacker, capable of adapting to different combat scenarios with ease.",
                    10, 10, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0);
        }

        /**
         * Creates a new instance of the Default character profession.
         *
         * @return A new {@code Default} character profession.
         */
        public static CharacterProfession defaultProfession() {
            return new CharacterProfession("Default", "A well-rounded adventurer with balanced abilities.",
                    5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        }
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return name;
    }



    /**
     * Allows the user to choose a character profession from a menu.
     * Displays the menu, takes user input, and returns the chosen character profession.
     *
     * @return The chosen character profession.
     */
    public static CharacterProfession chooseCharacterProfession() {

        /**
         * Creates a Scanner object to read user input.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variable to store the user's choice.
         */
        int choice;

        /**
         * Loops until a valid choice is made (between 1 and 10).
         */
        do {
            /**
             * Displays the menu of character professions.
             */
            displayProfessionMenu();

            /**
             * Takes user input for the chosen profession.
             */
            choice = scanner.nextInt();

            /**
             * Checks if the choice is outside the valid range and prompts the user for a valid input.
             */
            if (choice < 1 || choice > 10) {
                System.out.println("Invalid choice. Please enter a valid numeral.");
            }
        } while (choice < 1 || choice > 10);

        /**
         * Initializes the character profession with the default profession.
         */
        CharacterProfession profession = ClassFactory.defaultProfession();

        /**
         * Updates the character profession based on the user's choice.
         */
        switch (choice) {
            case 1 -> profession = ClassFactory.archer();
            case 2 -> profession = ClassFactory.barbarian();
            case 3 -> profession = ClassFactory.beastlord();
            case 4 -> profession = ClassFactory.druid();
            case 5 -> profession = ClassFactory.knight();
            case 6 -> profession = ClassFactory.mage();
            case 7 -> profession = ClassFactory.paladin();
            case 8 -> profession = ClassFactory.rogue();
            case 9 -> profession = ClassFactory.warlock();
            case 10 -> profession = ClassFactory.warrior();
        }

        /**
         * Displays a congratulatory message with the chosen profession's name.
         */
        System.out.println("Congratulations, you have chosen your profession. " + profession.getName());
        System.out.println();

        /**
         * Returns the chosen character profession.
         */
        return profession;
    }



    /**
     * Displays the menu of character professions for the user to choose from.
     * The menu includes a list of professions with corresponding numerals.
     * Prompts the user to enter a numeral to select a profession.
     */
    private static void displayProfessionMenu() {
        System.out.println();
        System.out.println("'Tis the hour to decide thy calling, declare the numeral: \n" +
                "1. Archer\n" +
                "2. Barbarian\n" +
                "3. Beastlord\n" +
                "4. Druid\n" +
                "5. Knight\n" +
                "6. Mage\n" +
                "7. Paladin\n" +
                "8. Rogue\n" +
                "9. Warlock\n" +
                "10. Warrior");
        System.out.print("Your choice: ");
    }

    /**
     * Gets the name of the character profession.
     *
     * @return The name of the character profession.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character profession.
     *
     * @param name The new name for the character profession.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the character profession.
     *
     * @return The description of the character profession.
     */
    public String getProfessionDescription() {
        return professionDescription;
    }

    /**
     * Sets the description of the character profession.
     *
     * @param professionDescription The new description for the character profession.
     */
    public void setProfessionDescription(String professionDescription) {
        this.professionDescription = professionDescription;
    }

    /**
     * Gets the weapon skill level of the character.
     *
     * @return The weapon skill level.
     */
    public int getWeaponSkill() {
        return weaponSkill;
    }

    /**
     * Sets the weapon skill level of the character.
     *
     * @param weaponSkill The new weapon skill level.
     */
    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    /**
     * Gets the ballistic skill level of the character.
     *
     * @return The ballistic skill level.
     */
    public int getBallisticSkill() {
        return ballisticSkill;
    }

    /**
     * Sets the ballistic skill level of the character.
     *
     * @param ballisticSkill The new ballistic skill level.
     */
    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    /**
     * Gets the strength attribute of the character.
     *
     * @return The strength attribute.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength attribute of the character.
     *
     * @param strength The new strength attribute.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets the resistance attribute of the character.
     *
     * @return The resistance attribute.
     */
    public int getResistance() {
        return resistance;
    }

    /**
     * Sets the resistance attribute of the character.
     *
     * @param resistance The new resistance attribute.
     */
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    /**
     * Gets the dexterity attribute of the character.
     *
     * @return The dexterity attribute.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Sets the dexterity attribute of the character.
     *
     * @param dexterity The new dexterity attribute.
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Gets the intelligence attribute of the character.
     *
     * @return The intelligence attribute.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Sets the intelligence attribute of the character.
     *
     * @param intelligence The new intelligence attribute.
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Gets the willpower attribute of the character.
     *
     * @return The willpower attribute.
     */
    public int getWillPower() {
        return willPower;
    }

    /**
     * Sets the willpower attribute of the character.
     *
     * @param willPower The new willpower attribute.
     */
    public void setWillPower(int willPower) {
        this.willPower = willPower;
    }

    /**
     * Gets the charisma attribute of the character.
     *
     * @return The charisma attribute.
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Sets the charisma attribute of the character.
     *
     * @param charisma The new charisma attribute.
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    /**
     * Gets the attack attribute of the character.
     *
     * @return The attack attribute.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the attack attribute of the character.
     *
     * @param attack The new attack attribute.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Gets the health attribute of the character.
     *
     * @return The health attribute.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health attribute of the character.
     *
     * @param health The new health attribute.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the magic attribute of the character.
     *
     * @return The magic attribute.
     */
    public int getMagic() {
        return magic;
    }

    /**
     * Sets the magic attribute of the character.
     *
     * @param magic The new magic attribute.
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * Gets the mana attribute of the character.
     *
     * @return The mana attribute.
     */
    public int getMana() {
        return mana;
    }

    /**
     * Sets the mana attribute of the character.
     *
     * @param mana The new mana attribute.
     */
    public void setMana(int mana) {
        this.mana = mana;
    }
}

