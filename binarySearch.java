public class binarySearch {
    public static int binSearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){

            //calculate the mid
            mid=(start+end)/2;

            //comparison

            if(arr[mid]==key){//key found
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int key=2;

        System.out.println("Key found at : "+binSearch(arr, key));

    }
}
