package rvt;
import java.util.Scanner;

public class exc50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("izvelies uzdevumu (1-5):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: ex1.main(null); break;
            case 2: ex2.main(null); break;
            case 3: ex3.main(null); break;
            case 4: ex4.main(null); break;
            case 5: ex5.main(null); break;
            default: System.out.println("tada uzdevuma nav.");
        }
        scanner.close();
    }

    public static class ex1 {
        static class Kaste {
            double biezums, augst, garums;
            Kaste(double b, double a, double g) { biezums = b; augst = a; garums = g; }
            double tilp() { return biezums * augst * garums; }
            double lauk() { return 2 * (biezums * augst + biezums * garums + augst * garums); }
        }
        public static void main(String[] args) {
            Kaste k = new Kaste(2.5, 5.0, 6.0);
            System.out.println("laukums: " + k.lauk() + " tilpums: " + k.tilp());
            System.out.println("garums: " + k.garums + " augstums: " + k.augst + " biezums: " + k.biezums);
        }
    }

    public static class ex2 {
        static class Kaste {
            double b, a, g;
            Kaste(double b, double a, double g) { this.b = b; this.a = a; this.g = g; }
            double tilp() { return b * a * g; }
            double lauk() { return 2 * (b * a + b * g + a * g); }
            double augsa() { return b * g; }
        }
        public static void main(String[] args) {
            Kaste k = new Kaste(2.5, 5.0, 6.0);
            System.out.println("laukums: " + k.lauk() + " tilpums: " + k.tilp());
            System.out.println("Augsa: " + k.augsa());
        }
    }

    public static class ex3 {
        static class Kaste {
            double b, a, g;
            Kaste(double b, double a, double g) { this.b = b; this.a = a; this.g = g; }
            Kaste(Kaste k) { this(k.b, k.a, k.g); }
            double tilp() { return b * a * g; }
            double lauk() { return 2 * (b * a + b * g + a * g); }
        }
        public static void main(String[] args) {
            Kaste k = new Kaste(2.5, 5.0, 6.0);
            Kaste copy = new Kaste(k);
            System.out.println("laukums: " + copy.lauk() + " tilpums: " + copy.tilp());
            System.out.println("garums: " + copy.g + " augstums: " + copy.a + " biezums: " + copy.b);
        }
    }

    public static class ex4 {
        static class Kaste {
            double b, a, g;
            Kaste(double b, double a, double g) { this.b = b; this.a = a; this.g = g; }
            Kaste lielkast() { return new Kaste(b * 1.25, a * 1.25, g * 1.25); }
            Kaste mazkast() { return new Kaste(b * 0.75, a * 0.75, g * 0.75); }
        }
        public static void main(String[] args) {
            Kaste k = new Kaste(2.5, 5.0, 6.0);
            Kaste lielaks = k.lielkast();
            Kaste mazaks = k.mazkast();
            System.out.println("originali: " + k.b + " " + k.a + " " + k.g);
            System.out.println("lielaks: " + lielaks.b + " " + lielaks.a + " " + lielaks.g);
            System.out.println("mazaks: " + mazaks.b + " " + mazaks.a + " " + mazaks.g);
        }
    }

    public static class ex5 {
        static class Kaste {
            double b, a, g;
            Kaste(double b, double a, double g) { this.b = b; this.a = a; this.g = g; }
            boolean nests(Kaste k) { return b < k.b && a < k.a && g < k.g; }
        }
        public static void main(String[] args) {
            Kaste mazs = new Kaste(2.0, 4.0, 5.0);
            Kaste liels = new Kaste(3.0, 5.0, 6.0);
            System.out.println("maza der liela: " + mazs.nests(liels));
            System.out.println("liela der maza: " + liels.nests(mazs));
        }
    }
}
