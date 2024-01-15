package LOTR;

import java.io.Serializable;
import java.util.Scanner;

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

    public static class ClassFactory {


        public static CharacterProfession archer() {
            return new CharacterProfession("Archer", "A nimble hero with a keen eye and unparalleled skill in distant combat. " +
                    "The Archer excels in precision, striking foes from afar with a bow and avoiding direct confrontation.",
                    0, 10, 0, 0, 10, 0, 0, 0, 1, 0, 0, 0);
        }

        public static CharacterProfession barbarian() {
            return new CharacterProfession("Barbarian", "A mighty warrior with untamed strength and a ferocious fighting style. " +
                    "The Barbarian charges into battle without hesitation, throwing themselves at enemies with wild determination and powerful attacks.",
                    15, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public static CharacterProfession beastlord() {
            return new CharacterProfession("Beastlord", "A master of creatures, capable of controlling and summoning the wild beings of the land. " +
                    "The Beastlord commands the forces of nature, bringing forth allies and harnessing the power of the untamed wilderness.",
                    0, 0, 0, 10, 0, 10, 10, 5, 0, 0, 1, 10);
        }

        public static CharacterProfession druid() {
            return new CharacterProfession("Druid", "A mystic guardian deeply connected to the natural world. " +
                    "The Druid wields the magic of the earth, capable of healing and shaping the environment, and can transform into animals to adapt to the challenges that arise.",
                    0, 0, 10, 15, 0, 5, 5, 0, 0, 2, 1, 10);
        }

        public static CharacterProfession knight() {
            return new CharacterProfession("Knight", "A noble and disciplined warrior clad in armor, sworn to protect the realm. " +
                    "The Knight is the embodiment of chivalry, skilled in both offense and defense, and upholds a code of honor on the battlefield.",
                    15, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public static CharacterProfession mage() {
            return new CharacterProfession("Mage", "A wielder of arcane powers, tapping into the mysteries of magic to cast devastating spells. " +
                    "The Mage is a master of the arcane arts, manipulating reality to unleash destructive forces upon their enemies.",
                    0, 0, 0, 0, 0, 15, 15, 5, 0, 0, 2, 20);
        }

        public static CharacterProfession paladin() {
            return new CharacterProfession("Paladin", " A holy warrior dedicated to justice and righteousness. " +
                    "The Paladin fights with divine blessings, combining martial prowess with potent spells to smite evil and protect the innocent.",
                    5, 0, 10, 15, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public static CharacterProfession rogue() {
            return new CharacterProfession("Rogue", "A cunning and stealthy operative skilled in subterfuge and surprise attacks. " +
                    "The Rogue excels in navigating the shadows, striking from behind, and using their agility to outmaneuver adversaries.",
                    5, 5, 0, 0, 10, 0, 0, 0, 1, 0, 0, 0)
                    ;
        }

        public static CharacterProfession warlock() {
            return new CharacterProfession("Warlock", "A spellcaster who forms pacts with otherworldly entities for dark powers. " +
                    "The Warlock's magic is tainted by the mysterious forces they have bargained with, granting them eldritch abilities that come at a price.",
                    0, 0, 0, 0, 0, 10, 30, 0, 0, 0, 2, 20);
        }

        public static CharacterProfession warrior() {
            return new CharacterProfession("Warrior", "A versatile and resilient fighter, trained in a variety of weapons and tactics. " +
                    "The Warrior is a stalwart defender and formidable attacker, capable of adapting to different combat scenarios with ease.",
                    10, 10, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0);
        }

        public static CharacterProfession defaultProfession() {
            return new CharacterProfession("Default", "A well-rounded adventurer with balanced abilities.",
                    5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        }

    }
    public String toString(){
        return name;
    }


    public static CharacterProfession chooseCharacterProfession() {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayProfessionMenu();
            choice = scanner.nextInt();

            if (choice < 1 || choice > 10) {
                System.out.println("Invalid choice. Please enter a valid numeral.");
            }
        } while (choice < 1 || choice > 10);

        CharacterProfession profession = ClassFactory.defaultProfession();

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

        System.out.println("Congratulations, you have chosen your profession. " + profession.getName());


        return profession;
    }


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
                "10.Warrior");
        System.out.print("Your choice: ");
    }


    public CharacterProfession(String name, String professionDescription, int weaponSkill, int ballisticSkill, int strength, int resistance,
                               int dexterity, int intelligence, int willPower, int charisma, int attack, int health, int magic, int mana) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessionDescription() {
        return professionDescription;
    }

    public void setProfessionDescription(String professionDescription) {
        this.professionDescription = professionDescription;
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
}
