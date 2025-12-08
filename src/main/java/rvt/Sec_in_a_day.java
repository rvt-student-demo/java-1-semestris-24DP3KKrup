package rvt;
import java.util.Scanner;

public class Sec_in_a_day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cik dienas velaties parverst sekundes?");
        int days = Integer.valueOf(scanner.nextLine());
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
        scanner.close();
    }
}
