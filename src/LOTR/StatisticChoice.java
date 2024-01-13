package LOTR;


import java.util.Random;
import java.util.Scanner;

public class StatisticChoice {
    // Method for creating a hero with user input
    public static Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int weaponSkill = 0;
        int ballisticSkill = 0;
        int strength = 0;
        int resistance = 0;
        int dexterity = 0;
        int intelligence = 0;
        int willPower = 0;
        int charisma = 0;

        System.out.println("Hero creation");

        System.out.print("Name: ");
        String name = scanner.next();


        int raceChoiceNumber;
        String race = "";

        while (true) {
            System.out.print("Race:\n" +
                    "1. Human\n" +
                    "2. Elf\n" +
                    "3. Dwarf\n" +
                    "4. Hobbit\n" +
                    "5. Maia\n" +
                    "Your choice: ");


            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }

            raceChoiceNumber = scanner.nextInt();

            if (raceChoiceNumber >= 1 && raceChoiceNumber <= 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        switch (raceChoiceNumber) {
            case 1:
                race = "human";
                break;
            case 2:
                race = "elf";
                break;
            case 3:
                race = "dwarf";
                break;
            case 4:
                race = "hobbit";
                break;
            case 5:
                race = "maia";
                break;
            default:
                break;
        }

        System.out.println("Selected race: " + race);


        switch (race) {
            case "human":
                weaponSkill += 20;
                ballisticSkill += 20;
                strength += 20;
                resistance += 20;
                dexterity += 20;
                intelligence += 20;
                willPower += 20;
                charisma += 20;
                break;

            case "elf":
                weaponSkill += 20;
                ballisticSkill += 30;
                strength += 20;
                resistance += 20;
                dexterity += 30;
                intelligence += 20;
                willPower += 20;
                charisma += 20;
                break;

            case "dwarf":
                weaponSkill += 30;
                ballisticSkill += 20;
                strength += 20;
                resistance += 30;
                dexterity += 10;
                intelligence += 20;
                willPower += 20;
                charisma += 10;
                break;

            case "hobbit":
                weaponSkill += 10;
                ballisticSkill += 30;
                strength += 10;
                resistance += 10;
                dexterity += 30;
                intelligence += 20;
                willPower += 20;
                charisma += 30;
                break;

            case "maia":
                weaponSkill += 30;
                ballisticSkill += 30;
                strength += 30;
                resistance += 30;
                dexterity += 30;
                intelligence += 30;
                willPower += 30;
                charisma += 30;
                break;
        }

        System.out.println("""
                It's time to configure your character's statistics.\s
                You have the option to either allocate random amount of points\s
                to your base race stats or personally distribute up to 20 points
                across each statistic as you see fit.
                1. Random points
                2. I choose my destiny""");
        System.out.print("Your choice: ");

        // Validate user input for menu choice
        int pointsDistributionChoice = scanner.nextInt();
        while (pointsDistributionChoice != 1 && pointsDistributionChoice != 2) {
            System.out.println("Please enter a valid choice (1 or 2): ");
            pointsDistributionChoice = scanner.nextInt();
        }

        if (pointsDistributionChoice == 1) {

            weaponSkill += random.nextInt(21);
            ballisticSkill += random.nextInt(21);
            strength += random.nextInt(21);
            resistance += random.nextInt(21);
            dexterity += random.nextInt(21);
            intelligence += random.nextInt(21);
            willPower += random.nextInt(21);
            charisma += random.nextInt(21);

        } else {

            // Weapon Skill with
            System.out.print("Weapon Skill: ");
            int weaponSkillUser = scanner.nextInt();
            while (weaponSkillUser < 0 || weaponSkillUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                weaponSkillUser = scanner.nextInt();
            }
            weaponSkill += weaponSkillUser;

            // Ballistic Skill
            System.out.print("Ballistic Skill: ");
            int ballisticSkillUser = scanner.nextInt();
            while (ballisticSkillUser < 0 || ballisticSkillUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                ballisticSkillUser = scanner.nextInt();
            }
            ballisticSkill += ballisticSkillUser;

            // Strength
            System.out.print("Strength: ");
            int strengthUser = scanner.nextInt();
            while (strengthUser < 0 || strengthUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                strengthUser = scanner.nextInt();
            }
            strength += strengthUser;

            // Resistance
            System.out.print("Resistance: ");
            int resistanceUser = scanner.nextInt();
            while (resistanceUser < 0 || resistanceUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                resistanceUser = scanner.nextInt();
            }
            resistance += resistanceUser;

            // Dexterity
            System.out.print("Dexterity: ");
            int dexterityUser = scanner.nextInt();
            while (dexterityUser < 0 || dexterityUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                dexterityUser = scanner.nextInt();
            }
            dexterity += dexterityUser;

            // Intelligence
            System.out.print("Intelligence: ");
            int intelligenceUser = scanner.nextInt();
            while (intelligenceUser < 0 || intelligenceUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                intelligenceUser = scanner.nextInt();
            }
            intelligence += intelligenceUser;

            // Will Power
            System.out.print("Will Power: ");
            int willPowerUser = scanner.nextInt();
            while (willPowerUser < 0 || willPowerUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                willPowerUser = scanner.nextInt();
            }
            willPower += willPowerUser;

            // Charisma
            System.out.print("Charisma: ");
            int charismaUser = scanner.nextInt();
            while (charismaUser < 0 || charismaUser > 20) {
                System.out.println("Please enter a value between 0 and 20: ");
                charismaUser = scanner.nextInt();
            }
            charisma += charismaUser;


        }

        int attack = 1;
        int health = 10;
        int magic = 0;
        int mana = 0;

//        Item1[] equipment = new Item1[5];
//        equipment[0] = Item.ItemFactory.createCommonSword(); // You can modify this based on your actual equipment representation

        //System.out.println("Congratulations! You've just brought your own hero to life in the enchanting realm of Middle-Earth.");

        return new Character(name, race, weaponSkill, ballisticSkill, strength, resistance, dexterity,
                intelligence, willPower, charisma, attack, health, magic, mana, null, null);
    }
}
