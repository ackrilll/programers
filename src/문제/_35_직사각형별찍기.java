package 문제;

import java.util.Scanner;

/*
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.

발상:
1. int형 매개변수 2개 -> String 리턴
2. for문 활용

타임라인:
1. 사용자에게 n,m을 입력받는 표준입력 문제로 스캐너 활용
2. 스캐너 사용 방법
2-1) 스캐너 객체 생성 -> Scanner sc = new Scanner(System.in); // Scanner 객체 생성
2-2) 입력받을 변수 생성 -> int a = sc.nextInt();
*/
class Solution35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class _35_직사각형별찍기 {
    public static void main(String[] args) {
    }
}
