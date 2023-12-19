package LOTR;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Item {
    private String name;
    private int dmg;
    private int strengthRequirement;

    public String toString() {
        return name +  ", dmg = " + dmg + ", Strength requirement = " + strengthRequirement;
    }

    // Fabryka wewnętrzna w klasie Item
    public static class ItemFactory {

        // Może się później przyda
//        public static Item createSword(String name, int dmg, int strengthRequirement) {
//            return new Item(name, dmg, strengthRequirement);
//        }

        public static Item createCommonSword() {
            return new Item("Common Sword", 15, 10);
        }


    }
}
