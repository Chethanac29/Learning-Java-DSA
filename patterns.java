import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the number of rows");
        // int rows=4;
        // //System.out.println("ENter the number of Columns");
        // int cols=5;

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         // if(i==0){
        //         //     System.out.print(" * ");
        //         // }else if(i!=0 && (j==0 || j==cols-1)){
        //         //     System.out.print(" * ");
        //         // }else if(i==rows-1){
        //         //     System.out.print(" * ");
        //         // }else{
        //         //     System.out.print("   ");
        //         // }
        //         if(i>=j){
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i <= rows; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        // for (int i = rows; i >= 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        int m=5;
        //int n=4;
        // for (int i = m; i >=0; i--) {
        //     for (int j = 0; j < n; j++) {
        //         if(j>i){
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <=m; i++) {
        //     for (int j = 1; j <= m-i+1; j++) {
        //         System.out.printf(" %d ",j);
        //     }
        //     System.out.println();
        // }
        int n=1;
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

        
       
        
    }
}
