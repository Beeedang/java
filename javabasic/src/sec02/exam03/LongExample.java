package sec02.exam03;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 1000000000;  // 컴파일 에러
        long var4 = 1000000000L;  // 롱으로 할경우에는 뒤에 L을 붙여준다

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
