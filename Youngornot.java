import java.util.Scanner;

public class Youngornot {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age =  sc.nextInt();
        if (age>= 18) {
            System.out.println("You are Young");
        }
        else {
            System.out.println("You are not Young");
        }
        sc.close();
    }
}
