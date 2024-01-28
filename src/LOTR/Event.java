package LOTR;

/**
 * The Event class represents a specific event that can occur in a location.
 * It includes details such as name, description, and the associated location.
 */
public class Event {
    private String name;
    private String description;
    private Location location;

    /**
     * Constructs an Event object with the specified name, description, and location.
     *
     * @param name        The name of the event.
     * @param description The description of the event.
     * @param location    The location where the event occurs.
     */
    public Event(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    /**
     * Generates a random event for the specified location when entering it.
     * The event type is determined based on the location, and a battle with generated enemies is initiated.
     *
     * @param location The location where the event occurs.
     * @param hero     The character (hero) involved in the event.
     */
    public static void randomEventsForEachLocationWhenEntering(Location location, Character hero) {
        switch (location.getName()) {
            case "Mordor" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 1));
            }
            case "Erebor" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 2));
            }
            case "Minas Tirith" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 3));
            }
            case "Rohan" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 4));
            }
            case "Isengard" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 5));
            }
            case "Fangorn Forest" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 6));
            }
            case "Lothlorien" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 7));
            }
            case "Rivendell" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 8));
            }
            case "Shire" -> {
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 9));
            }
        }
    }

    /**
     * Gets the name of the event.
     *
     * @return The name of the event.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the event.
     *
     * @param name The new name for the event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the event.
     *
     * @return The description of the event.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the event.
     *
     * @param description The new description for the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the location associated with the event.
     *
     * @return The location where the event occurs.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the location associated with the event.
     *
     * @param location The new location for the event.
     */
    public void setLocation(Location location) {
        this.location = location;
    }
}
