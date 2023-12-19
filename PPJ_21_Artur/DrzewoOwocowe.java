package PPJ_21_Artur;

public class DrzewoOwocowe extends DrzewoLiściaste{
    String nazwaOwocu;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokość, String przekrójDrzewa, int kształtLiścia, String nazwaOwocu) {
        super(wiecznieZielone, wysokość, przekrójDrzewa, kształtLiścia);
        this.nazwaOwocu = nazwaOwocu;
    }

    public String toString(){
        return super.toString() + " " + nazwaOwocu;
    }

    public String getNazwaOwocu() {
        return nazwaOwocu;
    }

    public void setNazwaOwocu(String nazwaOwocu) {
        this.nazwaOwocu = nazwaOwocu;
    }
}
