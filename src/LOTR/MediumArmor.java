package LOTR;

public class MediumArmor extends Armor{


    public MediumArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }
    public static class MediumArmorFactory {
        public static MediumArmor createMediumArmor() {
            return new MediumArmor("Medium Armor", "", generateRandomRarity(), 50, 3, 10, 10, 10);
        }
    }
}
