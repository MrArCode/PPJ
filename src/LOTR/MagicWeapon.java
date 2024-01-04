package LOTR;

public class MagicWeapon extends Weapon {

    public MagicWeapon(String name, String description, int rarity, double value, int baseDmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class MagicWeaponFactory {
        public static MagicWeapon createStaff() {
            return new MagicWeapon("Magic Staff", "", generateRandomRarity(), 1000, 2, 0, 0, 40);
        }
    }
}



