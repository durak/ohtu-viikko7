package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSParempiTekoaly extends KPSPeli {

    private static final Scanner scanner = new Scanner(System.in);
    private TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }

    @Override
    String tokanSiirto() {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        return siirto;
    }
}
