package hw.decorator;

public class Main {
    public static void main(String[] args){
        int [][] A = {{1,3,5}, {2,4,6}};
        int [][] B = {{2,3,4}, {5,6,7}};
        Matrix matrixA = new MatrixImpl(A);
        Matrix matrixB = new MatrixImpl(B);
        Matrix TransA = new TransparentMatrix(matrixA);
        Matrix TransB = new TransparentMatrix(matrixB);
        Matrix Sum = new SumOfTwoMatrices(matrixA, matrixB);
        System.out.println(TransA);
        System.out.println(TransB);
        System.out.println(Sum);
        
    }
}
