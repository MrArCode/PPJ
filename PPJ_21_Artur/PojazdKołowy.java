package PPJ_21_Artur;

public class PojazdKołowy extends Pojazd{
    private int ilośćOsi;

    public PojazdKołowy(String kolor, int ilośćOsi) {
        super(kolor);
        this.ilośćOsi = ilośćOsi;
    }



    public int getIlośćOsi() {
        return ilośćOsi;
    }

    public void setIlośćOsi(int ilośćOsi) {
        this.ilośćOsi = ilośćOsi;
    }
}
