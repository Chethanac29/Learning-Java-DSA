package FunctionsAndMethods;

public class firstFunction {
    public static void printHelloWorld(int i){
        for (int j = 0; j < i; j++) {
            System.out.println(j+" Hello World!");
        }

    }
    public static int factorial(int n){
        int f=1;
        while (n>0) {
            f*=n;
            n-=1;
        }
        return f;
    }
    public static void main(String[] args) {
        //printHelloWorld(3);
        int n=factorial(3);
        System.out.println(n);
    }
    
}
