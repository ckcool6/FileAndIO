package Coding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw = new FileWriter(new File("D:\\a.txt"));
        FileWriter fw = new FileWriter("D:\\a.txt");
        /*
        fw.write(97);
        fw.write(97);
        fw.write(97);
        */
        /*
        char[] chars = {97,98,99};
        fw.write(chars);
        */
        /*
        char[] chars = {97, 98, 99};
        fw.write(chars, 0, 1);
        */
        String line = "中文chinese";
        fw.write(line);
        fw.write(line, 0, 1);
        //fw.close();
        fw.flush();
        fw.write("123456");
        fw.flush();
    }
}
