public class binomialCoefficients {
    public static int nCr(int n,int r){
        int nf=1;
        int rf=1;
        int nrf=1;

        for (int i = 1; i <=n; i++) {
            nf*=i;
        }
        for (int i = 1; i <=r; i++) {
            rf*=i;
        }
        int nr=n-r;
        for (int i = 1; i <=nr; i++) {
            nrf*=i;
        }
        int ncr=nf/(rf*nrf);
        return ncr;
    }
    public static void main(String[] args) {
        int ncr=nCr(5, 3);
        System.out.println(ncr);
    }
}
