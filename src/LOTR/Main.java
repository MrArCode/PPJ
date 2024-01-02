package LOTR;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Thread musicThread = new Thread(() -> {
//            Music musicPlayer = new Music();
//            musicPlayer.playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav");
//        });
//
//
//        musicThread.start();

        Character hero = new Character("aa","elf",100,12,12,1,2,12,12,1,2,100,10,10,CharacterProfession.ClassFactory.warrior());
        ArrayList<Monster> monsters = Monster.EnemyGroupGenerator.generateGroupOfEnemy(2,2);
        Battle.battle(hero,monsters);


//        try {
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
