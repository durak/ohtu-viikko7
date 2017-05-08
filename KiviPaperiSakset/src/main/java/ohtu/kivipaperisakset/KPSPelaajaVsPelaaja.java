package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }

    @Override
    String tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }
}
