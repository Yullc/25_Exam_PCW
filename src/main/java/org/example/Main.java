package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수로된 변수 n을 사용자가 입력
        int m = 1; // 정수 m변수에 1을 넣음
        for (int i = n; i > 0; i--) { //for문을 도는데 i=n부터 1씩 감소도되록 설정
            for (int j = 0; j < n - i; j++) { // j는 0부터 n-i까지 즉 사용자가 입력한 값에서 n-1..n-2..n-3..씩 빼면서 빈 공간을 출력
                System.out.print(" ");
            }
            for (int k = n; k - m >= 0; k--) { // k는 n부터 반복문을 도는데 사용자가 입력한 값 -m만큼돌음 그러면 처음에는 4 두번째는 3...
                System.out.print(k - (m - 1) + " ");// k에서 m-1을 뺌 처음에는 k-2-1 , k-3-1 k-4-1 이런식으로 m이 증가되면서 빈공간을 출력
            }
            System.out.println(); // 줄바꿈
            m++; // m은 1씩 증가
        }
    }
}

