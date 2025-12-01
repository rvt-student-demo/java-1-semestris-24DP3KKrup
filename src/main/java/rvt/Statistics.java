package rvt;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StatsData allNumbers = new StatsData();
        StatsData evenNumbers = new StatsData();
        StatsData oddNumbers = new StatsData();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            allNumbers.addNumber(number);

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}

class StatsData {
    private int count;
    private int sum;

    public StatsData() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
}
