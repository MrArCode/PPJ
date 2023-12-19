package PPJ_21_Artur;

public class DrzewoIglaste extends Drzewo {
    private int ilośćIgieł;
    private double długośćSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokość, String przekrójDrzewa, int ilośćIgieł, double długośćSzyszki) {
        super(wiecznieZielone, wysokość, przekrójDrzewa);
        this.ilośćIgieł = ilośćIgieł;
        this.długośćSzyszki = długośćSzyszki;
    }

    public String toString() {
        return super.toString() + " " + ilośćIgieł + " " + długośćSzyszki;
    }


    public int getIlośćIgieł() {
        return ilośćIgieł;
    }

    public void setIlośćIgieł(int ilośćIgieł) {
        this.ilośćIgieł = ilośćIgieł;
    }

    public double getDługośćSzyszki() {
        return długośćSzyszki;
    }

    public void setDługośćSzyszki(double długośćSzyszki) {
        this.długośćSzyszki = długośćSzyszki;
    }
}
