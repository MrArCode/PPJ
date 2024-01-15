package LOTR;

public class RangeWeapon extends Weapon {

    public RangeWeapon(String name, String description, int rarity, double value, int baseDmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class RangeWeaponFactory {

        public static RangeWeapon createBow() {
            return new RangeWeapon("Bow", "", generateRandomRarity(), 200, 5, 0, 30, 0);
        }

        public static RangeWeapon createCrossBow() {
            return new RangeWeapon("CrossBow", "", generateRandomRarity(), 400, 10, 0, 60, 0);
        }

        public static RangeWeapon createThrowingKnife() {
            return new RangeWeapon("Throwing Knife", "", generateRandomRarity(), 50, 3, 0, 45, 0);
        }

        public static RangeWeapon createLongbow() {
            return new RangeWeapon("Longbow", "", generateRandomRarity(), 300, 8, 0, 50, 0);
        }

        public static RangeWeapon createSling() {
            return new RangeWeapon("Sling", "", generateRandomRarity(), 100, 2, 0, 20, 0);
        }


    }

}
