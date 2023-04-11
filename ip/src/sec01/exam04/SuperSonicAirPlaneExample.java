package sec01.exam04;

public class SuperSonicAirPlaneExample {
    public static void main(String[] args) {
        SuperSonicAirPlane superSonicAirPlane = new SuperSonicAirPlane();
        superSonicAirPlane.takeOff();
        superSonicAirPlane.fly();
        superSonicAirPlane.flyMode = superSonicAirPlane.SUPERSONIC;
        superSonicAirPlane.fly();
        superSonicAirPlane.flyMode = superSonicAirPlane.NORMAL;
        superSonicAirPlane.fly();
        superSonicAirPlane.land();
    }
}
