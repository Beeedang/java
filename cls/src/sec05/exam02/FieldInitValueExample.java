package sec05.exam02;

public class FieldInitValueExample {
    public static void main(String[] args) {
        FieldInitValue fiv = new FieldInitValue();
        System.out.println("fiv.byField = " + fiv.byteField);
        System.out.println("fiv.shortField = " + fiv.shortField);
        System.out.println("fiv.intField = " + fiv.intField);
        System.out.println("fiv.longField = " + fiv.longField);
        System.out.println("fiv.booleanField = " + fiv.booleanField);
        System.out.println("fiv.charField = " + fiv.charField);
        System.out.println("fiv.floatField = " + fiv.floatField);
        System.out.println("fiv.doubleField = " + fiv.doubleField);
        System.out.println("fiv.arrField = " + fiv.arrField);
        System.out.println("fiv.referenceField = " + fiv.referenceField);
    }
}
