package File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() {
        File file = new File("D:\\a.txt");
        boolean result = file.delete();
        System.out.println(result);
    }

    private static void method2() {
        File file = new File("D:\\aaa\\bbb");
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        File file1 = new File("C:\\Users\\lu\\Desktop\\aaa");
        boolean result = file1.createNewFile();
        System.out.println(result);
    }
}
