package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue; // 자동 형변환되지 않고 에러 발생되기 때문에 강제 형변환을 해주
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;      // 오류 발생시 alt+enter를 누르면 해결방법을 제안해준다
        System.out.println("doubleValue = " + doubleValue);
    }
}
