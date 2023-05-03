package File;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();

    }

    private static void method3() {
        File file = new File("D:\\aaa");
        String result = file.getName();
        System.out.println(result);
    }

    private static void method2() {
        File file = new File("a.txt");
        boolean result = file.exists();
        System.out.println(result);
    }

    private static void method1() {
        File file = new File("D:\\a.txt");
        boolean result = file.isDirectory();
        System.out.println(result);
    }
}
