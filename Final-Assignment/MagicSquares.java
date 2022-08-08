import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MagicSquares {
    public static void getNumbers() throws IOException {
        char[] array = new char[300];
        FileReader input = new FileReader("C:\\Users\\ashmi\\Documents\\GitHub\\Java\\Final-Assignment\\magic.txt");
        input.read(array);
        String string = Arrays.toString(array);
        System.out.println(string);
        input.close();
    }
    public static void main (String[] args) throws IOException {
        getNumbers();
    }
}
