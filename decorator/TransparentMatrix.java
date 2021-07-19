package hw.decorator;

public class TransparentMatrix extends AbstractMatrixOperation{
    private final Matrix A;

    public TransparentMatrix(Matrix A){
        this.A = A;
    }

    @Override
    public int getElement(int i, int j){
        return A.getElement(j,i);
    }


}
