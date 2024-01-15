package LOTR;


import java.util.Random;
import java.util.Scanner;

public class StatisticAndProfessionChoice {

    public static Character createHero() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] mainStats;

        int attack = 1;
        int health = 10;
        int magic = 0;
        int mana = 0;

        CharacterProfession profession;

        // Creation of hero

        System.out.println("Hero creation");

        String name = chooseName(scanner);
        String race = chooseRace(scanner);
        mainStats = mainStatsDistributionAccordingToRace(race);
        mainStatsChooseByPlayer(mainStats, scanner, random);
        profession = CharacterProfession.chooseCharacterProfession();
        mainPointsFromProfession(profession, mainStats);

        attack += profession.getAttack();
        health += profession.getHealth();
        magic += profession.getMagic();
        mana += profession.getMana();

        int weaponSkill = mainStats[0];
        int ballisticSkill = mainStats[1];
        int strength = mainStats[2];
        int resistance = mainStats[3];
        int dexterity = mainStats[4];
        int intelligence = mainStats[5];
        int willPower = mainStats[6];
        int charisma = mainStats[7];

        return new Character(name, race, weaponSkill, ballisticSkill, strength, resistance, dexterity,
                intelligence, willPower, charisma, attack, health, magic, mana, profession, null);
    }

    public static String chooseName(Scanner scanner) {
        System.out.print("Name: ");
        return scanner.next();
    }

    public static String chooseRace(Scanner scanner) {

        int raceChoiceNumber;
        String race = "";

        while (true) {
            System.out.print("""
                    Race:
                    1. Human
                    2. Elf
                    3. Dwarf
                    4. Hobbit
                    5. Maia
                    Your choice:\s""");


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
            case 1 -> race = "human";
            case 2 -> race = "elf";
            case 3 -> race = "dwarf";
            case 4 -> race = "hobbit";
            case 5 -> race = "maia";
        }

        System.out.println("Selected race: " + race);
        return race;
    }

    public static int[] mainStatsDistributionAccordingToRace(String race) {
        int[] mainStats = new int[8];

        int[][] raceStats = {
                {20, 20, 20, 20, 20, 20, 20, 20},  // human
                {20, 30, 20, 20, 30, 20, 20, 20},  // elf
                {30, 20, 20, 30, 10, 20, 20, 10},  // dwarf
                {10, 30, 10, 10, 30, 20, 20, 30},  // hobbit
                {30, 30, 30, 30, 30, 30, 30, 30}   // maia
        };

        switch (race) {
            case "human", "elf", "dwarf", "hobbit", "maia" -> {
                int index = switch (race) {
                    case "human" -> 0;
                    case "elf" -> 1;
                    case "dwarf" -> 2;
                    case "hobbit" -> 3;
                    case "maia" -> 4;
                    default -> -1;
                };

                if (index != -1) {
                    for (int i = 0; i < 8; i++) {
                        mainStats[i] += raceStats[index][i];
                    }
                }
            }
        }

        return mainStats;
    }

    public static void mainStatsChooseByPlayer(int[] mainStats, Scanner scanner, Random random) {
        System.out.println("""
                It's time to configure your character's statistics.\s
                You have the option to either allocate a random amount of points\s
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
            for (int i = 0; i < 8; i++) {
                mainStats[i] += random.nextInt(21);
            }
        } else {
            String[] statNames = {"Weapon Skill", "Ballistic Skill", "Strength", "Resistance", "Dexterity", "Intelligence", "Will Power", "Charisma"};

            for (int i = 0; i < 8; i++) {
                mainStats[i] += getUserInputInRange(scanner, statNames[i]);
            }
        }

    }

    private static int getUserInputInRange(Scanner scanner, String statName) {
        System.out.print(statName + ": ");
        int userInput = scanner.nextInt();
        while (userInput < 0 || userInput > 20) {
            System.out.println("Please enter a value between 0 and 20: ");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public static void mainPointsFromProfession(CharacterProfession profession, int[] mainStats) {

        mainStats[0] += profession.getWeaponSkill();
        mainStats[1] += profession.getBallisticSkill();
        mainStats[2] += profession.getStrength();
        mainStats[3] += profession.getResistance();
        mainStats[4] += profession.getDexterity();
        mainStats[5] += profession.getIntelligence();
        mainStats[6] += profession.getWillPower();
        mainStats[7] += profession.getCharisma();

    }


}
