package PPJ_21_Artur;

public class Prostokąt {
    private int a;
    private int b;

    public Prostokąt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int polePowierzchni() {
        return a * b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
