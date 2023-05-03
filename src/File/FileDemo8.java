package File;

import java.io.File;
import java.util.HashMap;

public class FileDemo8 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        HashMap<String, Integer> hm = new HashMap<>();

        getCount(hm, file);
        //System.out.println(hm);
        hm.forEach(
                (key, value) -> System.out.println(key + "后缀的文件" + "有" + value + "个")
        );
    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    String fileName = f.getName();
                    String[] fileNameArr = fileName.split("\\.");
                    if (fileNameArr.length == 2) {
                        String fileEndName = fileNameArr[1];
                        if (hm.containsKey(fileEndName)) {
                            Integer count = hm.get(fileEndName);
                            count++;
                            hm.put(fileEndName, count);
                        } else {
                            hm.put(fileEndName, 1);
                        }
                    }
                } else {
                    getCount(hm, f);
                }
            }
        }
    }
}
