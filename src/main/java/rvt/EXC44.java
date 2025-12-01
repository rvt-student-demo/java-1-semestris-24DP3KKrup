package rvt;
import java.util.Scanner;

public class EXC44 {
	public static void main(String[] args){
    System.out.println("izvelaties uzdevumu no 1 lidz 7");
    Scanner scanner = new Scanner(System.in);
    int izv = Integer.parseInt(scanner.nextLine());
    if (izv == 1) {
        ex1();
    } else if (izv == 2) {
        ex2();
    } else if (izv == 3) {
        ex3();
    } else if (izv == 4) {
        ex4();
    } else if (izv == 5) {
        ex5();
    } else if (izv == 6) {
        ex6();
    } else if (izv == 7) {
        ex7();
    } else {
        System.out.println("Neeksistejos uzdevums");
    }
            scanner.close();
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi savu Pilno vārdu: ");
        String input = scanner.nextLine().trim();
        int spaceIndex = input.indexOf(" ");
        if (spaceIndex > 0) {
            String firstName = input.substring(0, spaceIndex);
            String lastName = input.substring(spaceIndex + 1).toUpperCase();
            System.out.println(firstName + " " + lastName);
        } else {
            System.out.println("Lūdzu ievadi savu pilno vārdu un uzvārdu.");
        scanner.close();
        }
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        scanner.close();
    }    
    public static void ex3(){
    var scanner = new Scanner(System.in);
    String[] siev_V = {"Amy", "Buffy", "Cathy"};
    String[] vir_V = {"Elroy", "Fred", "Graham"};
    while (true) {
        System.out.print("Ievadi vārdu:\n");
        String input = scanner.nextLine().trim();
        if (input.length() == 0) {
            break;
        }
        for (String vards : siev_V) {
            if (input.startsWith(vards + " ")) {
                System.out.println("Ms. " + input);
                input = null;
                break;
            }
        }
        if (input != null) {
            for (String vards : vir_V) {
                if (input.startsWith(vards + " ")) {
                    System.out.println("Mr. " + input);
                    input = null;
                    break;
                }
            }
        }
        if (input != null) {
            System.out.println(input);
        }
    }
    scanner.close();
    }    
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        String input = scanner.nextLine().trim();

        int minutes = 0;
        int seconds = 0;

        if (input.length() <= 2) {
            seconds = Integer.parseInt(input);
        } else {
            String minPart = input.substring(0, input.length() - 2);
            String secPart = input.substring(input.length() - 2);
            minutes = Integer.parseInt(minPart);
            seconds = Integer.parseInt(secPart);
        }

        String secString = (seconds < 10) ? "0" + seconds : Integer.toString(seconds);
        System.out.println("Your time->  " + minutes + ":" + secString);
        scanner.close();
    }
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        boolean inBlockComment = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String trimmed = line.trim();
            if (trimmed.startsWith("/*")) {
            inBlockComment = true;
            System.out.println(line);
            } 
            else if (trimmed.startsWith("*/")) {
            System.out.println(line);
            inBlockComment = false;
            } 
            else if (inBlockComment) {
            System.out.println(line);
            } 
            else if (trimmed.startsWith("//")) {
            System.out.println(line);
            }
            else if (trimmed.startsWith("exit")) {
            break;
            }
        }
        scanner.close();
    }
    public static void ex6(){
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Enter your password:\n");
        String password = scanner.nextLine();

        if (password.length() >= 7) {
            if (!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase())) {
                int digitCount = 0;
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        digitCount++;
                    }
                }
                if (digitCount > 0) {
                    System.out.println("Acceptable password.");
                    break;
                }
            }
        }
        System.out.println("That password is not acceptable.");
    }
    scanner.close();
    }
    public static void ex7(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word -->");
        String word = scanner.nextLine();

        int spaces = 0;
        while (word.length() > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println(word);
            if (word.length() <= 1) {
                break;
            }
            word = word.substring(1, word.length() - 1);
            spaces++;
        }
        scanner.close();
    }
}
