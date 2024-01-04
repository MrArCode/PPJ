package LOTR;

public class HeavyArmor extends Armor {

    public HeavyArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class HeavyArmorFactory {
        public static HeavyArmor createHeavyArmor() {
            return new HeavyArmor("Heavy Armor", "", generateRandomRarity(), 50, 5, 10, 10, 10);
        }
    }
}
