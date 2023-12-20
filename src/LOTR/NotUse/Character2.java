//package LOTR;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.Scanner;
//
//@AllArgsConstructor
//@Getter
//@Setter
//
//public class Character {
//    private String name;
//    private int hp;
//    private int strength;
//    private Item[] equipment;
//
//    // Creation of Hero
//    public static Character createHero() {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hero creation");
//
//        System.out.print("Name: ");
//        String name = scanner.next();
//
//        System.out.print("hp: ");
//        int hp = scanner.nextInt();
//
//        System.out.print("strength: ");
//        int strength = scanner.nextInt();
//
//
//        Item[] equipment = new Item[5];
//        equipment[0] = Item.ItemFactory.createCommonSword();
//
//        return new Character(name, hp, strength, equipment);
//
//    }
//
//    // Showing Hero's stats
//    public void showStats() {
//        System.out.println("Name: " + name);
//        System.out.println("Hp: " + hp);
//        System.out.println("Strength: " + strength);
//
//        System.out.println("Equipment:");
//        for (Item item : equipment) {
//            if (item != null) {
//                System.out.println(item.toString());
//            }
//        }
//    }
//
//
//
//
//}
