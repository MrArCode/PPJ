package LOTR;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static LOTR.World.mapMenu;

public class GameMethods {


    public static void playTheGame(){
        intro();
        Character hero = Character.createHero();
        gameMenu(hero);
    }

    //Menu do tworzenia postaci i prolog
    public static void intro() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n%n%n");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\tᚹᛖᛚᛞᚩᛗᛖ ᛏᛟ ᛗᛁᛞᛚᛖ-ᛖᚨᚱᛏᚺ%n");
        System.out.printf("\t\t\tᛁᚾ ᚦᛖ ᛁᛗᛗᛖᚾᛏ ᛖᚷᛒᚱᚨᛞᛖ ᛖᚱᛗᚩᚾᛏᛞᛟ ᚨ ᚺᛖᚱᛟ ᛖᚡ ᚢᚾᚹᚨᛖᚱᛁᚾᚷ ᚱᛖᛚᛗ ᛖᚱᚹᚩᚱᚲᛠ ᛖᛗᛋᚩᚱᚷᛖᛋ ᛈᛟᛁᛖᛋᛖᛞᛁ ᛏᛟ ᛖᛗᛏᚨᚱ%n" +
                "\t\t\tᛏᛋᚡᛟᚱᛚᛈ ᚠᛟ ᚨᚲᚢᚱᚨᚷᛞ ᛟᚠ ᛖᛈᛁᚲ ᛈᚯᚱᛏᚡᚩᚱ ᚨᚾᛞ ᚢᚱᛈᚱᚨᚴᚩᚱᛏᚡᛟᚱᛋ ᚨᚾᛞ ᛋᛟᚡᚨᚡᚨᚱ ᛏᚺᛖ ᛏᚨᛈᛖᛋᛈᚨᚡ ᚩᚠ ᛞᛖᛋᛏᛖᚾᛁ ᚢᚾᚠᚢᛖ%n" +
                "\t\t\tᚱᛚᛋᛒᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᛖᚡᚢᚾᛗᛖᚱᚷᛋ ᛋᚧᛁᛈᛈᛁᚾᚴ ᚨᚾᛞ ᛈᚧᛟᚱᚠᛎᛚᛋ ᚨᚾᛞ ᛇᚡᛋᛏᚣᛨᛡᚢᚾᚷ ᚠᚨᛚᛚᛁᚡᛁᚩᚡᚾᛚᚧᚩᚡ ᚨᚾᛞᛈᚡᚢᚱᚧᛁᛉᚡᛞ%n" +
                "\t\t\tᛏᚺᛏᛈᚨᛋᛋᛡᚢᚾᚡᚢᚱᛚᛋᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᚦᚨᛏ ᚥᚾᚠᚢᚱᛚᛋ᛬ ᛒᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᚹᛖᚹᛖᛖ ᚨᚾᛞ ᚨᛖᚱ");

        System.out.printf("%n%n");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome in Middle-earth%n");
        System.out.printf("\t\t\tIn the imminent embrace of Middle-earth's enchanting realm, a hero of unwavering resolve emerges, \n" +
                "\t\t\tpoised to embark upon  a  grand  odyssey  of  epic  proportions  and  unparalleled  valor.  The tapestry of \n" +
                "\t\t\tdestiny unfurls, beckoning  our protagonist  to weave  their  tale amidst  the  rich  tapestry of Tolkien's \n" +
                "\t\t\tmajestic world. Thus begins the resplendent  journey, where  courage  kindles in the heart,  and the spirit \n" +
                "\t\t\tof adventure ignites like a radiant flame against the shadows that linger.");

        System.out.printf("%n%n");
        System.out.print("Press enter to continue...");
        scanner.nextLine();
    }


    //Menu początkowe na starcie gry (ma być inne menu w trakcie gry)
    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU GŁÓWNE" + "\n" +
                "[1] Wczytaj grę" + "\n" +
                "[2] Nowa gra" + "\n" +
                "[3] Wyjdź");
        int choice = -1;
        try {

            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nie poprawny wybór");
            startMenu();
        }
        sc.nextLine();
        switch (choice) {
            case 1:
                try {
                    Memory.loadGame();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Brak zapisów");
                    startMenu();
                }
                break;
            case 2:
                try {
                    Memory.createNewGame();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

            case 3:
                System.out.println("Logging out...");
                System.exit(0);
                break;
            default:
                System.out.println("Nie poprawny wybór");
                startMenu();
        }
    }

    public static void gameMenu(Character hero) {
        Character.barStats(hero);
        Scanner sc = new Scanner(System.in);
        System.out.println("WYBIERZ DZIAŁANIE: ");
        System.out.println("[1] MAPA" + "\n" +
                "[2] EKWIPUNEK" + "\n" +
                "[3] STATYSTYKI" + "\n" +
                "[4] ZAPISZ" + "\n" +
                "[5] WYJDŹ" + "\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                mapMenu(hero);
                gameMenu(hero);
                break;
            case 2:
                break;
            case 3:
                hero.showStats();
                gameMenu(hero);
                break;
            case 5:
                break;
            default:
                gameMenu(hero);
        }
    }
}
