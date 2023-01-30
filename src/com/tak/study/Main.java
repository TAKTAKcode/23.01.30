package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력할 갯수
        int a = sc.nextInt();

        //입력할 갯수를 담은 배열
        int arr[] = new int[a];

        //비교할 숫자
        int b = sc.nextInt();

        //a횟수만큼 숫자 입력
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        //a횟수만큼 반복하며 숫자 판별
        for (int i = 0; i < a; i++) {

            //입력한 숫자보다 작은 수
            if (arr[i] < b) {
                System.out.print(arr[i] + " ");
            }

        }

    }

}
