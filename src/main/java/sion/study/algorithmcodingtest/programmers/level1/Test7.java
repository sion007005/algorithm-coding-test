package sion.study.algorithmcodingtest.programmers.level1;

import java.util.Scanner;

// 직사각형 별찍기
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i ++) {
            String star = "";
            for (int k = 1; k <= a; k++) {
                star += "*";
            }

            System.out.println(star);
        }
    }
}
