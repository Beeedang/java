package sec02.exam03;

public class Car {
    // 타이어 4짝을 필드로서 갖게 할겁니다.
    Tire frontLeftTire = new Tire(6, "앞왼쪽");
    Tire frontRightTire = new Tire(2, "앞오른쪽");
    Tire backLeftTire = new Tire(3, "뒤왼쪽");
    Tire backRightTire = new Tire(4, "뒤오른쪽");

    //메소드
    int run() {
        System.out.println("자동차가 달립니다.");
        if (frontLeftTire.roll() == false) {stop(); return 1;}
        if (frontRightTire.roll() == false) {stop(); return 2;}
        if (backLeftTire.roll() == false) {stop(); return 3;}
        if (backRightTire.roll() == false) {stop(); return 4;}
        return 0;
    }

    void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}
