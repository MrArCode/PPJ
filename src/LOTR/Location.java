package LOTR;

import java.util.Scanner;

public class Location {
    private String name;
    private String description;


    public Location(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public static class LocationFactory {
        public static Location crateMordor() {
            return new Location("Mordor", "");
        }

        public static Location createErebor() {
            return new Location("Erebor", "");
        }

        public static Location createMinasTirith() {
            return new Location("Minas Tirith", "");
        }

        public static Location createRohan() {
            return new Location("Rohan", "");
        }

        public static Location createIsengard() {
            return new Location("Isengard", "");
        }

        public static Location createFangornForest() {
            return new Location("Fangorn Forest", "");
        }

        public static Location createLothlorien() {
            return new Location("Lothlorien", "");
        }

        public static Location createRivendell() {
            return new Location("Rivendell", "");
        }

        public static Location createBree() {
            return new Location("Bree", "");
        }

        public static Location createShire() {
            return new Location("Shire", "");
        }


    }


    public static void locationAction(Location location, Character hero) {
        locationMenu(location, hero);

        //TODO TUTAj do poporwy te ewnty
        //Event.randomEventsForEachLocationWhenEntering(location, hero);
    }


    public static void locationMenu(Location location, Character hero){

        Scanner scanner = new Scanner(System.in);

        switch (location.getName()){
            case "Mordor", "Isengard","Erebor": {
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Search for Hidden Riches
                        3. Return to the Unexplored Lands
                        """);
                int choice = scanner.nextInt();
                switch (choice){
                    case 1 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 2 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 3:{
                        World.mapMenu(hero);
                    }
                }
            }
            case "Minas Tirith","Rohan","Fangorn Forest":{
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Search for Hidden Riches
                        3. Trade with locals
                        4. Look for some adventure
                        5. Return to the Unexplored Lands""");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 2 :{
                        //TODO Cos tu ma byc
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 3 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 4 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 5:{
                        World.mapMenu(hero);
                    }
                }

            }
            case "Shire", "Lothlorien", "Rivendell":{
                System.out.println("You come to " + location.getName());
                System.out.println("Choose your action: ");
                System.out.println("""
                        1. Hunt for the enemies
                        2. Trade with locals
                        3. Look for some adventure
                        4. Return to the Unexplored Lands""");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 2 :{
                        //TODO Cos tu ma byc
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 3 :{
                        HuntForTheEnemies(hero);
                        locationMenu(location,hero);
                    }
                    case 4:{
                        World.mapMenu(hero);
                    }
                }
            }
        }
    }

    public static void HuntForTheEnemies(Character hero){
        Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfGoblins(1,1));
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

}
