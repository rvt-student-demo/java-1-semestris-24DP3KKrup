package rvt;
import java.util.*;
public class JMArrayList {
    public static void main(String[] args){
    }
    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from user until -1 is entered
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        // Ask for start and end indices
        System.out.print("From where? ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int end = Integer.parseInt(scanner.nextLine());

        // Print numbers in the specified range (inclusive)
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    scanner.close();
    }
    public static void ListSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("In total: " + names.size());
        scanner.close();
}
    public static void OnTheList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        System.out.println();
        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        scanner.close();
    }
    public static void removeLast() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }

        System.out.println(strings);
    }
}
