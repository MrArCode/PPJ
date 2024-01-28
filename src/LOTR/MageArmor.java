package LOTR;

/**
 * The MageArmor class represents a type of armor designed for magicians with specific attributes.
 * It extends the Armor class.
 */
public class MageArmor extends Armor {

    /**
     * Constructor for creating a MageArmor object with the specified attributes.
     *
     * @param name                 The name of the mage armor.
     * @param description          The description of the mage armor.
     * @param rarity               The rarity level of the mage armor.
     * @param value                The value of the mage armor.
     * @param defense              The defense provided by the mage armor.
     * @param strengthRequirement The strength requirement for wearing the mage armor.
     * @param dexterityRequirement The dexterity requirement for wearing the mage armor.
     * @param willPowerRequirement The willpower requirement for wearing the mage armor.
     */
    public MageArmor(String name, String description, int rarity, double value,
                     int defense, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, defense, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    /**
     * The MageArmorFactory class provides a method to create a default MageArmor object.
     */
    public static class MageArmorFactory {

        /**
         * Creates a default MageArmor object with random rarity and default values.
         *
         * @return A new MageArmor object.
         */
        public static MageArmor createMageArmor() {
            return new MageArmor("Magician's Robes", "", generateRandomRarity(), 50, 0, 0, 0, 25);
        }
    }
}
