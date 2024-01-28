package LOTR;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * The Battle class represents the battle system in the game, including
 * interactions between the hero and monsters.
 */
public class Battle {

    /**
     * The number of sides on the dice used for attacks.
     */
    private static final int DICE_SIDES = 101;

    /**
     * The size of each display chunk when showing enemy status.
     */
    private static final int DISPLAY_CHUNK_SIZE = 5;

    /**
     * Initiates a battle between the hero and a group of monsters.
     *
     * @param hero     The main character participating in the battle.
     * @param monsters An ArrayList of monsters that the hero will face.
     */
    public static void battle(Character hero, ArrayList<Monster> monsters) {
        displayEnemyStatus(monsters);

        while (!monsters.isEmpty() && hero.getHealth() > 0) {
            int attackedEnemy = chooseEnemyToAttack(monsters);
            heroAttack(hero, monsters, attackedEnemy);
            monsterAttack(hero, monsters);
        }

        if (hero.getHealth() <= 0) {
            System.out.println("You are dead, not big surprise");
            GameMethods.endOfTheGameAndReturnToMainMenu();
        } else {
            System.out.println("Congratulations! You have defeated all enemies.");
            System.out.println();
            Character.checkLevelPossibility(hero);
        }
    }

    /**
     * Simulates rolling a dice with a specified number of sides.
     *
     * @return The result of the dice roll.
     */
    public static int throwTheDice() {
        Random random = new Random();
        return random.nextInt(DICE_SIDES);
    }

    /**
     * Displays the status of the enemies in chunks, including their names and positions.
     *
     * @param monsters An ArrayList of monsters to display.
     */
    private static void displayEnemyStatus(ArrayList<Monster> monsters) {
        System.out.print("You are facing " + monsters.size() + " " +
                (monsters.size() == 1 ? "enemy." : "enemies.") + "\n");

        for (int i = 0; i < monsters.size(); i += DISPLAY_CHUNK_SIZE) {
            for (int j = i; j < i + DISPLAY_CHUNK_SIZE && j < monsters.size(); j++) {
                System.out.print("|" + (j + 1) + "." + " " + monsters.get(j).getName() + "|" + " ");
            }
            System.out.println();
        }
    }

    /**
     * Allows the hero to choose an enemy to attack.
     *
     * @param monsters An ArrayList of monsters to choose from.
     * @return The index of the chosen enemy in the ArrayList.
     */
    private static int chooseEnemyToAttack(ArrayList<Monster> monsters) {
        Scanner scanner = new Scanner(System.in);
        int attackedEnemy;

        while (true) {
            try {
                System.out.println("Choose the enemy you want to attack: ");
                attackedEnemy = Integer.parseInt(scanner.nextLine());

                if (attackedEnemy <= 0 || attackedEnemy > monsters.size()) {
                    System.out.println("Please enter a valid number: ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
            }
        }

        return attackedEnemy - 1;
    }


    /**
     * Handles the hero's attack on a selected enemy.
     *
     * @param hero          The main character performing the attack.
     * @param monsters      An ArrayList of monsters being attacked.
     * @param attackedEnemy The index of the enemy being attacked.
     */
    private static void heroAttack(Character hero, ArrayList<Monster> monsters, int attackedEnemy) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are attacking " + monsters.get(attackedEnemy).getName());
        System.out.println("Roll the dice, press Enter");
        String diceRoll = scanner.nextLine();

        if (throwTheDice() <= hero.getWeaponSkill()) {
            int damage = ((Weapon) hero.getEquipment()[0]).getBaseDmg();
            System.out.println("You hit the enemy, dealing " + damage);
            monsters.get(attackedEnemy).takeDamage(damage);

            if (monsters.get(attackedEnemy).getHealth() <= 0) {
                System.out.println("You killed " + monsters.get(attackedEnemy).getName());

                // Potential issues may arise here
                Character.gainExperience(hero, monsters.get(attackedEnemy));
                monsters.remove(attackedEnemy);
            }
        } else {
            System.out.println("You missed");
        }

        if (!monsters.isEmpty()) {
            displayEnemyStatus(monsters);
        }
    }

    /**
     * Simulates a monster's attack on the hero during battle.
     *
     * @param hero     The main character being attacked.
     * @param monsters An ArrayList of monsters performing the attacks.
     */
    private static void monsterAttack(Character hero, ArrayList<Monster> monsters) {
        for (Monster monster : monsters) {
            if (throwTheDice() <= monster.getWeaponSkill()) {
                int damage = ((Weapon) monster.getEquipment()[0]).getBaseDmg();
                System.out.println(monster.getName() + " hit you, dealing " + damage);
                hero.takeDamage(damage);
            } else {
                System.out.println(monster.getName() + " missed");
            }
        }
    }
}
