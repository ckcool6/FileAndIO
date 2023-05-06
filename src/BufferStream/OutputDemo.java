package BufferStream;

import java.io.*;

public class OutputDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lu\\Desktop\\a.txt"));

        //method1(bis, bos);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }

    private static void method1(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
