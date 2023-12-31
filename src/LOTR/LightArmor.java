package LOTR;

public class LightArmor extends Armor {
    private int dexterityRequirement;

    public LightArmor(String name, String description, int rarity, double value, int defense, int dexterityRequirement) {
        super(name, description, rarity, value, defense);
        this.dexterityRequirement = dexterityRequirement;
    }

    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }
}
