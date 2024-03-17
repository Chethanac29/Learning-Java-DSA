public class linearSearch {
    public static int search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println(key+" found at "+i+"th Index of the Array");
                return i;
            }
        }
        return -1;
    }
    public static int largestNum(int arr[]){
        int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>large) {
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int num[]={-2,-4,-6,-8,-10,-12,-14,-16,-55,-20};
        int key=3;
        //search(num, key);
        System.out.println(largestNum(num));
    }
}
