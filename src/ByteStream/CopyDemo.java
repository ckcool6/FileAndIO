package ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\迅雷下载\\a.txt");

        //method1(fis, fos);
        byte[] bytes = new byte[1024];
        int len; //本次读到的有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void method1(FileInputStream fis, FileOutputStream fos) throws IOException {
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
