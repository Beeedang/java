package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class WriteExample {
    public static void main(String[] args) throws Exception {  // throws 방법이 좋은건 아니다
        InputStream is = new FileInputStream("C:/codes/java/stream/test1.db");
        while (true) {
            int data = is.read();
            if (data == -1) {
                break;
            }
            System.out.println(data);
        }
        is.close();
    }
}
