package LOTR;

public class Item {
    private String name;
    private int dmg;
    private int strengthRequirement;
    private int dexterityRequirement;
    private int willPowerRequirement;

    // The internal factory inside the Item class.
    public static class ItemFactory {
        public static Item createCommonSword() {
            return new Item("Common Sword", 15, 10,0,0);
        }
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
                //TODO Tworzenie broni
    }

    public Item(String name, int dmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        this.name = name;
        this.dmg = dmg;
        this.strengthRequirement = strengthRequirement;
        this.dexterityRequirement = dexterityRequirement;
        this.willPowerRequirement = willPowerRequirement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
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

    public int getWillPowerRequirement() {
        return willPowerRequirement;
    }

    public void setWillPowerRequirement(int willPowerRequirement) {
        this.willPowerRequirement = willPowerRequirement;
    }
}
