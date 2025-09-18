package rvt;
import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] skaitli = new int[3];

        System.out.println("Ievadiet 3 skaitļus:");
        for (int i = 0; i < 3; i++) {
            skaitli[i] = scanner.nextInt();
        }
        scanner.close();

        double videjais = calculateAverage(skaitli);
        System.out.printf("videjais: %.2f%n", videjais);
    }

    public static double calculateAverage(int[] skaitli) {
        double sum = 0;
        for (int skaitlis : skaitli) {
            sum += skaitlis;
        }
        return sum / skaitli.length;
    }
}