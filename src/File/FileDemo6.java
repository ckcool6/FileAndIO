package File;

import java.io.File;
import java.io.IOException;

public class FileDemo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("FileAndIO\\File");

        if (!file.exists()){
            file.mkdirs();
        }
        File newFile = new File(file,"a.txt");
        newFile.createNewFile();
    }
}
