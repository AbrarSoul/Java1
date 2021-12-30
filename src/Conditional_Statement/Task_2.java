package Conditional_Statement;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The greatest number is : "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The greatest number is : "+num2);
        }
        else if(num3>num2 && num3>num1){
            System.out.println("The greatest number is : "+num3);
        }
        else{
            System.out.println("They are all equal");
        }
    }
}
