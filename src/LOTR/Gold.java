package LOTR;

public class Gold extends Item{
    private int amount;

    public Gold(String name, String description, int rarity, double value, int amount) {
        super(name, description, rarity, value);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
