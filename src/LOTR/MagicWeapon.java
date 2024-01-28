package LOTR;

/**
 * The MagicWeapon class represents a magical weapon in the game, extending the Weapon class.
 */
public class MagicWeapon extends Weapon {

    /**
     * Constructor for creating a MagicWeapon object.
     *
     * @param name                 The name of the magical weapon.
     * @param description          The description of the magical weapon.
     * @param rarity               The rarity level of the magical weapon.
     * @param value                The value of the magical weapon.
     * @param baseDmg              The base damage of the magical weapon.
     * @param strengthRequirement  The strength requirement to wield the magical weapon.
     * @param dexterityRequirement The dexterity requirement to wield the magical weapon.
     * @param willPowerRequirement The willpower requirement to wield the magical weapon.
     */
    public MagicWeapon(String name, String description, int rarity, double value,
                       int baseDmg, int strengthRequirement, int dexterityRequirement,
                       int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement,
                dexterityRequirement, willPowerRequirement);
    }

    /**
     * The MagicWeaponFactory class provides static methods to create specific magical weapons.
     */
    public static class MagicWeaponFactory {

        /**
         * Creates a Magic Staff magical weapon.
         *
         * @return The created Magic Staff magical weapon.
         */
        public static MagicWeapon createStaff() {
            return new MagicWeapon("Magic Staff", "", generateRandomRarity(), 1000, 2, 0, 0, 40);
        }

        /**
         * Creates an Ethereal Wand magical weapon.
         *
         * @return The created Ethereal Wand magical weapon.
         */
        public static MagicWeapon createWand() {
            return new MagicWeapon("Ethereal Wand", "", generateRandomRarity(), 1200, 3, 0, 0, 50);
        }

        /**
         * Creates Gandalf's Wisdom magical weapon.
         *
         * @return The created Gandalf's Wisdom magical weapon.
         */
        public static MagicWeapon createWizardStaff() {
            return new MagicWeapon("Gandalf's Wisdom", "", 5, 5000, 12, 20, 30, 50);
        }
    }
}
