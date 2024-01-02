package LOTR;

import java.util.ArrayList;

public class Equipment {

    public static ArrayList<Equipment> startEquipmentOfHero(CharacterProfession characterProfession) {
        ArrayList<Equipment> startEquipmentOfHero = new ArrayList<>();

        switch (characterProfession.getName()) {
            case "Archer" ->
                    startEquipmentOfHero.add(RangeWeapon.RangeWeaponFactory.createBow());
            case "Barbarian" ->
                    startEquipmentOfHero.add(MeleeWeapon.MeleeWeaponFactory.createBattleAxe());
            case "Beastlord", "Druid", "Mage", "Warlock", "Warrior" ->
                    startEquipmentOfHero.add(MagicWeapon.MagicWeaponFactory.createStaff());
            case "Knight" ->
                    startEquipmentOfHero.add(MeleeWeapon.MeleeWeaponFactory.createLongSword());
            case "Paladin" ->
                    startEquipmentOfHero.add(MeleeWeapon.MeleeWeaponFactory.createMace());
            case "Rogue" ->
                    startEquipmentOfHero.add(MeleeWeapon.MeleeWeaponFactory.createShortSword());
            default ->
                    throw new IllegalStateException("Unexpected value: " + characterProfession.getName());
        }

        return startEquipmentOfHero;
    }

    public static ArrayList<Equipment> monsterEquipment(Monster monster){
        ArrayList<Equipment> monsterEquipment = new ArrayList<>();
        switch (monster.getName()){
            case"Goblin Miner" ->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createShortSword());
            case "Goblin Scout"->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createShortSword());
            case "Goblin Skirmisher"->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createBattleAxe());
            case"Goblin Warrior" ->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createLongSword());
            case"Goblin Spearman" ->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createSpear());
            case"Goblin Archer" ->
                monsterEquipment.add(RangeWeapon.RangeWeaponFactory.createBow());
            case "Goblin Shaman"->
                monsterEquipment.add(MagicWeapon.MagicWeaponFactory.createStaff());
            case"Goblin Drummer" ->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createMace());
            case "Goblin Chief"->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createLongSword());
            case "Cave Troll"->
                monsterEquipment.add(MeleeWeapon.MeleeWeaponFactory.createLongSword());
        }
        return monsterEquipment;
    }
}
