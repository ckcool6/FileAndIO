package Coding;

import java.io.*;

public class CharBufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lu\\Desktop\\a.txt"));
        bw.write("编辑器");
        bw.newLine();
        bw.write("abcd");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static void method2() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lu\\Desktop\\a.txt"));

        bw.write(97);
        char[] chars = {98, 99, 100};
        bw.write(chars);
        bw.write(chars, 0, 1);
        bw.write("字符");
        String line = "abcde";
        bw.write(line, 0, 3);
        bw.flush();
        bw.close();
    }

    private static void method1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lu\\Desktop\\a.txt"));

        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        br.close();
    }
}
