package TransFormStreamDemo;

import java.io.*;

public class TransFormDemo1 {
    public static void main(String[] args) throws IOException {
        //method1();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\lu\\Desktop\\a.txt"),"gbk");
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            System.out.println((char) ch);
        }
        inputStreamReader.close();

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\lu\\Desktop\\b.txt"),"UTF-8");
        outputStreamWriter.write("测试");
        outputStreamWriter.close();
    }

    private static void method1() throws IOException {
        FileReader fr = new FileReader(new File("C:\\Users\\lu\\Desktop\\a.txt"));

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}
