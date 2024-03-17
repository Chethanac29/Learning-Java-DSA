public class primeInRange {
    
    public static boolean isPrime(int a){
        if(a==1){
            return false;
        }
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int a, int b){
        for (int i = a; i <=b; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrime(1, 100);
    }
}
