public class arraysCD {
    public static void reverseArray(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<last){
            
            //swap
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;

            first++;
            last--;
        }
    }

    public static void pairs(int arr[]){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs : "+tp);
    }

    public static void subArrays(int arr[]){
        int ts=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum=0;
                System.out.print("[ ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                    currSum+=arr[j2];
                }
                System.out.print("]");
                System.out.print(" ");
                System.out.print("-> sub array sum : "+currSum+" ");
                System.out.println();
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                ts++;
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Maximum subArray sum is : "+ maxSum);
        System.out.println("total sub arrays : "+ ts);
    }


    public static void prefixSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for (int i = 1; i < pre.length; i++) {
            pre[i]=pre[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum=i==0?pre[j]:pre[j]-pre[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum is : "+maxSum);
    }

    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sub array sum is : "+ms);
    }

    public static int trappedRainWater(int height[]){
        int n=height.length;

        //calculate the left maximum boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //calculate the right max array

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for (int i = n-2; i>=0; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;

        //loop
        for (int i = 0; i < n; i++) {
            int waterlevel=Math.min(rightMax[i], leftMax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
    }

public static void main(String[] args) {
    int num[]={4,2,0,6,3,2,5};
    //reverseArray(num);
    //subArrays(num);
    //prefixSum(num);
    //kadanes(num);
    System.out.println(trappedRainWater(num));

    }
}
