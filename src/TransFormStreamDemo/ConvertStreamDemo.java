package TransFormStreamDemo;

import java.io.*;

public class ConvertStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("zhangsan", 16);
        Student s2 = new Student("lisi", 12);
        Student s3 = new Student("wangwu", 15);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();

        //
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        while (true) {
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }
}
