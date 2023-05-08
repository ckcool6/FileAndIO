package Coding;

import java.io.*;
import java.util.Arrays;

public class CharBufferStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lu\\Desktop\\a.txt"));
        String line = br.readLine();
        System.out.println("读取到的数据为" + line);
        br.close();
        String[] split = line.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            String smallStr = split[i];
            int number = Integer.parseInt(smallStr);
            arr[i] = number;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lu\\Desktop\\a.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
            bw.flush();
        }
        bw.close();
    }
}
