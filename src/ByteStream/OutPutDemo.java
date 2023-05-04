package ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("D:\\a.txt"));

            byte[] bys = {97, 98, 99, 100, 101, 102, 103};
            fos.write(bys, 1, 2);
            fos.write(bys);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}
