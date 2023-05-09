package TransFormStreamDemo;

import java.io.*;

public class ObjStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //method1();
        //method2();
        //method3();
    }

    private static void method3() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void method2() throws IOException {
        User user = new User("zhangsan", "qwer");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user);
        oos.close();
    }

    private static void method1() throws IOException {
        User user = new User("zhangsan", "qwer");

        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        bw.write(user.getUsername());
        bw.newLine();
        bw.write(user.getPassword());
        bw.close();
    }
}
