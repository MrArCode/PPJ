package LOTR;

import java.util.Random;
import java.util.Scanner;

/**
 * The StatisticAndProfessionChoice class is responsible for handling the creation of characters
 * in the Lord of the Rings (LOTR) game. It provides methods for choosing a character's name, race,
 * and profession, as well as distributing main statistics and creating the character accordingly.
 */
public class StatisticAndProfessionChoice {

    /**
     * Creates and returns a new character by guiding the player through the process of choosing
     * the character's name, race, profession, and distributing main statistics.
     *
     * @return The created character with chosen attributes.
     */
    public static Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] mainStats;

        int attack = 1;
        int health = 10;
        int magic = 0;
        int mana = 0;

        CharacterProfession profession;

        // Creation of hero
        System.out.println();
        System.out.println("It is now the hour to create the protagonist, destined to traverse the realms of Middle-earth.");

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





    /**
     * Prompts the user to enter a name using the provided Scanner object.
     * Assumes that the user will input a single word as the character's name.
     *
     * @param scanner The Scanner object used to read input from the user.
     * @return A String representing the name entered by the user.
     */
    public static String chooseName(Scanner scanner) {
        System.out.print("Enter the character's name: ");
        return scanner.next();
    }


    /**
     * Prompts the user to choose a race by displaying a menu with options and
     * validating the user's input.
     *
     * @param scanner The Scanner object used to read input from the user.
     * @return A String representing the chosen race ('human', 'elf', 'dwarf', 'hobbit', or 'maia').
     */
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


    /**
     * Determines the initial main statistics distribution for a character based on their chosen race.
     *
     * @param race A String representing the chosen race ('human', 'elf', 'dwarf', 'hobbit', or 'maia').
     * @return An array of integers representing the initial main statistics distribution.
     *         The array follows the order: [weaponSkill, ballisticSkill, strength, resistance, dexterity,
     *         intelligence, willPower, charisma].
     */
    public static int[] mainStatsDistributionAccordingToRace(String race) {
        int[] mainStats = new int[8];

        // Initial main statistics distribution for each race
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

                // Increment the main statistics based on the chosen race
                if (index != -1) {
                    for (int i = 0; i < 8; i++) {
                        mainStats[i] += raceStats[index][i];
                    }
                }
            }
        }

        return mainStats;
    }


    /**
     * Allows the player to configure the character's main statistics by choosing between random allocation
     * and personal distribution of points. The method updates the provided mainStats array accordingly.
     *
     * @param mainStats The array representing the character's main statistics to be updated.
     *                 The array follows the order: [weaponSkill, ballisticSkill, strength, resistance,
     *                 dexterity, intelligence, willPower, charisma].
     * @param scanner   The Scanner object used to read input from the player.
     * @param random    The Random object used for generating random points.
     */
    public static void mainStatsChooseByPlayer(int[] mainStats, Scanner scanner, Random random) {
        System.out.println();
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
            // Randomly allocate points
            for (int i = 0; i < 8; i++) {
                mainStats[i] += random.nextInt(21);
            }
        } else {
            // Personally distribute points
            String[] statNames = {"Weapon Skill", "Ballistic Skill", "Strength", "Resistance", "Dexterity", "Intelligence", "Will Power", "Charisma"};

            for (int i = 0; i < 8; i++) {
                mainStats[i] += getUserInputInRange(scanner, statNames[i]);
            }
        }
    }


    /**
     * Prompts the user to enter a value for a specific character statistic within the range [0, 20].
     *
     * @param scanner   The Scanner object used to read input from the user.
     * @param statName  A String representing the name of the character statistic (e.g., "Weapon Skill").
     * @return An integer representing the user's input within the specified range.
     */
    private static int getUserInputInRange(Scanner scanner, String statName) {
        System.out.print(statName + ": ");
        int userInput = scanner.nextInt();
        while (userInput < 0 || userInput > 20) {
            System.out.println("Please enter a value between 0 and 20: ");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    /**
     * Updates the main statistics array based on the values of the provided CharacterProfession.
     *
     * @param profession The CharacterProfession object containing the profession's statistics.
     * @param mainStats  The array representing the character's main statistics to be updated.
     *                   The array follows the order: [weaponSkill, ballisticSkill, strength, resistance,
     *                   dexterity, intelligence, willPower, charisma].
     */
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
