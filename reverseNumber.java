public class reverseNumber {
    public static void main(String[] args) {
        
        int n=18359;

        int r;
        int rev=0;
        while(n>0){
            r=n%10;
            n=n/10;
            rev*=10;
            rev+=r;
            
        }
        System.out.println(rev);
    }
}
