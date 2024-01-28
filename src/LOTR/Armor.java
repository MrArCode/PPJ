package LOTR;

/**
 * Class representing armor in the world of "Lord of the Rings".
 * Extends the Item class.
 */
public class Armor extends Item {

    private int defense;
    private int strengthRequirement;
    private int dexterityRequirement;
    private int willPowerRequirement;

    /**
     * Constructor for the Armor class.
     *
     * @param name                 The name of the armor.
     * @param description          Description of the armor.
     * @param rarity               Rarity of the armor.
     * @param value                Value of the armor.
     * @param defense              Defense value of the armor.
     * @param strengthRequirement  Required strength to wear the armor.
     * @param dexterityRequirement Required dexterity to wear the armor.
     * @param willPowerRequirement Required willpower to wear the armor.
     */
    public Armor(String name, String description, int rarity, double value,
                 int defense, int strengthRequirement, int dexterityRequirement,
                 int willPowerRequirement) {
        super(name, description, rarity, value);
        this.defense = defense;
        this.strengthRequirement = strengthRequirement;
        this.dexterityRequirement = dexterityRequirement;
        this.willPowerRequirement = willPowerRequirement;
    }

    /**
     * Gets the defense value of the armor.
     *
     * @return Defense value of the armor.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense value of the armor.
     *
     * @param defense New defense value of the armor.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Gets the required strength to wear the armor.
     *
     * @return Required strength to wear the armor.
     */
    public int getStrengthRequirement() {
        return strengthRequirement;
    }

    /**
     * Sets the required strength to wear the armor.
     *
     * @param strengthRequirement New required strength to wear the armor.
     */
    public void setStrengthRequirement(int strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    /**
     * Gets the required dexterity to wear the armor.
     *
     * @return Required dexterity to wear the armor.
     */
    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    /**
     * Sets the required dexterity to wear the armor.
     *
     * @param dexterityRequirement New required dexterity to wear the armor.
     */
    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }

    /**
     * Gets the required willpower to wear the armor.
     *
     * @return Required willpower to wear the armor.
     */
    public int getWillPowerRequirement() {
        return willPowerRequirement;
    }

    /**
     * Sets the required willpower to wear the armor.
     *
     * @param willPowerRequirement New required willpower to wear the armor.
     */
    public void setWillPowerRequirement(int willPowerRequirement) {
        this.willPowerRequirement = willPowerRequirement;
    }
}
