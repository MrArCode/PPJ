package LOTR;

public class HeavyArmor extends Armor {
    private int strengthRequirement;

    public HeavyArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement) {
        super(name, description, rarity, value, defense);
        this.strengthRequirement = strengthRequirement;
    }

    public int getStrengthRequirement() {
        return strengthRequirement;
    }

    public void setStrengthRequirement(int strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }
}
