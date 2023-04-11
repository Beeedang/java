package prac;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요: ");
        String var1 = scanner.nextLine();
        double num1 = Double.parseDouble(var1);

        System.out.println("두 번째 수를 입력하세요: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("------------------");
        if(num2 != 0.0){
            System.out.println("결과: " + (num1/num2));
        } else {
            System.out.println("결과: 무한대");
        }
    }
}
