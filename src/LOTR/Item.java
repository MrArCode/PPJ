package LOTR;

public class Item extends Equipment {
    private String name;
    private String description;
    private int rarity;
    private int quality;
    private double value;

    public Item(String name, String description, int rarity, double value) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.quality = generateRandomQuality(this.rarity);
        this.value = value * this.rarity * this.quality;
    }

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
            quality = 0;
        }

        return quality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}