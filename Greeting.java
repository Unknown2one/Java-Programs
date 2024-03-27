// 4. Write a program to take the username and year of enrollment as input from the 
// user and generate the welcome message as output.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int enrollmentyear = sc.nextInt();
        System.out.println("Welcome to the University " + name + "! Hope " + enrollmentyear + "is Full of Memories and Enjoyment");
        sc.close();
    }
}
