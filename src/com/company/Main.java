package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new App().run();
    }
}

class App {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        int num2 = 0;

        while ( true ) {
            System.out.print("두번째 숫자를 입력해주세요 : ");
            try {
                num2 = Integer.parseInt(sc.nextLine());
            }
            catch ( NumberFormatException e ) {
                System.out.println("[입력오류] : 숫자로 입력해주세요.");
                continue;
            }

            break;
        }

        System.out.printf("결과 : %d\n", num1 + num2);

        sc.close();
    }
}