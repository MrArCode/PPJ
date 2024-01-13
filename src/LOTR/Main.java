package LOTR;


public class Main {
    public static void main(String[] args) {
        GameMethods.gameMenu(Character.createHero());

//        Thread musicThread = new Thread(() -> {
//            Music musicPlayer = new Music();
//            musicPlayer.playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav");
//        });
//
//
//        musicThread.start();


//        Character hero = Character.createHero();
//        ArrayList<Monster> group = Monster.EnemyGroupGenerator.generateGroupOfEnemy(3,3);
//        Battle.battle(hero,group);


        //        GameMethods.gameMenu(hero);
//        Character hero = Character.createHero();
//        int dmg = ((Weapon)hero.getEquipment()[0]).getBaseDmg();
//        System.out.println(dmg);

//        Monster goblin = Monster.MonsterFactory.createGoblinArcher();
//        System.out.println(((Weapon)goblin.getEquipment()[0]).getName());




//        try {
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
