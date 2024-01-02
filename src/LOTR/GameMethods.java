package LOTR;

import java.util.Scanner;

public class GameMethods {

    //Menu do tworzenia postaci i prolog
    public static void Intro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tᚹᛖᛚᛞᚩᛗᛖ ᛏᛟ ᛗᛁᛞᛚᛖ-ᛖᚨᚱᛏᚺ");
        System.out.println("\t\t\tᛁᚾ ᚦᛖ ᛁᛗᛗᛖᚾᛏ ᛖᚷᛒᚱᚨᛞᛖ ᛖᚱᛗᚩᚾᛏᛞ ᛬ ᚨ ᚺᛖᚱᛟ ᛖᚡ ᚢᚾᚹᚨᛖᚱᛁᚾᚷ ᚱᛖᛚᛗ ᛖᚱᚹᚩᚱᚲᛠ ᛖᛗᛋᚩᚱᚷᛖᛋ ᛈᛟᛁᛖᛋᛖᛞ ᛏᛟ ᛖᛗᛏᚨᚱᛏ\n" +
                "\t\t\tᛋᚡᛟᚱᛚᛈ ᚠᛟ ᚨᚲᚢᚱᚨᚷᛞ ᛟᚠ ᛖᛈᛁᚲ ᛈᚯᚱᛏᚡᚩᚱ᛬ ᚨᚾᛞ ᚢᚱᛈᚱᚨᚴᚩᚱᛏᚡᛟᚱᛋ ᚨᚾᛞ ᛋᛟᚡᚨᚡᚨᚱ ᛏᚺᛖ ᛏᚨᛈᛖᛋᛈᚨᚡ ᚩᚠ ᛞᛖᛋᛏᛖᚓᚾᛁ ᚢᚾᚠᚢᚱᛚᛋ\n" +
                "\t\t\tᛒᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᛖᚡᚢᚾᛗᛖᚱᚷᛋ ᛋᚧᛁᛈᛈᛁᚾᚴ ᚨᚾᛞ ᛈᚧᛟᚱᚠᛎᛚᛋ ᚨᚾᛞ ᛇᚡᛋᛏᚣᛨᛡᚢᚾᚷ ᚠᚨᛚᛚᛁᚡᛁᚩᚡᚾᛚᚧᚩᚡ ᚨᚾᛞ ᛈᚡᚢᚱᚧᛁᛉᚡᚾ ᛏᚺᚨᛏᛈᚨᛋᛋᛡ\n" +
                "\t\t\tᚢᚾᚡᚢᚱᛚᛋ᛬ ᛒᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᚦᚨᛏ ᚥᚾᚠᚢᚱᛚᛋ᛬ ᛒᛖᚨᚨᚨᛏᛖᚹᚨᚷ ᚨᚹᛘᛏᛁᚦ ᚹᛖᚹᛖᛖ ᚨᚾᛞ ᚨᛖᚱᛚᚾᛖᛏᚡ ᚥᚾᚹᚨᛖᚱᛗᛋ ᚨᚾᛞ ᚦᚨᛗᚨᛋᛁᛟᚠ\n" +
                "\t\t\tᛒᚨᛇᚲᛖᚾᛁᚾᚷ ᚨᚢᚾᛞ ᚦᚨ ᚱᛖᛋᛈᛚᛖᚾᛞᛖᚾᛏ ᛒᚨᚱᚺᛖᚾᛏᛡᛞ ᛟᚠ ᚢᚾᚹᚨᛖᚱᛖᛗᚤᚷᛋ ᚨᚾᛞ ᚢᚾᛈᚨᚢᚱᚴᛖᚦ ᚨᚾᛞ ᚢᚾᛈᚨᚢᚱᚴᛖᚦᛡᛞ ᚨᚾᛞ\n" +
                "\t\t\tᚢᚾᛈᚨᚢᚱᚴᛖᚦᛡᛞᛡᛞᛡᚾᚨᛖᚱᚲᚢᚾᛏᛡᚾᛏ ᚾᛖᛚᚲᚨᚴᛡᛚᛞ ᚢᚾᚠᚢᚱᛚᛋᚬ ᛞᛖᛋᛏᚨᛝ ᚢᚾᚠᚢᚱᛚᛋᚨᛠᛚᚨᚾᛞ ᚨᛗᛋᛖᛖᛞ ᚴᛁᚾᛞᛚᛖᛋ ᛁᚾ ᚥᚱᛖᛏᛖᚨ\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome in Middle-earth");
        System.out.println(
                "\t\t\tIn the imminent embrace of Middle-earth's enchanting realm, a hero of unwavering resolve emerges, \n" +
                        "\t\t\tpoised to embark upon a grand odyssey of epic proportions and unparalleled valor. The tapestry of \n" +
                        "\t\t\tdestiny unfurls, beckoning our protagonist to weave their tale amidst the rich tapestry of Tolkien's \n" +
                        "\t\t\tmajestic world. Thus begins the resplendent journey, where courage kindles in the heart, and the spirit \n" +
                        "\t\t\tof adventure ignites like a radiant flame against the shadows that linger. ");


        System.out.println();
        System.out.print("Press enter to continue...");
        scanner.nextLine();
        System.out.println();

    }

    //Menu początkowe na starcie gry (ma być inne menu w trakcie gry)
//    public static void StartMenu(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("MENU GŁÓWNE"+"\n"+
//                "[1] Wczytaj grę"+"\n"+
//                "[2] Nowa gra"+"\n"+
//                "[3] Wyjdź");
//        int choice=sc.nextInt();
//        System.out.println(choice);
//        switch (choice){
//            case 1:
//
//                break;
//            case 2:
//                try {
//                    CreateNewGame();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                break;
//
//            case 3:
//                System.out.println("Logging out...");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Nie poprawny wybór");
//                StartMenu();
//        }
//    }
    //Ładowanie zapisu gry
//    public Character LoadGame() throws FileNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException
//    {
//        File saves = new File("src/LOTR/Saves");
//        Scanner sc  =new Scanner(saves);
//        Scanner scchoice = new Scanner(System.in);
//        System.out.println("Wybierz zapis: ");
//        for (int i = 0; i<new File(saves.toString()).listFiles().length; i++){
//            System.out.println("["+i+"] "+saves.toString());
//        }
//        int choice = scchoice.nextInt();
//        Scanner fr = new Scanner(saves.listFiles()[choice]);
//        return new Character(fr.nextLine(),fr.nextLine(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt(),fr.nextInt());;
//    }
//    // Tworzenie/rozpoczecie nowej gry
//    public static void CreateNewGame() throws IOException {
//        Scanner sc = new Scanner(System.in);
//        boolean exist=false;
//        System.out.println("Nazwij zapis: ");
//        String name = sc.nextLine();
//        for (int i =0;i<new File("src/LOTR/Saves/").listFiles().length;i++) {
//            if(("src\\LOTR\\Saves\\"+name).equals(new File("src/LOTR/Saves/").listFiles()[i].toString())) {
//                exist = true;
//                break;
//            }
//        }
//        if (exist){
//            System.out.println("Nazwa istnieje");
//            CreateNewGame();
//        }else {
//            File newgame = new File("src/LOTR/Saves/" + name);
//            newgame.createNewFile();
//            FileWriter writer = new FileWriter(newgame);
//            Character hero = Character.createHero();
//            writer.write(hero.getStatsForSave());
//            writer.close();
//            Intro();
//        }
//    }

//    public static void choiceMenu(Character hero, Monster ork){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("""
//                1. Walcz
//                2. Uciekaj""");
//
//        int choice = scanner.nextInt();
//        boolean pętla = true;
//
//        do {
//            if(choice == 1){
//                walka(hero,ork);
//                pętla = false;
//            }else {
//                System.out.println("Koniec gry");
//                pętla = false;
//            }
//
//        } while (pętla);
//    }
//
//    public static void walka(Character hero, Monster ork) {
//        System.out.println("---------------------------------------------------");
//        System.out.println("Początek walki:");
//        hero.showStats();
//        ork.showStats();
//
//        while (ork.getHp() > 0 && hero.getHp() > 0) {
//            // Atak gracza na potwora
//            ork.setHp(ork.getHp() - hero.getEquipment()[0].getDmg());
//
//            // Odpowiedź potwora na atak gracza
//            hero.setHp(hero.getHp() - ork.getAttack());
//
//            // Wyświetlenie stanu po rundzie
//            System.out.println("Po rundzie:");
//            hero.showStats();
//            ork.showStats();
//
//            // Opóźnienie między rundami
//            try {
//                Thread.sleep(2000); // Opóźnienie 1 sekundy (1000 milisekund)
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        // Sprawdzenie wyniku walki
//        if (hero.getHp() <= 0) {
//            System.out.println("Przegrałeś");
//        } else {
//            System.out.println("Wygrałeś");
//        }
//    }










}
