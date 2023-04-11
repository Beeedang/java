package sec02.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method2();
        child.method3();

        // 호출 불가늘하다.
        // parent 참조 변수는 parent 클래스의 멤버에 대해서만 접근 가능합니다.
        // parent.method3();
    }
}
