package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {
    
    public void pelaa() {        
        
        Tuomari tuomari = new Tuomari();
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");

        
        String ekanSiirto = ekanSiirto();
        String tokanSiirto = tokanSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ekanSiirto();

            tokanSiirto = tokanSiirto();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    abstract String ekanSiirto();

    abstract String tokanSiirto();

    public static KPSPeli uusiPeli(String tyyppi, Scanner scanner) {
        switch (tyyppi) {
            case "a":
                return new KPSPelaajaVsPelaaja(scanner);
            case "b":
                return new KPSTekoaly(scanner, new Tekoaly());
            case "c":
                return new KPSTekoaly(scanner, new TekoalyParannettu(20));
            default:
                return null;
        }

    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}
