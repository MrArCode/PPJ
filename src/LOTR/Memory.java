package LOTR;

import java.io.*;
import java.util.Scanner;

public class Memory {
    //Ładowanie zapisu gry
    public static void loadGame() throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException {
        File saves = new File("src/LOTR/Saves");
        Scanner scchoice = new Scanner(System.in);
        System.out.println("Wybierz zapis: ");
        System.out.println("[0] Powrót");
        for (int i = 0; i < new File(saves.toString()).listFiles().length; i++) {
            System.out.println("[" + (i+1) + "] " + saves.listFiles()[i]);
        }
        int choice = scchoice.nextInt();
        if (choice==0)
            GameMethods.startMenu();
        else {
            try {

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saves.listFiles()[choice - 1]));
                Character hero = (Character) ois.readObject();
                GameMethods.gameMenu(hero);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nie poprawny zapis");
                System.out.println();
                loadGame();
            }
        }
    }

    //    // Tworzenie/rozpoczecie nowej gry
    public static void createNewGame() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean exist = false;
        System.out.println("Nazwij zapis: ");
        String name = sc.nextLine();
        for (int i = 0; i < new File("src/LOTR/Saves/").listFiles().length; i++) {
            if (("src\\LOTR\\Saves\\" + name).equals(new File("src/LOTR/Saves/").listFiles()[i].toString())) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("Nazwa istnieje");
            createNewGame();
        }else {
            File newgame = new File("src/LOTR/Saves/" + name);
            newgame.createNewFile();
            FileWriter writer = new FileWriter(newgame);
            Character hero = Character.createHero();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newgame));
            oos.writeObject(hero);
            writer.close();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            GameMethods.intro(hero);
        }
    }
}
