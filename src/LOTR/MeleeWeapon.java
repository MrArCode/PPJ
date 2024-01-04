package LOTR;

public class MeleeWeapon extends Weapon {


    public MeleeWeapon(String name, String description, int rarity, double value, int baseDmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value, baseDmg, strengthRequirement, dexterityRequirement, willPowerRequirement);
    }

    public static class MeleeWeaponFactory {
        public static MeleeWeapon createShortSword() {
            return new MeleeWeapon("Short Sword", "", generateRandomRarity(), 50, 2, 10,0,0);
        }

        public static MeleeWeapon createLongSword() {
            return new MeleeWeapon("Long Sword", "", generateRandomRarity(), 200, 5, 30,0,0);
        }

        public static MeleeWeapon createMace() {
            return new MeleeWeapon("Mace", "", generateRandomRarity(), 150, 4, 25,0,0);
        }

        public static MeleeWeapon createBattleAxe() {
            return new MeleeWeapon("Battle Axe", "", generateRandomRarity(), 220, 6, 40,0,0);
        }

        public static MeleeWeapon createSpear() {
            return new MeleeWeapon("Spear", "", generateRandomRarity(), 200, 5, 45,0,0);
        }

        public static MeleeWeapon createAeglos() {
            return new MeleeWeapon("Aeglos", "", 4, 10000, 10, 60,0,0);
        }

        public static MeleeWeapon createAnduril() {
            return new MeleeWeapon("Andúril", "", 5, 100000, 15, 80,0,0);
        }
    }
}
