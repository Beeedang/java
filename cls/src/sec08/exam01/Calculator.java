package sec08.exam01;

public class Calculator {
    static double pi = 3.141592;   // pi값을 하나로 공유하기 위해 static 사용

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
