package PPJ_21_Artur;

public class CiągnikSiodłowy extends PojazdKołowy {
    private int masa;

    public CiągnikSiodłowy(String kolor, int ilośćOsi, int masa) {
        super(kolor, ilośćOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde() {
        if (masa > 11) {
            System.out.println("Jazda jest niebezpieczna, zginiesz!!!");
        } else {
            System.out.println("Odpalaj i jedź!!!");
        }

    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
}
