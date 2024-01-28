package LOTR;

/**
 * The MediumArmor class represents a type of armor with moderate defense and specific requirements.
 * It extends the Armor class.
 */
public class MediumArmor extends Armor {

    /**
     * Constructor for creating a MediumArmor object with the specified attributes.
     *
     * @param name                 The name of the medium armor.
     * @param description          The description of the medium armor.
     * @param rarity               The rarity level of the medium armor.
     * @param value                The value of the medium armor.
     * @param defense              The defense provided by the medium armor.
     * @param strengthRequirement The strength requirement for wearing the medium armor.
     * @param dexterityRequirement The dexterity requirement for wearing the medium armor.
     * @param willPowerRequirement The willpower requirement for wearing the medium armor.
     */
    public MediumArmor(String name, String description, int rarity, double value,
                       int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    /**
     * The MediumArmorFactory class provides a method to create a default MediumArmor object.
     */
    public static class MediumArmorFactory {

        /**
         * Creates a default MediumArmor object with random rarity and default values.
         *
         * @return A new MediumArmor object.
         */
        public static MediumArmor createMediumArmor() {
            return new MediumArmor("Medium Armor", "", generateRandomRarity(), 50, 3, 40, 0, 0);
        }
    }
}
