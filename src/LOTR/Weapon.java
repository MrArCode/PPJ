package LOTR;

public class Weapon extends Item {
    private int baseDmg;

    public Weapon(String name, String description, int rarity, double value, int baseDmg) {
        super(name, description, rarity, value);
        this.baseDmg = baseDmg * super.getQuality() * super.getRarity();
    }


    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }
}
