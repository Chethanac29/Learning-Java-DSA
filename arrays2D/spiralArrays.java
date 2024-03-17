import java.util.Scanner;


public class spiralArrays {

    public static boolean matrixSearch(int mat[][],int key){

        int row=0,col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("Fount at ("+row+","+col+")");
                return true;
            }else if(key<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static int diagonalSum(int mat[][]){
        int p=0;
        int s=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i==j){
                    p+=mat[i][j];
                }
                if(i+j==mat.length-1){
                    s+=mat[i][j];
                }
            }
        }
        System.out.println(p-s);
        return p-s;
    }

public static void spiralMatrix(int mat[][]){
    int top=0;
    int bottom=mat.length-1;
    int right=mat[0].length-1;
    int left=0;

    while(top<bottom || left<right){
        for (int i = left; i <=right ; i++) {
            System.out.print(mat[top][i]+" ");
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            System.out.print(mat[i][right]+" ");
        }
        right--;
        for (int i = right; i >= left; i--) {
            System.out.print(mat[bottom][i]+" ");
        }
        bottom--;
        for (int i = bottom; i >= top; i--) {
            System.out.print(mat[i][left]+" ");
        }
        left++;
    }
}

    public static void printMat(int mat[][]){

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};



        printMat(mat);
        //spiralMatrix(mat);
        //diagonalSum(mat);
        matrixSearch(mat, 33);
    }
}
