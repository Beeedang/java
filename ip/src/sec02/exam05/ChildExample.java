package sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        참조 변수의 타입인 Parent에는 field2, method3(){}에 대한 정보가 없다,
        그래서 실제 갖고 있는 객체가 Child이고 그 개게 안에 field2, method3(){} 있다고 해서
        이 참조 변수를 통해서 접근하거나 호출할 수 없다.
        parent.field2 = "data2";
        parent.method3();
         */
        //int a =1;
        //short b = (short) a;

        Child child = (Child) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
