package PPJ_21_Artur;

public class DrzewoLiściaste extends Drzewo{
    private int kształtLiścia;

    public DrzewoLiściaste(boolean wiecznieZielone, int wysokość, String przekrójDrzewa, int kształtLiścia) {
        super(wiecznieZielone, wysokość, przekrójDrzewa);
        this.kształtLiścia = kształtLiścia;
    }

    public String toString(){
        return super.toString() + " " + kształtLiścia;
    }

    public int getKształtLiścia() {
        return kształtLiścia;
    }

    public void setKształtLiścia(int kształtLiścia) {
        this.kształtLiścia = kształtLiścia;
    }
}
