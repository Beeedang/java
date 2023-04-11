package sec02.exam06;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3]; // default값으로 null을 채운다.
        strArray[0] = "Java";   // 문자 리터럴 값을 같게 만들면 같은 객체를 바라보게 된다.
        strArray[1] = "Java";   // 문자 리터럴 값을 같게 만들면 같은 객체를 바라보게 된다.
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
