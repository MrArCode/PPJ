package LOTR;

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
            default ->
                    throw new IllegalStateException("Unexpected value: " + characterProfession.getName());
        }

        return startEquipmentOfHero;
    }


    //1.weapon
    //2.armor
    //3.gold

    public static Equipment[] monsterEquipment(String name){
        Equipment[] monsterEquipment = new Equipment[3];
        switch (name){
            case "Goblin Miner" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createShortSword();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Scout" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createShortSword();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Skirmisher" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createBattleAxe();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Warrior" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Spearman" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createSpear();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Archer" -> {
                monsterEquipment[0] = RangeWeapon.RangeWeaponFactory.createBow();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Shaman" -> {
                monsterEquipment[0] = MagicWeapon.MagicWeaponFactory.createStaff();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Drummer" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createMace();
                monsterEquipment[1] = LightArmor.LightArmorFactory.createLightArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins100();
            }
            case "Goblin Chief" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                monsterEquipment[1] = HeavyArmor.HeavyArmorFactory.createHeavyArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins1000();
            }
            case "Cave Troll" -> {
                monsterEquipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();
                monsterEquipment[1] = HeavyArmor.HeavyArmorFactory.createHeavyArmor();
                monsterEquipment[2] = Gold.GoldFactory.createGoldCoins1000();
            }
        }
        return monsterEquipment;
    }
}
