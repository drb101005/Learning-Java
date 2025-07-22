package Inputs;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        // int a = sc.nextInt();
        Float a = sc.nextFloat();
        System.out.println("Enter number 2 : ");
        // int b = sc.nextInt();
        Float b = sc.nextFloat();
        // int sum = a + b;
        Float sum = a + b;
        System.out.println("The sum of numbers is ");
        System.out.println(sum);
        boolean b1 = sc.hasNextInt()
        System.out.println(b1);
        sc.close();
    }

}
