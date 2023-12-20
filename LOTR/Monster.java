package LOTR;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Monster {
    private String name;
    private int hp;
    private int expToGive;
    private int attack;

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Hp: " + hp);
        System.out.println("Attack: " + attack);
    }

    public static class MonsterFactory{

        public static Monster createOrk(){
            return new Monster("Ork", 10,20,5);
        }

    }

}
