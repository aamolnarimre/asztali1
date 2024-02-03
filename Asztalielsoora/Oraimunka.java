package oraimunka;

public class Oraimunka {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int szam = 10;
        int szam2;

        szam2 = 10;
        float tortszam = 3.14159265f;
        double tortszam2 = 5.2132131;
        boolean ertek = true;
        boolean ertek2 = false;
        String szoveg = "---";
        String szoveg2 = "|";
        char k = 'a';
        System.out.println("Ez egy karakter: " + k);
        System.out.print("Sortörésnélkül ");
        System.out.println("Ez következik");
        //System.out.printf("%-19s%-8d \n", szoveg, 10);

        System.out.printf("%2s \n", szoveg);
        System.out.println("|   |");
        System.out.println("---");

        int n = 1;
        int m = 2;
        int osszead = n + m;
        n += 1;
        double osztas = m /= 10;

        n++;
        m--;

        int maradek = n % m;

        //<= >= == !=
        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println(1 | 2);
        //0001
        //010

        //0000
        //0011
        if (szam % 2 == 0) {
            System.out.println("A szá osztható 2-vel");

        }

        //ALT+SHIFT+F
        switch (szam) {
            case 10:
                System.out.println("A szám 10");
                break;
            case 15:
                System.out.println("A száms 15");
            default:
                System.out.println("A szám nem 10 és nem 15");
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("a");

        }
    }

    
    
}

