package LOTR;

/**
 * The Elixir class represents an elixir item in the game, extending the Item class.
 * It serves as a base class for elixirs with specific effects.
 */
public class Elixir extends Item {

    /** Indicates whether the elixir effect is permanent. */
    private boolean isPermanent;

    /**
     * Constructor for creating an Elixir object.
     *
     * @param name        The name of the elixir.
     * @param description The description of the elixir.
     * @param rarity      The rarity level of the elixir.
     * @param value       The value of the elixir.
     * @param isPermanent Indicates whether the elixir effect is permanent.
     */
    public Elixir(String name, String description, int rarity, double value, boolean isPermanent) {
        super(name, description, rarity, value);
        this.isPermanent = isPermanent;
    }

    /**
     * Checks if the elixir effect is permanent.
     *
     * @return True if the elixir effect is permanent, false otherwise.
     */
    public boolean isPermanent() {
        return isPermanent;
    }

    /**
     * Sets the permanency of the elixir effect.
     *
     * @param permanent True to make the elixir effect permanent, false otherwise.
     */
    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }
}
