package sec01.exam01;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        //인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();
        A.B.field2 = 3;
        A.B.method2();

        // 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;  // static 필드라 기울체로 나옴?
        A.C.method2();

        // 로컬 클래스 객체 생성: 메소드 호출 필요
        a.method();
    }
}
