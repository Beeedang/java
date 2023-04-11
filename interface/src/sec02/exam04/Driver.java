package sec02.exam04;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;    // 강제 타입 변환
            bus.checkFare();  // vehicle 이 bus 일때만 요금체크를 하라
        }
        vehicle.run();
    }
}
