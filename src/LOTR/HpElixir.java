package LOTR;

/**
 * The HpElixir class represents a health elixir in the game, extending the Elixir class.
 * It specifically focuses on restoring and adding health points.
 */
public class HpElixir extends Elixir {

    /** The number of health points restored by the elixir. */
    private int numberOfHpPointsRestored;

    /** The number of health points added by the elixir. */
    private int numberOfHpPointsAdded;

    /**
     * Constructor for creating an HpElixir object.
     *
     * @param name                      The name of the health elixir.
     * @param description               The description of the health elixir.
     * @param rarity                    The rarity level of the health elixir.
     * @param value                     The value of the health elixir.
     * @param isPermanent               Indicates whether the elixir effect is permanent.
     * @param numberOfHpPointsRestored The initial number of health points restored by the elixir.
     * @param numberOfHpPointsAdded    The initial number of health points added by the elixir.
     */
    public HpElixir(String name, String description, int rarity, double value,
                    boolean isPermanent, int numberOfHpPointsRestored, int numberOfHpPointsAdded) {
        super(name, description, rarity, value, isPermanent);
        this.numberOfHpPointsRestored = numberOfHpPointsRestored * rarity * getQuality();
        this.numberOfHpPointsAdded = numberOfHpPointsAdded * rarity * getQuality();
    }

    /**
     * The HpElixirFactory class provides static methods to create specific health elixirs.
     */
    public static class HpElixirFactory {

        /**
         * Creates a standard HpElixir with random rarity.
         *
         * @return The created HpElixir object.
         */
        public static HpElixir createHpElixir() {
            return new HpElixir("Hp Elixir", "", generateRandomRarity(), 100, false, 1, 0);
        }

        /**
         * Creates a permanent HpElixir with random rarity.
         *
         * @return The created permanent HpElixir object.
         */
        public static HpElixir createPermanentHpElixir() {
            return new HpElixir("Permanent Hp Elixir", "", generateRandomRarity(), 2000, true, 1, 1);
        }
    }

    /**
     * Gets the number of health points restored by the elixir.
     *
     * @return The number of health points restored.
     */
    public int getNumberOfHpPointsRestored() {
        return numberOfHpPointsRestored;
    }

    /**
     * Sets the number of health points restored by the elixir.
     *
     * @param numberOfHpPointsRestored The new number of health points restored.
     */
    public void setNumberOfHpPointsRestored(int numberOfHpPointsRestored) {
        this.numberOfHpPointsRestored = numberOfHpPointsRestored;
    }

    /**
     * Gets the number of health points added by the elixir.
     *
     * @return The number of health points added.
     */
    public int getNumberOfHpPointsAdded() {
        return numberOfHpPointsAdded;
    }

    /**
     * Sets the number of health points added by the elixir.
     *
     * @param numberOfHpPointsAdded The new number of health points added.
     */
    public void setNumberOfHpPointsAdded(int numberOfHpPointsAdded) {
        this.numberOfHpPointsAdded = numberOfHpPointsAdded;
    }
}
