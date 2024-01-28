package LOTR;

/**
 * The Item class represents an item in the Lord of the Rings (LOTR) universe.
 * It extends the Equipment class and provides additional attributes such as name,
 * description, rarity, quality, and value.
 */
public class Item extends Equipment {
    private String name;
    private String description;
    private int rarity;
    private int quality;
    private double value;

    /**
     * Constructs an Item object with the specified name, description, rarity, and value.
     * The quality is randomly generated based on the rarity, and the value is calculated
     * using the formula: value = value * rarity * quality.
     *
     * @param name        The name of the item.
     * @param description A brief description of the item.
     * @param rarity      The rarity level of the item.
     * @param value       The base value of the item.
     */
    public Item(String name, String description, int rarity, double value) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.quality = generateRandomQuality(this.rarity);
        this.value = value * this.rarity * this.quality;
    }

    /**
     * Generates a random rarity level based on probability distribution.
     *
     * @return An integer representing the random rarity level (1, 2, or 3).
     */
    public static int generateRandomRarity() {
        double randomRarity = Math.random();
        int rarity;

        if (randomRarity < 0.3) {
            rarity = 2;
        } else if (randomRarity > 0.85) {
            rarity = 3;
        } else {
            rarity = 1;
        }

        return rarity;
    }

    /**
     * Generates a random quality level based on the rarity of the item.
     *
     * @param rarity The rarity level of the item.
     * @return An integer representing the random quality level (1, 2, or 3).
     */
    public static int generateRandomQuality(int rarity) {
        double randomQuality = Math.random();
        int quality;

        if (rarity == 1) {
            if (randomQuality < 0.85) {
                quality = 1;
            } else if (randomQuality < 0.95) {
                quality = 2;
            } else {
                quality = 3;
            }
        } else if (rarity == 2) {
            if (randomQuality < 0.65) {
                quality = 1;
            } else if (randomQuality < 0.85) {
                quality = 2;
            } else {
                quality = 3;
            }
        } else if (rarity == 3) {
            if (randomQuality < 0.45) {
                quality = 1;
            } else if (randomQuality < 0.65) {
                quality = 2;
            } else {
                quality = 3;
            }
        } else {
            quality = 0; // Default quality if rarity is invalid.
        }

        return quality;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name The new name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets a brief description of the item.
     *
     * @return The description of the item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the item.
     *
     * @param description The new description of the item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the value of the item.
     *
     * @return The value of the item.
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the item.
     *
     * @param value The new value of the item.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the rarity level of the item.
     *
     * @return The rarity level of the item.
     */
    public int getRarity() {
        return rarity;
    }

    /**
     * Sets the rarity level of the item.
     *
     * @param rarity The new rarity level of the item.
     */
    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    /**
     * Gets the quality level of the item.
     *
     * @return The quality level of the item.
     */
    public int getQuality() {
        return quality;
    }

    /**
     * Sets the quality level of the item.
     *
     * @param quality The new quality level of the item.
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }
}
