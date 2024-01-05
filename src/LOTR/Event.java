package LOTR;

public class Event {
    private String name;
    private String description;
    private Location location;

    public Event(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public static void randomEventsForEachLocation(Location location, Character hero){
        switch (location.getName()){
            case "Mordor" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,1));
            }
        }

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
