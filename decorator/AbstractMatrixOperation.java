package hw.decorator;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public abstract class AbstractMatrixOperation implements Matrix {

    @Override
    public String toString() {
        List<List<Integer>> Matrix = new ArrayList<>();

        for (int i = 0; ; i++) {
            try {
                this.getElement(i, 0);
            } catch (ArrayIndexOutOfBoundsException a) {
                break;
            }

            Matrix.add(new ArrayList<>());
            for (int j = 0; ; j++) {
                try {
                    Matrix.get(i).add(this.getElement(i, j));
                } catch (ArrayIndexOutOfBoundsException a) {
                    break;
                }

            }

        }
        return Matrix.toString();
    }
}

