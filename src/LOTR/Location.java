package LOTR;

import java.util.Scanner;

/**
 * Represents a location in the Lord of the Rings world.
 */
public class Location {
    private String name;
    private String description;

    /**
     * Constructor to initialize a Location with a name and description.
     *
     * @param name        The name of the location.
     * @param description The description of the location.
     */
    public Location(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * A factory class for creating predefined locations in the Lord of the Rings world.
     */
    public static class LocationFactory {
        /**
         * Creates and returns the Mordor location.
         *
         * @return The Mordor location.
         */
        public static Location createMordor() {
            return new Location("Mordor", "");
        }

        /**
         * Creates and returns the Erebor location.
         *
         * @return The Erebor location.
         */
        public static Location createErebor() {
            return new Location("Erebor", "");
        }

        /**
         * Creates and returns the Minas Tirith location.
         *
         * @return The Minas Tirith location.
         */
        public static Location createMinasTirith() {
            return new Location("Minas Tirith", "");
        }

        /**
         * Creates and returns the Rohan location.
         *
         * @return The Rohan location.
         */
        public static Location createRohan() {
            return new Location("Rohan", "");
        }

        /**
         * Creates and returns the Isengard location.
         *
         * @return The Isengard location.
         */
        public static Location createIsengard() {
            return new Location("Isengard", "");
        }

        /**
         * Creates and returns the Fangorn Forest location.
         *
         * @return The Fangorn Forest location.
         */
        public static Location createFangornForest() {
            return new Location("Fangorn Forest", "");
        }

        /**
         * Creates and returns the Lothlorien location.
         *
         * @return The Lothlorien location.
         */
        public static Location createLothlorien() {
            return new Location("Lothlorien", "");
        }

        /**
         * Creates and returns the Rivendell location.
         *
         * @return The Rivendell location.
         */
        public static Location createRivendell() {
            return new Location("Rivendell", "");
        }

        /**
         * Creates and returns the Bree location.
         *
         * @return The Bree location.
         */
        public static Location createBree() {
            return new Location("Bree", "");
        }

        /**
         * Creates and returns the Shire location.
         *
         * @return The Shire location.
         */
        public static Location createShire() {
            return new Location("Shire", "");
        }
    }

    /**
     * Performs actions related to the provided location and character.
     *
     * @param location The location where the action takes place.
     * @param hero     The character performing the action.
     */
    public static void locationAction(Location location, Character hero) {
        locationMenu(location, hero);
    }

    /**
     * Displays a menu based on the location and takes user input for actions.
     *
     * @param location The location for which the menu is displayed.
     * @param hero     The character interacting with the location.
     */
    public static void locationMenu(Location location, Character hero) {
        Scanner scanner = new Scanner(System.in);

        switch (location.getName()) {
            case "Mordor", "Isengard", "Erebor": {
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Search for Hidden Riches
                        3. Return to the Unexplored Lands
                        """);
                int choice;
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number: ");
                        scanner.next();
                    }
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > 3);

                switch (choice) {
                    case 1: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 2: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 3: {
                        World.mapMenu(hero);
                        break;
                    }
                }
            }
            case "Minas Tirith", "Rohan", "Fangorn Forest": {
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Search for Hidden Riches
                        3. Trade with locals
                        4. Look for some adventure
                        5. Return to the Unexplored Lands""");
                int choice;
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number:");
                        scanner.next();
                    }
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > 5);

                switch (choice) {
                    case 1: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 2: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 3: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 4: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 5: {
                        World.mapMenu(hero);
                        break;
                    }
                }

            }
            case "Shire", "Lothlorien", "Rivendell": {
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Trade with locals
                        3. Look for some adventure
                        4. Return to the Unexplored Lands""");
                int choice;
                do {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number: ");
                        scanner.next();
                    }
                    choice = scanner.nextInt();
                } while (choice < 1 || choice > 4);

                switch (choice) {
                    case 1: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 2: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 3: {
                        HuntForTheEnemies(hero);
                        locationMenu(location, hero);
                        break;
                    }
                    case 4: {
                        World.mapMenu(hero);
                        break;
                    }
                }
                break;
            }
        }
    }

    /**
     * Initiates a battle with enemies for the given hero.
     *
     * @param hero The character initiating the battle.
     */
    public static void HuntForTheEnemies(Character hero) {
        Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1, 1));
    }

    /**
     * Gets the name of the location.
     *
     * @return The name of the location.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the location.
     *
     * @param name The new name for the location.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the location.
     *
     * @return The description of the location.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the location.
     *
     * @param description The new description for the location.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

