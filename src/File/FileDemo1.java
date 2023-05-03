package File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() {
        File file1 = new File("C:\\Users\\lu\\Desktop");
        String path = "a.txt";
        File file = new File(file1,path);
        System.out.println(file);
    }

    private static void method2() {
        String path1 = "C:\\Users\\lu\\Desktop";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        System.out.println(file);
    }

    private static void method1() {
        String path = "C:\\Users\\lu\\Desktop\\a.txt";
        File file = new File(path);
    }
}
