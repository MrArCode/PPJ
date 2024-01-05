package LOTR.LonelyMountain;

import LOTR.Character;
import LOTR.GameMethods;

import java.util.Scanner;

public class Prolog {


    public static void prolog(Character hero) {
        tavern(hero);


    }

    public static void tavern(Character hero) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ⠀⠀⠀⠀⠀⠀⢀⣀⣀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⢰⡄⠀⠀⣠⣾⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⢸⡇⠐⠾⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⡇⠀⢠⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠐⣿⣾⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢹⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⢸⠈⠉⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀
                ⠀⠸⡆⠀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀
                ⠀⠀⠇⢀⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀
                ⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀
                ⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀
                ⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿""");

        System.out.println("[In the Griffin's Wing tavern, where the sound of glasses clinking together and the bustle of conversation]\n" +
                "[fill the tight room, the hero sits at a table, observing the crowd around. Gandalf, hooded and emitting]\n" +
                "[a mysterious glow, approaches the table where the hero sits focused on the map.]");
        scanner.nextLine();
        System.out.println("Gandalf: Ah, young traveler, fate has led me to you in this bustling place.");
        scanner.nextLine();
        System.out.println(hero.getName() + ": Gandalf! Your presence brings a sense of purpose to this quiet evening. What brings you here?");
        scanner.nextLine();
        System.out.println("Gandalf: A matter of great import, my friend. A quest, shrouded in both peril and promise, lies ahead. Have you heard of Thorin Oaken-shield and his quest for Erebor, the Lonely Mountain?");
        scanner.nextLine();
        System.out.println(hero.getName() + ": Aye, tales of their journey have reached my ears. A noble quest to reclaim what was lost to the dragon's grasp. ");
        scanner.nextLine();
        System.out.println("Gandalf: Precisely. Thorin's company lacks one vital element—a hero of your caliber. Would you consider joining their fellowship?");
        scanner.nextLine();
        System.out.println(hero.getName() + ": Me? But why, Gandalf? What role could I play in such a quest?");
        scanner.nextLine();
        System.out.println("Gandalf: Your valor, your skills, and your heart, dear friend. The company requires someone of your mettle—a beacon of hope amidst the encroaching shadows.");
        scanner.nextLine();
        System.out.println(hero.getName() + ": It's an honor, Gandalf. But the dangers... they are said to be insurmountable.");
        scanner.nextLine();
        System.out.println("Gandalf: True, but with danger comes the chance for greatness. Fear not, for I believe in your abilities. Together, we shall defy the odds and carve a legend worthy of song and tale.");
        scanner.nextLine();

        System.out.println(hero.getName() + ": [1] I accept, Gandalf! Tell Thorin Oaken-shield I shall stand by his side in this endeavor.");
        System.out.println(hero.getName() + ": [2] Gandalf, your offer is an honor, yet I must decline. The weight of this quest is beyond my capabilities.");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();


        if (choice == 1) {
            System.out.println("Gandalf: A wise choice, my friend. Our meeting here was no mere happenstance. The road ahead, winding and perilous, shall find strength in your presence. Our fellowship gathers at the abode of Mr. Baggins in the Shire. " +
                    "Seek us there when the sun finds its rightful place in the sky once more. Until then, prepare your heart and steel your resolve, for our journey begins with the dawn's first light.");


        } else {
            scanner.nextLine();
            System.out.println("Gandalf: But why, dear friend? Your courage and skill are renowned.");
            scanner.nextLine();
            System.out.println(hero.getName() + ": The road you pave is fraught with dangers unknown to me. My place lies within these lands, safeguarding those I hold dear.");
            scanner.nextLine();
            System.out.println("Gandalf: Understandable, but destiny often calls upon us when least expected.");
            scanner.nextLine();
            System.out.println(hero.getName() + ": Indeed, yet my destiny is entwined with these familiar paths. My duty is to protect what I cherish here.");
            scanner.nextLine();
            System.out.println("Gandalf: Your decision is respected, for a hero's journey is not solely defined by grand quests but also by the valor shown in everyday life.");
            scanner.nextLine();
            System.out.println(hero.getName() + ": I thank you, Gandalf, for the offer and the trust placed in me. But my heart remains here, tending to the bonds I hold closest.");
            scanner.nextLine();
            System.out.println("Gandalf: Fare thee well, noble soul. May your days be filled with peace and contentment, wherever your path may lead.");
            End.endOfTheGame();
            GameMethods.startMenu();
        }


    }

}

















