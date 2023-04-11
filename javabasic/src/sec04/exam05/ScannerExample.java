package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // Scanner 에 대한 변수 scanner 만든것
        String inputData; // 입력값을 담을 문자열 변수

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열 = " + inputData);
            if (inputData.equals("q")) {
                break;
            }
        }

        System.out.println("종료");
    }
}
