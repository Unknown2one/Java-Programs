// WAP for Display Day name, by taking Day number.  (1 == Monday & So on)

import java.util.Scanner;

public class Dayname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit from 1 -7 to check it's DayName");
        int DayNumber = sc. nextInt();
        switch (DayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2: 
                System.out.println("Tuesday");
                break;
            
            case 3 : 
                System.out.println("Wednesday");
                break;
            
            case 4 :
                System.out.println("Thrusday");
                break;
            
            case 5 :
                System.out.println("Friday");
                break; 

            case 6 :
                System.out.println("Saturday");
                break;4
            
            case 7 : 
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Please Enter the Valid Value");
                break;
        }
        sc.close();
    }
}
