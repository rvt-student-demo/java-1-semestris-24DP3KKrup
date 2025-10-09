package rvt;

import java.util.Scanner;

public class sumaunskaits {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int cnt = 0;
        int summa = 0;

        System.out.print("Ievadiet skaitlus (0 lai beigtu): ");
        int skaitlis = skan.nextInt();
        while (skaitlis != 0) {
            cnt++;
            summa += skaitlis;
            skaitlis = skan.nextInt();
        }

        System.out.println("Ievadito skaitlu daudzums: " + cnt);
        System.out.println("summa: " + summa);
        skan.close();
    }
}
