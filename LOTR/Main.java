package LOTR;

import static LOTR.Character.createHero;
import static LOTR.Monster.MonsterFactory.createOrk;

public class Main {
    public static void main(String[] args) {


//        Thread musicThread = new Thread(() -> {
//            Music musicPlayer = new Music();
//            musicPlayer.playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav");
//        });


//        musicThread.start();


        System.out.println("Tymon");
        GameMethods.StartMenuShow(); //Menu początkowe
        Character hero = createHero(); //Tworzy bohatera, na razie na podstawowe sprawy
        Monster ork = createOrk(); //Tu kiedyś bedzie tablica potwórów albo przynajmniej jakaś pula
        GameMethods.choiceMenu(hero,ork);









//        try {
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
