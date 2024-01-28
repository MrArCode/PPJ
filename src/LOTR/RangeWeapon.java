package LOTR;

/**
 * The RangeWeapon class represents a ranged weapon in the game, extending the Weapon class.
 */
public class RangeWeapon extends Weapon {

    /**
     * Constructor for creating a RangeWeapon object.
     *
     * @param name                 The name of the ranged weapon.
     * @param description          The description of the ranged weapon.
     * @param rarity               The rarity level of the ranged weapon.
     * @param value                The value of the ranged weapon.
     * @param baseDmg              The base damage of the ranged weapon.
     * @param strengthRequirement  The strength requirement to wield the ranged weapon.
     * @param dexterityRequirement The dexterity requirement to wield the ranged weapon.
     * @param willPowerRequirement The willpower requirement to wield the ranged weapon.
     */
    public RangeWeapon(String name, String description, int rarity, double value,
                       int baseDmg, int strengthRequirement, int dexterityRequirement,
                       int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement,
                dexterityRequirement, willPowerRequirement);
    }

    /**
     * The RangeWeaponFactory class provides static methods to create specific ranged weapons.
     */
    public static class RangeWeaponFactory {

        /**
         * Creates a Bow ranged weapon.
         *
         * @return The created Bow ranged weapon.
         */
        public static RangeWeapon createBow() {
            return new RangeWeapon("Bow", "", generateRandomRarity(), 200, 5, 0, 30, 0);
        }

        /**
         * Creates a CrossBow ranged weapon.
         *
         * @return The created CrossBow ranged weapon.
         */
        public static RangeWeapon createCrossBow() {
            return new RangeWeapon("CrossBow", "", generateRandomRarity(), 400, 10, 0, 60, 0);
        }

        /**
         * Creates a Throwing Knife ranged weapon.
         *
         * @return The created Throwing Knife ranged weapon.
         */
        public static RangeWeapon createThrowingKnife() {
            return new RangeWeapon("Throwing Knife", "", generateRandomRarity(), 50, 3, 0, 45, 0);
        }

        /**
         * Creates a Longbow ranged weapon.
         *
         * @return The created Longbow ranged weapon.
         */
        public static RangeWeapon createLongbow() {
            return new RangeWeapon("Longbow", "", generateRandomRarity(), 300, 8, 0, 50, 0);
        }

        /**
         * Creates a Sling ranged weapon.
         *
         * @return The created Sling ranged weapon.
         */
        public static RangeWeapon createSling() {
            return new RangeWeapon("Sling", "", generateRandomRarity(), 100, 2, 0, 20, 0);
        }
    }
}
