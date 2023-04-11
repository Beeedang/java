package sec01.exam09;

public class ClassExample {
    public static void main(String[] args) {
        Class clazz = Car.class;   // 첫번째 방법
        //Class clazz = Class.forName("sec01.exam09.Car");  // 두번째 방법
        //Car car = new Car();
        //Class clazz = car.getClass();   //세번째 방법

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
