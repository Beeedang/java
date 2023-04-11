package sec04.exam01;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();                              // 같은 패키지안에 Student를 만들어놓았기 때문
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
