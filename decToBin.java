public class decToBin {

    public static int dec2bin(int a){
        int bin=0;
        int rem;
        int i=0;
        int a1=a;
        while(a>0){
            rem=a%2;
            a/=2;
            bin+=rem*((int)(Math.pow(10, i)));
            i++;
        }System.out.println("Binary equivalent of "+a1+" is "+bin);

        return bin;
    }
    public static void main(String[] args) {
        dec2bin(1000);
    }
}
