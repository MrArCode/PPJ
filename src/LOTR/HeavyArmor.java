package LOTR;

/**
 * The HeavyArmor class represents a type of armor with high defense and specific requirements.
 * It extends the Armor class.
 */
public class HeavyArmor extends Armor {

    /**
     * Constructor for creating a HeavyArmor object with the specified attributes.
     *
     * @param name                 The name of the heavy armor.
     * @param description          The description of the heavy armor.
     * @param rarity               The rarity level of the heavy armor.
     * @param value                The value of the heavy armor.
     * @param defense              The defense provided by the heavy armor.
     * @param strengthRequirement  The strength requirement for wearing the heavy armor.
     * @param dexterityRequirement The dexterity requirement for wearing the heavy armor.
     * @param willPowerRequirement The willpower requirement for wearing the heavy armor.
     */
    public HeavyArmor(String name, String description, int rarity, double value,
                      int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    /**
     * The HeavyArmorFactory class provides a method to create a default HeavyArmor object.
     */
    public static class HeavyArmorFactory {

        /**
         * Creates a default HeavyArmor object with random rarity and default values.
         *
         * @return A new HeavyArmor object.
         */
        public static HeavyArmor createHeavyArmor() {
            return new HeavyArmor("Heavy Armor", "", generateRandomRarity(), 50, 5, 60, 0, 0);
        }
    }
}
