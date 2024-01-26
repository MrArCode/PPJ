package LOTR;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Battle {

    private static final int DICE_SIDES = 101;
    private static final int DISPLAY_CHUNK_SIZE = 5;

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
            Character.checkLevelPossibility(hero);
        }
    }

//======================================================================================================================
    //Rekurencja dla Tymona
//public static void battle(Character hero, ArrayList<Monster> monsters) {
//    displayEnemyStatus(monsters);
//
//    battleRound(hero, monsters);
//}
//
//    private static void battleRound(Character hero, ArrayList<Monster> monsters) {
//        if (monsters.isEmpty() || hero.getHealth() <= 0) {
//            endBattle(hero);
//        } else {
//            int attackedEnemy = chooseEnemyToAttack(monsters);
//            heroAttack(hero, monsters, attackedEnemy);
//            monsterAttack(hero, monsters);
//
//            battleRound(hero, monsters);
//        }
//    }
//
//    private static void endBattle(Character hero) {
//        if (hero.getHealth() <= 0) {
//            System.out.println("You are dead, not big surprise");
//        } else {
//            System.out.println("Congratulations! You have defeated all enemies.");
//        }
//    }

//======================================================================================================================


    public static int throwTheDice() {
        Random random = new Random();
        return random.nextInt(DICE_SIDES);
    }

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

    private static int chooseEnemyToAttack(ArrayList<Monster> monsters) {
        Scanner scanner = new Scanner(System.in);
        int attackedEnemy;

        do {
            System.out.println("Choose the enemy you want to attack: ");
            attackedEnemy = Integer.parseInt(scanner.nextLine());

            if (attackedEnemy <= 0 || attackedEnemy > monsters.size()) {
                System.out.println("Please enter a valid number.");
            }
        } while (attackedEnemy <= 0 || attackedEnemy > monsters.size());

        return attackedEnemy - 1;
    }

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

                //Tu moga byc problemy
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
