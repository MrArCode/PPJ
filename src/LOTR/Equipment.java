package LOTR;

import java.util.Scanner;

public class Equipment {

    //1.weapon
    //2.armor
    //3.elixir
    //4.gold
    //5.other

    public static Equipment[] startEquipmentOfHero(CharacterProfession characterProfession) {
        Equipment[] startEquipmentOfHero = new Equipment[5];

        switch (characterProfession.getName()) {
            case "Archer" -> {
                startEquipmentOfHero[0] = RangeWeapon.RangeWeaponFactory.createBow();
                startEquipmentOfHero[1] = LightArmor.LightArmorFactory.createLightArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Barbarian" -> {
                startEquipmentOfHero[0] = MeleeWeapon.MeleeWeaponFactory.createBattleAxe();
                startEquipmentOfHero[1] = MediumArmor.MediumArmorFactory.createMediumArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Beastlord", "Druid", "Mage", "Warlock", "Warrior" -> {
                startEquipmentOfHero[0] = MagicWeapon.MagicWeaponFactory.createStaff();
                startEquipmentOfHero[1] = MageArmor.MageArmorFactory.createMageArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Knight" -> {
                startEquipmentOfHero[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                startEquipmentOfHero[1] = MediumArmor.MediumArmorFactory.createMediumArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Paladin" -> {
                startEquipmentOfHero[0] = MeleeWeapon.MeleeWeaponFactory.createMace();
                startEquipmentOfHero[1] = MediumArmor.MediumArmorFactory.createMediumArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Rogue" -> {
                startEquipmentOfHero[0] = MeleeWeapon.MeleeWeaponFactory.createShortSword();
                startEquipmentOfHero[1] = LightArmor.LightArmorFactory.createLightArmor();
                startEquipmentOfHero[2] = HpElixir.HpElixirFactory.createHpElixir();
                startEquipmentOfHero[3] = Gold.GoldFactory.createGoldCoins100();
            }
            default -> throw new IllegalStateException("Unexpected value: " + characterProfession.getName());
        }

        return startEquipmentOfHero;
    }


    //1.weapon
    //2.armor
    //3.gold

    public static Equipment[] goblinEquipment(String name) {
        Equipment[] monsterEquipment = new Equipment[3];
        switch (name) {
            case "Goblin Miner", "Orc Warrior", "Goblin Scout", "Orc Assassin" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createShortSword();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Skirmisher", "Orc Berserker" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createBattleAxe();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Warrior", "Orc Defender" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Spearman", "Orc Spearman" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createSpear();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Archer", "Orc Archer" -> {
                monsterEquipment[0] = RangeWeapon.RangeWeaponFactory.createBow();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Shaman", "Orc Shaman" -> {
                monsterEquipment[0] = MagicWeapon.MagicWeaponFactory.createStaff();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Drummer", "Orc Sorcerer" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createMace();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Chief", "Orc Chieftain", "Cave Troll", "Orc Executioner" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                monsterEquipment[1] = HeavyArmor.HeavyArmorFactory.createHeavyArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins1000();
            }
        }
        return monsterEquipment;
    }


    public static void heroEquipmentMenu(Character hero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1. Show yours equipment
                2. Return to main menu
                Your choice:
                """);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("1. Weapon - " + ((Weapon)hero.getEquipment()[0]).getName());
                System.out.println("2. Armor - " + ((Armor)hero.getEquipment()[1]).getName());
                System.out.println("3. Elixir - " + ((Elixir)hero.getEquipment()[2]).getName());
                System.out.println("4. Gold - " + ((Gold)hero.getEquipment()[3]).getAmount());
                //TODO tu trzeba dodac jak beda itemy other
                Equipment.heroEquipmentMenu(hero);
            }
            case 2: {
                GameMethods.gameMenu(hero);
            }
        }
    }

}



