package LOTR;

public class MageArmor extends Armor {

    public MageArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class MageArmorFactory {
        public static MageArmor createMageArmor() {
            return new MageArmor("Magician's robes", "", generateRandomRarity(), 50, 0, 0, 0, 25);
        }
    }
}
