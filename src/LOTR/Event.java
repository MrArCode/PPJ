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

    public static void randomEventsForEachLocationWhenEntering(Location location, Character hero){
        switch (location.getName()){
            case "Mordor" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,1));
            }
            case "Erebor" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,2));
            }
            case "Minas Tirith" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,3));
            }
            case "Rohan" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,4));
            }
            case "Isengard" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,5));
            }
            case "Fangorn Forest" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,6));
            }
            case "Lothlorien" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,7));
            }
            case "Rivendell" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,8));
            }
            case "Shire" ->{
                Battle.battle(hero, Monster.EnemyGroupGenerator.generateGroupOfEnemy(1,9));
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
