package sec01.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123412341234", 1);
        System.out.println("student.name = " + student.name);
        System.out.println("student.ssn = " + student.ssn);
        System.out.println("student.studentNo = " + student.studentNo);
    }
}
