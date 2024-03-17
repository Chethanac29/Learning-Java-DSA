import java.util.Arrays;

public class basicSorting {
    
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " " );
        }
    }

    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int index = i+1; index < arr.length; index++) {
                if(arr[minpos]>arr[index]){
                    minpos=index;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");            
        }
    

    }
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest,arr[i]);            
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,1,5,4,3,4,3,5,2};
        countingsort(arr);
        //Arrays.sort(arr,0,3);
        printArray(arr);
    }
}
