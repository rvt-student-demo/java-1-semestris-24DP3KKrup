package rvt;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli:");
        double num1 = scanner.nextDouble();

        System.out.println("Ievadiet otro skaitli:");
        double num2 = scanner.nextDouble();

        System.out.printf("Rezultats (saskaitisana): %.2f%n", num1 + num2);
        System.out.printf("Rezultats (atnemsana): %.2f%n", num1 - num2);
        System.out.printf("Rezultats (reizinasana): %.2f%n", num1 * num2);
        if (num2 != 0) {
            System.out.printf("Rezultats (dali8sana): %.2f%n", num1 / num2);
        } else {
            System.out.println("Kļūda: dalīšana ar nulli nav atļauta.");
        }
        scanner.close();
    }
}
