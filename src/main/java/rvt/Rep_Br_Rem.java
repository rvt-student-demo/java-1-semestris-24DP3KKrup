package rvt;

import java.util.Scanner;

public class Rep_Br_Rem {
    
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int cnt = 0;
        int summa = 0;
        int para_skaitli = 0;
        int nepara_skaitli = 0;

        System.out.print("Ievadiet skaitlus (-1 lai beigtu):\n");
        int skaitlis = skan.nextInt();
        while (skaitlis != -1) {
            cnt++;
            summa += skaitlis;
            skaitlis = skan.nextInt();
            if (skaitlis / 2  * 2 == skaitlis) {
                para_skaitli++;
            } else {
                nepara_skaitli++;
                
            }
        }
        skan.close();
        double videjais = (double) summa / cnt;
        System.out.println("paldies! ata!");
        System.out.println("summa: " + summa);
        System.out.println("Ievadito skaitlu daudzums: " + cnt);
        System.out.println("videjais:" + videjais);
        System.out.println("para skaitli: " + para_skaitli);
        System.out.println("nepara skaitli: " + nepara_skaitli);
    }
}