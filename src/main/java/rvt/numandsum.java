package rvt;
import java.util.Scanner;


public class numandsum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Pirmais skaitlis? ");
        int pirmais = Integer.parseInt(scan.nextLine().trim());

        System.out.print("Pedejais skaitlis? ");
        int pedejais = Integer.parseInt(scan.nextLine().trim());

        int summa = 0;
        for (int i = pirmais; i <= pedejais; i++) {
            summa += i;
        }

        System.out.println("intervala summa ir " + summa);
        scan.close();
    }
}