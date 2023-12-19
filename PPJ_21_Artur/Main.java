package PPJ_21_Artur;

public class Main {
    public static void main(String[] args) {

        Prostokąt prostokąt = new Prostokąt(5, 5);
        System.out.println(prostokąt.polePowierzchni());

        Prostopadłościan prostopadłościan = new Prostopadłościan(5, 5, 5);
        System.out.println(prostopadłościan.objętośćProstopadłościan());
        System.out.println(prostopadłościan.powierzchniaProstopadłościanu());

        Osoba osoba = new Osoba("Wezuwiusz");
        System.out.println(osoba.show());

        Spawacz spawacz = new Spawacz("Michaliusz", 50);
        System.out.println(spawacz.show());

        CiągnikSiodłowy ciągnikSiodłowy = new CiągnikSiodłowy("czerwony", 4, 12);
        ciągnikSiodłowy.rozpocznijJazde();

        Drzewo drzewo = new Drzewo(false, 50, "Nie wiem");
        System.out.println(drzewo.toString());

        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(true, 40, "Tak", 300000, 5.5);
        System.out.println(drzewoIglaste.toString());

        DrzewoLiściaste drzewoLiściaste = new DrzewoLiściaste(false,30,"Nie i Tak",333);
        System.out.println(drzewoLiściaste.toString());

        DrzewoOwocowe drzewoOwocowe =new DrzewoOwocowe(false, 500,"Róg",45,"Mandarynka");
        System.out.println(drzewoOwocowe.toString());


    }
}
