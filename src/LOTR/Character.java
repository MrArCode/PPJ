package LOTR;

import java.io.Serializable;

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



//======================================================================================================================

    public static Character createHero(){
       Character hero = StatisticChoice.createCharacter();
       hero.setProfession(CharacterProfession.chooseCharacterProfession());
       Equipment[] equipment = Equipment.startEquipmentOfHero(hero.profession);
       hero.setEquipment(equipment);
       return hero;
    }

//======================================================================================================================

    // Method for showing hero's stats in a table format
    public void showStats() {
        System.out.println("-------------------------------------");
        System.out.printf("| %-15s | %-15s |%n", "Attribute", "Value");
        System.out.println("-------------------------------------");
        System.out.printf("| %-15s | %-15s |%n", "Name", this.getName());
        System.out.printf("| %-15s | %-15s |%n", "Race", this.getRace());
        System.out.printf("| %-15s | %-15s |%n", "Weapon Skill", this.getWeaponSkill());
        System.out.printf("| %-15s | %-15s |%n", "Ballistic Skill", this.getBallisticSkill());
        System.out.printf("| %-15s | %-15s |%n", "Strength", this.getStrength());
        System.out.printf("| %-15s | %-15s |%n", "Resistance", this.getResistance());
        System.out.printf("| %-15s | %-15s |%n", "Dexterity", this.getDexterity());
        System.out.printf("| %-15s | %-15s |%n", "Intelligence", this.getIntelligence());
        System.out.printf("| %-15s | %-15s |%n", "Will Power", this.getWillPower());
        System.out.printf("| %-15s | %-15s |%n", "Charisma", this.getCharisma());
        System.out.printf("| %-15s | %-15s |%n", "Attack", this.getAttack());
        System.out.printf("| %-15s | %-15s |%n", "Health", this.getHealth());
        System.out.printf("| %-15s | %-15s |%n", "Magic", this.getMagic());
        System.out.printf("| %-15s | %-15s |%n", "Mana", this.getMana());
        System.out.println("-------------------------------------");


    }
    public static void barStats(Character hero){
        System.out.println("======================================="+"\n" +
                           "Name: "+hero.name+" The "+hero.race+" | HP: "+hero.health+" | Attack: "+hero.attack+"\n"+
                           "=======================================");
    }

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

    public Equipment[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }
}

