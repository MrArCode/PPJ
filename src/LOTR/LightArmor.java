package LOTR;

public class LightArmor extends Armor {


    public LightArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class LightArmorFactory {
        public static LightArmor createLightArmor() {
            return new LightArmor("Light Armor", "", generateRandomRarity(), 50, 1, 10, 10, 10);
        }

    }

}
