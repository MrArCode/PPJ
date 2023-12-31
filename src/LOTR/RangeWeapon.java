package LOTR;

public class RangeWeapon extends Weapon {
    private int dexterityRequirement;

    public RangeWeapon(String name, String description, int rarity, double value, int baseDmg, int dexterityRequirement) {
        super(name, description, rarity, value, baseDmg);
        this.dexterityRequirement = dexterityRequirement;
    }

    public static class RangeWeaponFactory {

        public static RangeWeapon createBow() {
            return new RangeWeapon("Bow", "", generateRandomRarity(), 200, 5, 30);
        }

        public static RangeWeapon createCrossBow() {
            return new RangeWeapon("CrossBow", "", generateRandomRarity(), 400, 10, 60);
        }
    }


    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }
}
