package LOTR;

public class MediumArmor extends Armor{
    private int strengthRequirement;
    private int dexterityRequirement;

    public MediumArmor(String name, String description, int rarity, double value, int defense, int strengthRequirement, int dexterityRequirement) {
        super(name, description, rarity, value, defense);
        this.strengthRequirement = strengthRequirement;
        this.dexterityRequirement = dexterityRequirement;
    }

    public int getStrengthRequirement() {
        return strengthRequirement;
    }

    public void setStrengthRequirement(int strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }
}
