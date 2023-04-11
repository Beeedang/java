package sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //Phone 클래스는 abstract로 선언되었기 때문에 객체를 생성할 수 없습니다.
        // Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
