package LOTR;

public class Elixir extends Item{
    private boolean isPermanent;

    public Elixir(String name, String description, int rarity, double value, boolean isPermanent) {
        super(name, description, rarity, value);
        this.isPermanent = isPermanent;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }
}
