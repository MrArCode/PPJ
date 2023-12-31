package LOTR;

public class MageArmor extends Armor {
    private int willPowerRequirement;

    public MageArmor(String name, String description, int rarity, double value, int defense, int willPowerRequirement) {
        super(name, description, rarity, value, defense);
        this.willPowerRequirement = willPowerRequirement;
    }

    public int getWillPowerRequirement() {
        return willPowerRequirement;
    }

    public void setWillPowerRequirement(int willPowerRequirement) {
        this.willPowerRequirement = willPowerRequirement;
    }
}
