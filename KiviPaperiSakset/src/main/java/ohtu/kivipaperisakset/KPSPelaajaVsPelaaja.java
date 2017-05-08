package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    private Scanner scanner;
    
    public KPSPelaajaVsPelaaja(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    String ekanSiirto() {
        System.out.println("Ensimmäisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }

    @Override
    String tokanSiirto() {
        System.out.println("Toisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }
}
