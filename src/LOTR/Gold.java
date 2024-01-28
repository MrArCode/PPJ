package LOTR;

/**
 * The Gold class represents a type of item in the game, specifically representing gold currency.
 * It extends the Item class.
 */
public class Gold extends Item {
    private int amount;

    /**
     * Constructor for creating a Gold object.
     *
     * @param name        The name of the gold currency.
     * @param description The description of the gold currency.
     * @param rarity      The rarity level of the gold currency.
     * @param value       The value of the gold currency.
     * @param amount      The amount of gold coins.
     */
    public Gold(String name, String description, int rarity, double value, int amount) {
        super(name, description, rarity, value);
        this.amount = amount;
    }

    /**
     * The GoldFactory class provides static methods to create specific amounts of gold currency.
     */
    public static class GoldFactory {

        /**
         * Creates 100 Gold Coins.
         *
         * @return The created Gold object with 100 coins.
         */
        public static Gold createGoldCoins100() {
            return new Gold("Gold Coin", "", 0, 0, 100);
        }

        /**
         * Creates 1000 Gold Coins.
         *
         * @return The created Gold object with 1000 coins.
         */
        public static Gold createGoldCoins1000() {
            return new Gold("Gold Coin", "", 0, 0, 1000);
        }

        /**
         * Creates 10000 Gold Coins.
         *
         * @return The created Gold object with 10000 coins.
         */
        public static Gold createGoldCoins10000() {
            return new Gold("Gold Coin", "", 0, 0, 10000);
        }
    }

    /**
     * Gets the amount of gold coins.
     *
     * @return The amount of gold coins.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount of gold coins.
     *
     * @param amount The new amount of gold coins.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
