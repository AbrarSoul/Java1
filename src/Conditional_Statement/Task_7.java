package Conditional_Statement;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        Scanner input = new Scanner(System.in);
        double rand_num_1 = Math.random() * (max - min) + min; // Math.random() returns a random number
        double rand_num_2 = Math.random() * (max - min) + min; // between 0 and 1; that's why used this technique
        int num1 = (int) rand_num_1;    // typecast
        int num2 = (int) rand_num_2;    // typecast
        System.out.println("What is the sum of " + num1 + " and " + num2 + "? ");
        System.out.print("Ans: ");
            int sum = input.nextInt();
            if (num1 + num2 == sum) {
                System.out.printf("Answer is Correct!\n");
            } else {
                System.out.println("Answer is Wrong!");
            }

    }
}
