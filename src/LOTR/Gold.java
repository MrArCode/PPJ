package LOTR;

public class Gold extends Item{
    private int amount;

    //TODO Pomyśleć jeszcze o tym

    public Gold(String name, String description, int rarity, double value, int amount) {
        super(name, description, rarity, value);
        this.amount = amount;

    }

    public static class GoldFactory{
        public static Gold createGoldCoins100(){
            return new Gold("Gold Coin","", 0,0,100);
        }

        public static Gold createGoldCoins1000(){
            return new Gold("Gold Coin","", 0,0,1000);
        }

        public static Gold createGoldCoins10000(){
            return new Gold("Gold Coin","", 0,0,10000);
        }
    }





    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
