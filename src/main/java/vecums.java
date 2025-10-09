public class vecums {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ievadiet savu dzimsanas gadu: ");
        int dzimsanasGads = scanner.nextInt();
        System.out.print("Ievadiet pasreizejo gadu: ");
        int pašreizējaisGads = scanner.nextInt();
        int vecums = pašreizējaisGads - dzimsanasGads;

        if (vecums >= 18) {
            System.out.println("Jus esat vecaks par 18 gadiem.");
        } else {
            System.out.println("Jus esat jaunaks par 18 gadiem.");
        }
        scanner.close();
    }
}
