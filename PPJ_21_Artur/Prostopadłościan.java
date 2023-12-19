package PPJ_21_Artur;

public class Prostopadłościan extends Prostokąt {
    private int c;

    public Prostopadłościan(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int objętośćProstopadłościan(){
        return super.polePowierzchni() * c;
    }

    public int powierzchniaProstopadłościanu(){
        return super.polePowierzchni()*2 + getA()*c*2 + getB()*c*2;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
