package File;

import java.io.File;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        File[] files = file.listFiles();

        //System.out.println(Arrays.toString(files));

        if (files != null) {
            for (File path : files) {
                System.out.println(path);
            }
        }
    }
}
