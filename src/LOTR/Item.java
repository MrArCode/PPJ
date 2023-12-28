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
            return normalItemRandom("Short Sword", 2, 15, 15, 0);
        }

        public static Item createLongSword() {
            return normalItemRandom("Long Sword", 4, 20, 0, 0);
        }

        public static Item createMace() {
            return normalItemRandom("Mace", 3, 15, 15, 15);
        }

        public static Item createBattleAxe() {
            return normalItemRandom("Battle Axe", 5, 25, 0, 0);
        }

        public static Item createSpear() {
            return normalItemRandom("Spear", 4, 15, 20, 0);
        }
        public static Item createAeglos() {
            return new Item("Aeglos","Epic", 13, 40, 25, 25);
        }
        public static Item createAnduril() {
            return new Item("Andúril","Legendary", 18, 55, 35, 30);
        }

        //Range

        public static Item createBow() {
            return normalItemRandom("Bow", 3, 10, 25, 0);
        }
        public static Item createCrossbow() {
            return normalItemRandom("Crossbow", 5, 25, 20, 0);
        }

        //Magic

        public static Item createStaff() {
            return normalItemRandom("Staff", 3, 5, 15, 25);
        }
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
//        public static Item create
        //TODO Tworzenie broni
    }

    public static Item normalItemRandom(String name, int dmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        double rndrarity = Math.random();
        int rarity;
        if (rndrarity < 0.3) {
            rarity = 2;
        } else if (rndrarity > 0.85) {
            rarity = 3;
        } else rarity = 1;

        double set = Math.random();
        double quality;
        if (set < 0.3) {
            quality = 0.8;
        } else if (set > 0.9) {
            quality = 1.2;
        } else {
            quality = 1;
        }
        return switch (rarity) {
            case 1 -> {
                yield new Item("Common " + name,
                        "Common",
                        (int) (dmg * quality),
                        (int) (strengthRequirement * quality),
                        (int) (dexterityRequirement * quality),
                        (int) (willPowerRequirement * quality));
            }
            case 2 -> {
                yield new Item("Uncommon " + name,
                        "Uncommon",
                        (int) (dmg * quality * 1.3),
                        (int) (strengthRequirement * quality * 1.3),
                        (int) (dexterityRequirement * quality * 1.3),
                        (int) (willPowerRequirement * quality * 1.3));
            }
            case 3 -> {
                yield new Item("Rare " + name,
                        "Rare",
                        (int) (dmg * quality * 1.7),
                        (int) (strengthRequirement * quality * 1.7),
                        (int) (dexterityRequirement * quality * 1.7),
                        (int) (willPowerRequirement * quality * 1.7));
            }
            default -> null;
        };
    }

    public Item(String name, String rarity, int dmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        this.name = name;
        this.rarity = rarity;
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
