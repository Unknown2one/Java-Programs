public class PrimeNumber {
    static boolean Prime(int num){
       if (num <= 1) {
            return false;
       }

       for(int i = 2; i < num; i++){
        if (num % i == 0) {
            return false;
        }
        
       }
       return true; 
    }
    public static void main(String[] args) {
        if(Prime(97)){
            System.out.println("This is Prime Number");
        }
        else{
            System.out.println("This is not");
        }
    }
}
