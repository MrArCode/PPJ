package LOTR;

/**
 * The Weapon class represents a type of item specifically designed for combat, with various attributes.
 * It extends the Item class.
 */
public class Weapon extends Item {
    private int baseDmg;
    private int strengthRequirement;
    private int dexterityRequirement;
    private int willPowerRequirement;

    /**
     * Constructor for creating a Weapon object with the specified attributes.
     *
     * @param name                 The name of the weapon.
     * @param description          The description of the weapon.
     * @param rarity               The rarity level of the weapon.
     * @param value                The value of the weapon.
     * @param baseDmg              The base damage of the weapon.
     * @param strengthRequirement  The strength requirement for wielding the weapon.
     * @param dexterityRequirement The dexterity requirement for wielding the weapon.
     * @param willPowerRequirement The willpower requirement for wielding the weapon.
     */
    public Weapon(String name, String description, int rarity, double value,
                  int baseDmg, int strengthRequirement, int dexterityRequirement, int willPowerRequirement) {
        super(name, description, rarity, value);
        this.baseDmg = baseDmg * super.getQuality() * super.getRarity();
        this.strengthRequirement = strengthRequirement;
        this.dexterityRequirement = dexterityRequirement;
        this.willPowerRequirement = willPowerRequirement;
    }

    /**
     * Gets the strength requirement for wielding the weapon.
     *
     * @return The strength requirement.
     */
    public int getStrengthRequirement() {
        return strengthRequirement;
    }

    /**
     * Sets the strength requirement for wielding the weapon.
     *
     * @param strengthRequirement The new strength requirement.
     */
    public void setStrengthRequirement(int strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    /**
     * Gets the dexterity requirement for wielding the weapon.
     *
     * @return The dexterity requirement.
     */
    public int getDexterityRequirement() {
        return dexterityRequirement;
    }

    /**
     * Sets the dexterity requirement for wielding the weapon.
     *
     * @param dexterityRequirement The new dexterity requirement.
     */
    public void setDexterityRequirement(int dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }

    /**
     * Gets the willpower requirement for wielding the weapon.
     *
     * @return The willpower requirement.
     */
    public int getWillPowerRequirement() {
        return willPowerRequirement;
    }

    /**
     * Sets the willpower requirement for wielding the weapon.
     *
     * @param willPowerRequirement The new willpower requirement.
     */
    public void setWillPowerRequirement(int willPowerRequirement) {
        this.willPowerRequirement = willPowerRequirement;
    }

    /**
     * Gets the base damage of the weapon.
     *
     * @return The base damage.
     */
    public int getBaseDmg() {
        return baseDmg;
    }

    /**
     * Sets the base damage of the weapon.
     *
     * @param baseDmg The new base damage.
     */
    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }
}
