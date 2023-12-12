public class Osoba {
    private String imie;
    private int rokUrodzenia;
    public Osoba (String imie, int rokUrodzenia){
        this.imie=imie;
        this.rokUrodzenia=rokUrodzenia;
    }
    public Osoba(String imie){
        this.imie=imie;
        rokUrodzenia=1990;
    }
    public String zwrocImie(){
        return imie;
    }
    public int zwrocWiek(){
        return 2023-rokUrodzenia;
    }
    public static Osoba zwrocStarszaOsobe(Osoba osoba1, Osoba osoba2){
        if (osoba1.zwrocWiek()>osoba2.zwrocWiek())
            return osoba1;
        else if (osoba1.zwrocWiek()<osoba2.zwrocWiek())
            return osoba2;
        else return null;
    }
    public static Osoba zwrocNajstarzaOsobe(Osoba[] ludzie){
        int max=0;
        for (int i=0;i< ludzie.length;i++)
            if (ludzie[i].zwrocWiek()>ludzie[max].zwrocWiek())
                max=i;
        return ludzie[max];
    }
}
