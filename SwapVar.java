// 1. Write a program to swap the values of two variables. 

public class SwapVar {
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 20;
        System.out.println("Value of a: " + a + "Value of b: " + b);  
        System.out.println("Swapped value of a and b is");
        c = a; 
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
