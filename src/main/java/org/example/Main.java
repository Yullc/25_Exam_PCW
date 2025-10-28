package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[12]; //길이가 12인 배열 객체 생성 왜냐하면 피보나치를 계산할 때 현재자릿수에서 +2한 자리까지 더해서 구할 생각이기 떄문이다.
        arr[0]=0; // 초기값으로 0번째 배열에 0을 넣고
        arr[1] =1;// 초기값으로 1번째 배열에 1을 넣음

        for(int i=0; i<arr.length-2; i++){ // for문으로 arr배열길이의 -2 만큼 배열을 돈다. 왜냐하면 출력되야 하는 배열의 길이는 10이므로 -2를 해준다
            arr[i+2] = arr[i]+arr[i+1]; // 그러면 현재 자리에서 2칸 증가된 값을 구하는 방법은 현재의 자리값과 다음 자리값을 더한값이 +2가 된 자리값이다.
            System.out.print(" "+arr[i]);// 현재 자리값 출력
            System.out.print(" "+arr[i]);// 현재 자리값 출력
        }
    }
}

