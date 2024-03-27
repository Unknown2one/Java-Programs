//  WAP for print the grades of the student (A, B, C, D)

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        System.out.println("Enter the Marks of the Student:");
        int marks =  grades.nextInt();
        if (marks >= 90) {
            System.out.println("You Got A");
        }
        else if (marks >= 75) {
            System.out.println("You got B");
        }
        else if (marks >= 60) {
            System.out.println("You got C");
        }
        else {
            System.out.println("You Got D");
        }
        grades.close();
        
    }
    
}
