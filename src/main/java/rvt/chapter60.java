package rvt;
import java.util.Scanner;
public class chapter60 {

    public static void main(String[] args) {
    System.out.println("kuru funkciju tu velies palaist? (1-5)");
    Scanner skeneris = new Scanner(System.in);
    int choice = skeneris.nextInt();
    if (choice == 1) {
        ex1();
    } else if (choice == 2) {
        ex2();
    } else if (choice == 3) {
        ex3();
    } else if (choice == 4) {
        ex4();
    } else if (choice == 5) {
        ex5();
    } else {
        System.out.println("Tāda funkcija nav.");
    }
    skeneris.close();
}


    public static void ex1() {
    int[] val = {0, 1, 2, 3};

    int sum = 0;
    for (int i = 0; i < val.length; i++) {
    sum += val[i];
    }


    System.out.println( "Sum of all numbers = " + sum);
    }

    public static void ex2() {
    int[] val = {13, -4, 82, 17}; 
    int[] twice;
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // Construct an array object for twice.
    twice = new int [val.length];
    
    // Put values in twice that are twice the
    // corresponding values in val.
    for (int i = 0; i < val.length; i++) {
        twice[i] = 2 * val[i];
    }


    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }



    public static void ex3() {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {-12,  24, -79, -13};
    int[] sum    = {  0,   0,   0,   0};
    
    // Add values from corresponding cells of valA and valB
    // and put the result in the corresponding cell of sum.
    for (int i = 0; i < valA.length; i++) {
        sum[i] = valA[i] + valB[i];
    }



    System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );}



    public static void ex4() {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {  0,   0,   0,   0};
    
    // Put values into valB so that the sum of the values
    // in corresponding cells of valA and valB is 25.
    for (int i = 0; i < valA.length; i++) {
        valB[i] = 25 - valA[i];
    }




    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );

    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }



    public static void ex5() {
    int[] val = {0, 1, 2, 3}; 
    int temp;

    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // reverse the order of the numbers in the array
    for (int i = 0; i < val.length / 2; i++) {
        temp = val[i];
        val[i] = val[val.length - 1 - i];
        val[val.length - 1 - i] = temp;
    }

    

    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }




}