import classes.Matrix;
import classes.MyArrayDataException;
import classes.MyArraySizeException;

public class Launcher {
    public static void main(String[] args) {
        try {
            String[][] arr = {{"1", "2", "3", "4", "5"},
                    {"1", "2", "3", "4", "5"},
                    {"1", "2", "3", "4", "5"},
                    {"1", "2", "3", "4", "5"}};

            Matrix matrix = new Matrix();
            System.out.println(matrix.countMatrixSum(arr));
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }
}
