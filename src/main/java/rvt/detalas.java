package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        final int papcen = 1;
        final int uzgriezcen = 3;
        final int skruvcen = 5;

        Scanner sken = new Scanner(System.in);
        System.out.print("Skruvju skaits: ");
        int skruve = sken.nextInt();
        System.out.print("Uzgrieznu skaits: ");
        int uzgriezn = sken.nextInt();
        System.out.print("Paplaksnu skaits: ");
        int paplaksnes = sken.nextInt();

        int cena = skruve * skruvcen + uzgriezn * uzgriezcen + paplaksnes * papcen;
        int kludas = 0;
        if (uzgriezn < skruve) {
            System.out.println("parak maz uzgriezni");
            kludas++;
        }
        if (paplaksnes < 2 * skruve) {
            System.out.println("parak maz paplaksnes");
            kludas++;
        }
        if (kludas == 0) {
            System.out.println("Precu daudzums ir pareizs");
        }
        System.out.println("Kopeja cena: " + cena + " EUR");
        sken.close();
    }
}
