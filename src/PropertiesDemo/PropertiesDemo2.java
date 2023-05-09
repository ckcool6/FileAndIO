package PropertiesDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        //method1(prop);
        prop.put("zhangsan", "123");
        prop.put("lisi", "789");
        prop.put("wangwu", "456");

        FileWriter fw = new FileWriter("prop.properties");
        prop.store(fw,null);
        fw.close();
    }

    private static void method1(Properties prop) throws IOException {
        FileReader fr = new FileReader("prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
