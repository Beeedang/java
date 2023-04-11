package sec02.exam08;

public class BooleanExample {
    public static void main(String[] args) {    // main은 class에 있다.
        boolean stop = true;   // python은 True라고 썼는데, java에선 true를 이렇게 소문자로 쓴다.
        if (stop) {    // ctrl+shift+enter 을 누르면 자동 완성
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }
    }
}
