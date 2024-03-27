// WAP for find the factorial.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want the Factorial of: ");
        int factorial = sc.nextInt(); 
        if (factorial == 0 || factorial == 1 ) {
            System.out.println("The Factorial is 1" );
        }
        else
        {
        for (int i = factorial-1; i>0; i--)
        {
            factorial *= i;
        }
        }
        System.out.println("The Factorial is " + factorial );
        sc.close();
        
    }
}
