package LOTR;

public class Item {
    private String name;
    private String rarity;
    private int dmg;
    private int strengthRequirement;
    private int dexterityRequirement;
    private int willPowerRequirement;

    // The internal factory inside the Item class.
    public static class ItemFactory {

        //Melee

        public static Item createShortSword() {
            return normalItemRandom("Short Sword",2,15,15,0);
        }
        public static Item createLongSword(){
            return normalItemRandom("Long Sword",4,20,0,0);
        }
        public static Item createMace(){
            return normalItemRandom("Mace",3,15,15,15);
        }
        public static Item createBattleAxe(){
            return normalItemRandom("Battle Axe",5,25,0,0);
        }
        public static Item createSpear(){
            return normalItemRandom("Spear",4,15,20,0);
        }
        //Range
        //Magic
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
                //TODO Tworzenie broni
    }
    public static Item normalItemRandom(String name,int dmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement){
        int rarity=(int)(Math.random()*3)+1;
        double set=Math.random();
        double quality;
        if (set<0.3) {
            quality = 0.8;
        }
        else if (set>0.9) {
            quality = 1.2;
        }
        else {
            quality = 1;
        }
        return switch (rarity) {
            case 1 -> {
                yield new Item("Common " + name,
                        "Common",
                        (int)(strengthRequirement * quality),
                        (int)(dexterityRequirement * quality),
                        (int)(willPowerRequirement * quality),
                        (int)(willPowerRequirement * quality));
            }
            case 2 -> {
                yield new Item("Uncommon " + name,
                        "Uncommon",
                        (int)(strengthRequirement * 1.5 * quality),
                        (int)(dexterityRequirement * 1.5 * quality),
                        (int)(willPowerRequirement * 1.5 * quality),
                        (int)(willPowerRequirement * 1.5 * quality));
            }
            case 3 -> {
                yield new Item("Rare " + name,
                        "Rare",
                        (int)(strengthRequirement * 2 * quality),
                        (int)(dexterityRequirement * 2 * quality),
                        (int)(willPowerRequirement * 2 * quality),
                        (int)(willPowerRequirement * 2 * quality));
            }
            default -> null;
        };
    }

    public Item(String name,String rarity, int dmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        this.name = name;
        this.rarity=rarity;
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
