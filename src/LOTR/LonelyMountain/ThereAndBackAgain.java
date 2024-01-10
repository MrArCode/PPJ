package LOTR.LonelyMountain;

import LOTR.Character;

public class ThereAndBackAgain {

    public static void story(Character hero){
        Prolog.prolog(hero);

    }

    public static void main(String[] args) {
        Character hero = new Character("Artur", null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null);
        ThereAndBackAgain.story(hero);
        //test

    }

}
