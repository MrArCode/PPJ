package LOTR;

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

    private CharacterProfession profession;



//======================================================================================================================

    public static Character createHero(){
       Character hero = StatisticChoice.createCharacter();
       hero.setProfession(CharacterProfession.chooseCharacterProfession());
       return hero;
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

//        System.out.println("Equipment:");
//        for (Item item : equipment) {
//            if (item != null) {
//                System.out.printf("| %-15s | %-10s | %-10s |%n", "-", "-", item);
//            }
//        }
//        System.out.println("--------------------------------");
    }

//======================================================================================================================

    public Character(String name, String race, int weaponSkill, int ballisticSkill, int strength, int resistance,
                     int dexterity, int intelligence, int willPower, int charisma, int attack, int health, int magic, int mana, CharacterProfession profession) {
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

    public CharacterProfession getProfession() {
        return profession;
    }

    public void setProfession(CharacterProfession profession) {
        this.profession = profession;
    }
}

