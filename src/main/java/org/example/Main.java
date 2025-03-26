package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //정수로된 변수 n을 사용자가 입력해서 받아옴
    int m = sc.nextInt(); //정수로된 변수 m을 사용자가 입력해서 받아옴
    for (int i = 0; i < m; i++) {// 반복문을 세로줄인m을 입력받은 수까지 돌음
        for (int j = 0; j <n-1; j++) { //가로줄 n을 입력받은 값 n 까지 돌고 m때문에 하나가 입력되어있으므로 1을 빼줌
            System.out.print("*"); // *출력
        }
        System.out.println("*"); // *출력
    }

    }
}
