package rvt;
import java.util.Scanner;
public class odd_int {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("ievadi 1. skaitli");
    int pirmais = Integer.parseInt(scan.nextLine());
    System.out.println("Ievadi 2, skaitli:");
    int pedejais = Integer.parseInt(scan.nextLine());

    scan.close();
    for (int i = pirmais; i <= pedejais;) {
    if (i / 2  * 2 == i) {
        i = i + 1;
    }
    else {
        System.out.println(i);
        i = i + 1;
    }
    }

}
}
