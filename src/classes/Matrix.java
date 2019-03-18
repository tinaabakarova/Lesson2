package classes;

import java.text.ParseException;

public class Matrix {
    public int countMatrixSum(String array[][]) {
        int sum = 0;
        String msg = "";

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4Х4");
        }
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                    msg = "ячейке " + i + " столбце " + j + " ";
                }
            }

        }catch (NumberFormatException e){
            throw new MyArrayDataException("Неверный формат данных в " + msg);
        }
        return sum;
    }
}
