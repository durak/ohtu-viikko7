package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPSPeli {

    private Scanner scanner;
    private Ai tekoaly;
    private String vihunSiirto;

    public KPSTekoaly(Scanner scanner, Ai tekoaly) {
        this.scanner = scanner;
        this.tekoaly = tekoaly;
    }
    
    @Override
    String ekanSiirto() {
        System.out.println("Ensimmäisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        this.vihunSiirto = siirto;
        return siirto;
    }

    @Override
    String tokanSiirto() {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        tekoaly.asetaSiirto(vihunSiirto);
        return siirto;
    }
}
