package File;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        File src = new File("D:\\aaa");
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }
        //
        src.delete();
    }
}
