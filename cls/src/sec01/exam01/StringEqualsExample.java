package sec01.exam01;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "플레이데이터";
        String strVar2 = "플레이데이터";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2의 참조 주소가 같습니다.");
        } else {
            System.out.println("strVar1과 strVar2의 참조 주소가 다릅니다.");
        }

        String strVar3 = new String( "플레이데이터");
        String strVar4 = new String("플레이데이터");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4의 참조 주소가 같습니다.");
            System.out.println("strVar3과 strVar4의 참조 주소가 다릅니다.");
        }

    }
}
