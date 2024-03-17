import java.lang.Math;

public class binTodec {
    public static int bin2dec(int a){
        int dec=0;
        int LD;
        int i=0;
        while(a>0){
            LD=a%10;
            a/=10;
            dec+=LD*(Math.pow(2, i));
            i++;
        }
        System.out.println(dec);
        return dec;
    }
    public static void main(String[] args) {
        bin2dec(1111101000);
    }
}
