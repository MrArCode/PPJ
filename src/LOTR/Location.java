package LOTR;

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
    }







    public static void locationAction(Location location, Character hero){
        System.out.println("You come to dark land of " + location.getName());
        Event.randomEventsForEachLocation(location, hero);
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
