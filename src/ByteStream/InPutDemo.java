package ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InPutDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("D:\\a.txt"));
        //method1(fis);
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char)b);
        }
        fis.close();
    }

    private static void method1(FileInputStream fis) throws IOException {
        int read = fis.read();
        System.out.println((char) read);

        fis.close();
    }
}
