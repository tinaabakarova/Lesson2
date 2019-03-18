package classes;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
    }

    public MyArraySizeException(String s) {
        super(s);
    }
}
