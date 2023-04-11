package sec01.exam09;

public class CatchOrderExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];  // program params이 없으면 raise ArrayIndexOutOfBoundsException
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);  // data1이 "a"라는 값으로 전달되면 raise NumberFormatException
            int value2 = Integer.parseInt(data2);
// Run -> edit Configuration -> 클래스 선택 -> a b 입력 후 다시 실행
            int result = value1 + value2;
            System.out.println("result = " + result);

        } catch (ArrayIndexOutOfBoundsException e) {                         // 포괄적인 Exception이 앞으로 오지않게 작성해야한다 -> 바로 밑에 오류발생
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료합니다.");
        }
    }
}
