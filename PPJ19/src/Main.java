public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(3);
        kwadrat.show();

        Walec walec = new Walec(5,5);
        walec.show();
    }
}
class Walec {
    private int promien;
    private int wysokosc;
    public int getPromien(){
        return promien;
    }
    public int getWysokosc(){
        return wysokosc;
    }
    public Walec(int a,int b){
        this.promien=a;
        this.wysokosc=b;
    }
    public void show(){
        System.out.println("Pole podstawy: "+Math.PI*promien*promien);
        System.out.println("Objetosc: "+Math.PI*promien*promien*wysokosc);
    }
}
class Kwadrat{
    private int bok;
    public Kwadrat(int bok){
        this.bok=bok;
    }
    public int bok(){
        return bok;
    }
    public void show(){
        System.out.println("Pole: "+this.bok*this.bok);
        System.out.println("Objestosc szescianu: "+bok*bok*bok);
    }
}
class KulaW{
    private int radius;
    public KulaW(Kwadrat kwadrat){
        radius=kwadrat.bok()/2;
    }
    public KulaW(Walec walec){
        radius=walec.getPromien();
    }
}