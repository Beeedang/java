package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws Exception {  //예외처리
        Writer writer = new FileWriter("C:/codes/java/stream/test7.db");

        char a = 'A';
        char b = 'B';
        char c = 'C';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }
}
