package LOTR;

public class MagicWeapon extends Weapon {
    private int willPowerRequirement;

    public MagicWeapon(String name, String description, int rarity, double value, int baseDmg, int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg);
        this.willPowerRequirement = willPowerRequirement;
    }

    public static class MagicWeaponFactory {
        public static MagicWeapon createStaff() {
            return new MagicWeapon("Magic Staff", "", generateRandomRarity(), 1000, 2, 40);
        }
    }


    public int getWillPowerRequirement() {
        return willPowerRequirement;
    }

    public void setWillPowerRequirement(int willPowerRequirement) {
        this.willPowerRequirement = willPowerRequirement;
    }
}
