package LOTR;

public class HpElixir extends Elixir {
    int numberOfHpPointsRestored;
    int numberOfHpPointsAdded;

    public HpElixir(String name, String description, int rarity, double value, boolean isPermanent, int numberOfHpPointsRestored, int numberOfHpPointsAdded) {
        super(name, description, rarity, value, isPermanent);
        this.numberOfHpPointsRestored = numberOfHpPointsRestored * rarity * getQuality();
        this.numberOfHpPointsAdded = numberOfHpPointsAdded * rarity * getQuality();
    }

    public static class HpElixirFactory{
        public static HpElixir createHpElixir(){
            return new HpElixir("Hp Elixir","",generateRandomRarity(),100,false,1,0);
        }
        public static HpElixir createPermanentHpElixir(){
            return new HpElixir("Permanent Hp Elixir","",generateRandomRarity(),2000,true,1,1);
        }
    }


    public int getNumberOfHpPointsRestored() {
        return numberOfHpPointsRestored;
    }

    public void setNumberOfHpPointsRestored(int numberOfHpPointsRestored) {
        this.numberOfHpPointsRestored = numberOfHpPointsRestored;
    }

    public int getNumberOfHpPointsAdded() {
        return numberOfHpPointsAdded;
    }

    public void setNumberOfHpPointsAdded(int numberOfHpPointsAdded) {
        this.numberOfHpPointsAdded = numberOfHpPointsAdded;
    }
}
