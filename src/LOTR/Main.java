package LOTR;



public class Main {
    public static void main(String[] args) {


//        Thread musicThread = new Thread(() -> {
//            Music musicPlayer = new Music();
//            musicPlayer.playMusic("C:\\Users\\czuro\\IdeaProjects\\Nowe\\src\\LOTR\\SongofDurin.wav");
//        });
//
//
//        musicThread.start();



//        GameMethods.StartMenuShow(); //Menu początkowe
//        Character hero = createCharacter(); //Tworzy bohatera, na razie na podstawowe sprawy
//        hero.showStats();
//        Monster ork = createOrk(); //Tu kiedyś bedzie tablica potwórów albo przynajmniej jakaś pula
//        GameMethods.choiceMenu(hero,ork);

          Character hero = Character.createHero();


//        try {
//            musicThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
