public class arrs {
    public static void arrMod(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]-=5;
        }
        System.out.println("Modified array >");
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int num[]=new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i]=i*10;
        }
        arrMod(num);
    }
}