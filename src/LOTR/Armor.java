package LOTR;

public class Armor extends Item{
    private int defense;

    public Armor(String name, String description, int rarity, double value, int defense) {
        super(name, description, rarity, value);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
