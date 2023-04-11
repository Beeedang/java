package sec03.exam07;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt( "10");    // 정보를 보고싶으면 ctrl누르고 왼쪽클릭하면 창이 열림 창을 왓다갓다 할때는 alt+방향키
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        char c1= 'a';
        char c2 =(char)(c1 +1);
        System.out.println(c2);

        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = (int) (var1 + var2 + var3 + (int)Double.parseDouble(var4));
        System.out.println(result);

    }
}
