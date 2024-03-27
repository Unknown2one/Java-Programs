import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You Want the Fibonnaci of: ");
        int Number = sc.nextInt();
        System.out.println("Fibonnaci Series is");
        int num1 = 0; 
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 2; i<Number; i++){
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
        sc.close();

    }
}
