package sec08.exam01;


public class CalculatorExample {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // static 멤버는 객체의 생성 없이 클래스명에 마침표를 붙이고 필드의 사용과 메소드 호출이 가능하다.
        // sratic 멤버는 객체를 생성해서도 접근 가능합니다.
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10,5);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
