package Conditional_Statement;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String _user_name = "abrar95";
        String _password = "1234";
        System.out.print("User Name: ");
        String user_name = input.next();
        System.out.print("Password: ");
        String password = input.next();

        if(user_name.equals(_user_name) && password.equals(_password)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("invalid login");
            System.out.println("Please enter valid Username and Password");
        }
    }
}
