package Coding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //method1();
        FileReader fr = new FileReader("D:\\a.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }

    private static void method1() throws IOException {
        FileReader fr = new FileReader("D:\\a.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}
