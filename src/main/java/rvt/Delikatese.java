package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String produkts = skeneris.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = skeneris.nextDouble();

        System.out.print("Ekspress piegade (0--ne, 1--ja): ");
        int ekspress = skeneris.nextInt();

        double piegade = 0;
        if (cena < 10) {
            piegade += 2;
        }
        if (ekspress == 1) {
            piegade += 3;
        }

        System.out.println("Rekins:");
        System.out.println(produkts);
        System.out.printf("%.2f\n", cena);
        System.out.println("piegade");
        System.out.printf("%.2f\n", piegade);
        System.out.println("kopa");
        System.out.printf("%.2f\n", cena + piegade);

        skeneris.close();
    }
}
