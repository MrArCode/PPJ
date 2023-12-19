package PPJ_21_Artur;

public class Spawacz extends Osoba{
    private int stażPracy;

    public Spawacz(String name, int stażPracy) {
        super(name);
        this.stażPracy = stażPracy;
    }

    public String show(){
        return super.show() + " " + stażPracy;
    }

    public int getStażPracy() {
        return stażPracy;
    }

    public void setStażPracy(int stażPracy) {
        this.stażPracy = stażPracy;
    }
}
