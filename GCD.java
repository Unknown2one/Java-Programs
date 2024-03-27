// WAP for GCD using Functions(Method)
public class GCD {
    static int gcd(int a,  int b){
        int Small; 
        if (a > b) {
            Small = a;
        }
        else{
            Small = b;
        }

        int HCF = 1;

        for(int i = Small; i > 1; i--){
            if (a % i == 0 && b % i == 0) {
                HCF = i;
                break;
            }
        }

        return HCF;
    }
    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 36;
        System.out.println("The GCD is: " + gcd(num1, num2));

        
    }
}
