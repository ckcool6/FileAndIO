package PropertiesDemo;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //method1(prop);
        prop.setProperty("1", "lisi");
        prop.setProperty("2", "zhangsan");
        System.out.println(prop);

        String value = prop.getProperty("1");
        System.out.println(value);

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String property = prop.getProperty(key);
            System.out.println(key + "=" + property);
        }
    }

    private static void method1(Properties prop) {
        prop.put("lisi", "zhangsan");
        prop.put("zhaoer", "wangwu");
        System.out.println(prop);

        /*
        prop.remove("lisi");
        System.out.println(prop);
        */

        prop.get("zhaoer");
        System.out.println(prop);

        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
