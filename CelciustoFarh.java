// Write a program to convert Celsius to Fahrenheit.

import java.util.Scanner;

public class CelciustoFarh {
    public static void main(String[] args) {
        System.out.println("Welcome to Celsius to Faheenheit Converter");
        double Celsius,Fahrenheit; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Degree in Celsius");
        Celsius = input.nextDouble();
        Fahrenheit = (Celsius + 9/5) + 32;
        System.out.println("The Converted Degree is: " + Fahrenheit);
        input.close();




    }
}
