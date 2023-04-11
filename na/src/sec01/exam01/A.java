package sec01.exam01;

//바깥 클래스
public class A {
    // A 클래스의 생성자
    public A() {
        System.out.println("A클래스의 인스턴스가 생성되었습니다.");
    }

    // 인스턴스 멤버 클래스
    public class B {
        // 생성자
        public B() {
            System.out.println("B 클래스의 인스턴스가 생성되었습니다.");
        }
        // 필드
        int field1;
        static int field2;

        //메소드
        void method1() {
            System.out.println("field1 = " + field1);
            System.out.println("field2 = " + field2);
        }
        static void method2() {
            System.out.println("field2 = " + field2);
        }
    }

    //정적 멤버 클래스
    static class C {
        public C() {
            System.out.println("C 클래스의 인스턴스가 생성되었습니다.");
        }
        //필드
        int field1;
        static int field2;

        //메소드
        void method1(){}
        static void method2(){}
    }

    //로컬 클래스
    void method() {
        class D {
            public D() {
                System.out.println("D 클래스의 인스턴스를 생성하였습니다.");
            }
            //필드
            int field1;
            static int field2;

            //메소드
            void method1(){}
            static void method2(){}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
        D.field2 = 3;
        D.method2();
    }

}
