package sec01.exam12;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Integer obj1 = new Integer(100); -> Integer는 곧 사라지게 될...
        //Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300"); // -> 이거로 통일

        // Unboxing
        int value3 = obj3.intValue();

        System.out.println(value3);
    }
}
