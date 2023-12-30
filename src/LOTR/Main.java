package LOTR;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {


//        Thread musicThread = new Thread(() -> {
//            Music musicPlayer = new Music();
//            musicPlayer.playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav");
//        });
//
//
//        musicThread.start();


//          Character hero = Character.createHero();
//          Character goblin = Monster.MonsterFactory.createGoblinArcher();
//          showStats(hero);
//          showStats(goblin);
          Monster[] group = {Monster.MonsterFactory.createGoblinMiner(),Monster.MonsterFactory.createGoblinMiner()};
          System.out.println(group[0].getHealth());
          System.out.println(group[1].getHealth());
          System.out.println();
          group[0].setHealth(1);
          System.out.println(group[0].getHealth());
          System.out.println(group[1].getHealth());


//        try {
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
