package Conditional_Statement;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if ((year%4==0) && (year%100 != 0))
        {
            System.out.println("Leap Year!");
        }
        else if (year%400==0)
        {
            System.out.println("Leap Year!");
        }
        else
        {
            System.out.println("Not Leap Year!");
        }
    }
}
