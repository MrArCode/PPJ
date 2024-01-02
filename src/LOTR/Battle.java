package LOTR;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Battle {


    public static void battle(Character hero, ArrayList<Monster> monsters) {
        displayEnemyStatus(monsters);
        while (!monsters.isEmpty()) {
            int attackedEnemy = chooseEnemyToAttack(monsters);
            heroAttack(hero, monsters, attackedEnemy);
        }
    }

    public static int throwTheDice() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static void displayEnemyStatus(ArrayList<Monster> monsters) {
        // Display the status of enemies
        System.out.print("You are facing " + monsters.size() + " ");
        if (monsters.size() == 1) {
            System.out.println("enemy.");
        } else {
            System.out.println("enemies.");
        }

        for (int i = 0; i < monsters.size(); i += 5) {
            for (int j = i; j < i + 5 && j < monsters.size(); j++) {
                System.out.print("|" + (j + 1) + "." + " " + monsters.get(j).getName() + "|" + " ");
            }
            System.out.println();
        }
    }

    private static int chooseEnemyToAttack(ArrayList<Monster> monsters) {
        // User input handling to choose an enemy to attack
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the enemy you want to attack: ");
        int attackedEnemy = Integer.parseInt(scanner.nextLine());

        if (attackedEnemy <= 0 || attackedEnemy > monsters.size()) {
            System.out.println("Please enter a valid number.");
            System.out.println("Choose the enemy you want to attack: ");
            attackedEnemy = Integer.parseInt(scanner.nextLine());
        }

        return attackedEnemy - 1;
    }

    private static void heroAttack(Character hero, ArrayList<Monster> monsters, int attackedEnemy) {
        // Player's attack logic
        Item[] equipment = new Item[5]; // TODO: This is a temporary solution
        equipment[0] = MeleeWeapon.MeleeWeaponFactory.createLongSword();

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are attacking " + monsters.get(attackedEnemy).getName());
        System.out.println("Roll the dice, press Enter");
        String diceRoll = scanner.nextLine();

        if (throwTheDice() <= hero.getWeaponSkill()) {
            System.out.println("You hit the enemy, dealing " + ((MeleeWeapon) equipment[0]).getBaseDmg());
            monsters.get(attackedEnemy).setHealth(monsters.get(attackedEnemy).getHealth() - ((MeleeWeapon) equipment[0]).getBaseDmg());

            if (monsters.get(attackedEnemy).getHealth() <= 0) {
                System.out.println("You killed " + monsters.get(attackedEnemy).getName());
                monsters.remove(attackedEnemy);
            }
        } else {
            System.out.println("You missed");
        }

        if (!monsters.isEmpty()) {
            displayEnemyStatus(monsters);

        } else {
            System.out.println("You have defeated all enemies");
        }
    }
        //TODO dokończyć po zrobieniu ekwipunku
//    private static void monsterAttack(Character hero, ArrayList<Monster> monsters) {
//        for (int i = 0; i < monsters.size(); i++) {
//            if (throwTheDice() <= monsters.get(i).getWeaponSkill()) {
//                System.out.println(monsters.get(i).getName() + "hit you, dealing " + );
//            }
//        }
//    }

}
