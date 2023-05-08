package Coding;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharStreamDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //method1();
        byte[] bytes = {-25, -88, -117, -27, -70, -113, -27, -111, -104};
        String s = new String(bytes);
        System.out.println(s);
    }

    private static void method1() throws UnsupportedEncodingException {
        String s = "程序员";
        byte[] bytes1 = s.getBytes();
        byte[] bytes2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(bytes2));
    }
}
