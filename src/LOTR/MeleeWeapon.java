package LOTR;

/**
 * The MeleeWeapon class represents a melee weapon in the game, extending the Weapon class.
 */
public class MeleeWeapon extends Weapon {

    /**
     * Constructor for creating a MeleeWeapon object.
     *
     * @param name                 The name of the melee weapon.
     * @param description          The description of the melee weapon.
     * @param rarity               The rarity level of the melee weapon.
     * @param value                The value of the melee weapon.
     * @param baseDmg              The base damage of the melee weapon.
     * @param strengthRequirement  The strength requirement to wield the melee weapon.
     * @param dexterityRequirement The dexterity requirement to wield the melee weapon.
     * @param willPowerRequirement The willpower requirement to wield the melee weapon.
     */
    public MeleeWeapon(String name, String description, int rarity, double value,
                       int baseDmg, int strengthRequirement, int dexterityRequirement,
                       int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement,
                dexterityRequirement, willPowerRequirement);
    }

    /**
     * The MeleeWeaponFactory class provides static methods to create specific melee weapons.
     */
    public static class MeleeWeaponFactory {

        /**
         * Creates a Dagger melee weapon.
         *
         * @return The created Dagger melee weapon.
         */
        public static MeleeWeapon createDagger() {
            return new MeleeWeapon("Dagger", "", generateRandomRarity(), 30, 1, 5, 0, 0);
        }

        /**
         * Creates a Short Sword melee weapon.
         *
         * @return The created Short Sword melee weapon.
         */
        public static MeleeWeapon createShortSword() {
            return new MeleeWeapon("Short Sword", "", generateRandomRarity(), 50, 2, 10, 0, 0);
        }

        /**
         * Creates a Long Sword melee weapon.
         *
         * @return The created Long Sword melee weapon.
         */
        public static MeleeWeapon createLongSword() {
            return new MeleeWeapon("Long Sword", "", generateRandomRarity(), 200, 5, 30, 0, 0);
        }

        /**
         * Creates a Mace melee weapon.
         *
         * @return The created Mace melee weapon.
         */
        public static MeleeWeapon createMace() {
            return new MeleeWeapon("Mace", "", generateRandomRarity(), 150, 4, 25, 0, 0);
        }

        /**
         * Creates a Warhammer melee weapon.
         *
         * @return The created Warhammer melee weapon.
         */
        public static MeleeWeapon createWarhammer() {
            return new MeleeWeapon("Warhammer", "", generateRandomRarity(), 180, 8, 60, 0, 0);
        }

        /**
         * Creates a Battle Axe melee weapon.
         *
         * @return The created Battle Axe melee weapon.
         */
        public static MeleeWeapon createBattleAxe() {
            return new MeleeWeapon("Battle Axe", "", generateRandomRarity(), 220, 6, 40, 0, 0);
        }

        /**
         * Creates a Greataxe melee weapon.
         *
         * @return The created Greataxe melee weapon.
         */
        public static MeleeWeapon createGreataxe() {
            return new MeleeWeapon("Greataxe", "", generateRandomRarity(), 280, 9, 60, 0, 0);
        }

        /**
         * Creates a Spear melee weapon.
         *
         * @return The created Spear melee weapon.
         */
        public static MeleeWeapon createSpear() {
            return new MeleeWeapon("Spear", "", generateRandomRarity(), 200, 5, 45, 0, 0);
        }

        /**
         * Creates an Aeglos melee weapon.
         *
         * @return The created Aeglos melee weapon.
         */
        public static MeleeWeapon createAeglos() {
            return new MeleeWeapon("Aeglos", "", 4, 10000, 10, 60, 0, 0);
        }

        /**
         * Creates an Andúril melee weapon.
         *
         * @return The created Andúril melee weapon.
         */
        public static MeleeWeapon createAnduril() {
            return new MeleeWeapon("Andúril", "", 5, 100000, 15, 80, 0, 0);
        }
    }
}
