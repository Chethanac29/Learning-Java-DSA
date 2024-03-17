import java.util.Scanner;

public class Arrays2D {

    public static int minElement(int mat[][]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
            }
        }
        return min;
    }

    public static boolean search(int mat[][],int key){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==key){
                    System.out.println("Key found at ["+i+","+j+")  index");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int matrix[][]=new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println("Enter the ["+i+","+j+"] th element of the matrix");
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }
        int x=minElement(matrix);
        System.out.println(x);
        search(matrix, x);


    }
}
