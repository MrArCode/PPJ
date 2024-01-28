package LOTR;

/**
 * The LightArmor class represents a type of armor with low defense and specific requirements.
 * It extends the Armor class.
 */
public class LightArmor extends Armor {

    /**
     * Constructor for creating a LightArmor object with the specified attributes.
     *
     * @param name                 The name of the light armor.
     * @param description          The description of the light armor.
     * @param rarity               The rarity level of the light armor.
     * @param value                The value of the light armor.
     * @param defense              The defense provided by the light armor.
     * @param strengthRequirement The strength requirement for wearing the light armor.
     * @param dexterityRequirement The dexterity requirement for wearing the light armor.
     * @param willPowerRequirement The willpower requirement for wearing the light armor.
     */
    public LightArmor(String name, String description, int rarity, double value,
                      int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    /**
     * The LightArmorFactory class provides a method to create a default LightArmor object.
     */
    public static class LightArmorFactory {

        /**
         * Creates a default LightArmor object with random rarity and default values.
         *
         * @return A new LightArmor object.
         */
        public static LightArmor createLightArmor() {
            return new LightArmor("Light Armor", "", generateRandomRarity(), 50, 1, 10, 10, 10);
        }
    }
}
