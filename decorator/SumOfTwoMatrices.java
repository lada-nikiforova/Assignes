package hw.decorator;

public class SumOfTwoMatrices extends AbstractMatrixOperation{
    private final Matrix A;
    private final Matrix B;
    public SumOfTwoMatrices(Matrix A, Matrix B){
        this.A = A;
        this.B = B;
    }

    @Override
    public int getElement(int i, int j){
        return A.getElement(i,j) + B.getElement(i,j);
    }

}
