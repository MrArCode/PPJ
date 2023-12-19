package PPJ_21_Artur;

public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokość;
    private String przekrójDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokość, String przekrójDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokość = wysokość;
        this.przekrójDrzewa = przekrójDrzewa;
    }

    public String toString(){
        return wiecznieZielone + " " + wysokość + " " + przekrójDrzewa;
    }


    public boolean isWiecznieZielone() {
        return wiecznieZielone;
    }

    public void setWiecznieZielone(boolean wiecznieZielone) {
        this.wiecznieZielone = wiecznieZielone;
    }

    public int getWysokość() {
        return wysokość;
    }

    public void setWysokość(int wysokość) {
        this.wysokość = wysokość;
    }

    public String getPrzekrójDrzewa() {
        return przekrójDrzewa;
    }

    public void setPrzekrójDrzewa(String przekrójDrzewa) {
        this.przekrójDrzewa = przekrójDrzewa;
    }
}
