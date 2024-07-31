package 문제;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

/*
문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건

2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

입출력 예
a	b	result
5	24	"TUE"

발상:
1. int 매개변수 a,b -> String 리턴
2.  윤년 -> 2월 이 28일 까지가 아닌 29까지 있는 년도
3. 2016년 1월 1일 금요일 기준으로 a월 b일 까지의 날짜 차이 계산하는 알고리즘 짜기 -> 날짜 차이 n일
4. n일을 7로 나눈 나머지에 따라 요일 결정
5. switch case문 작성
*/
class Solution51{
    public static String solution(int a, int b){
        String answer = "";
        int n = 0; // 날짜 차이
        switch (a){
            case 1:
            n = b-1;
            break;
            case 2:
            n = 31 + b-1;
            break;
            case 3:
            n = 31 +29+ b-1;
            break;
            case 4:
            n = 31 +29+31+ b-1;
            break;
            case 5:
            n = 31 +29+31+30+ b-1;
            break;
            case 6:
            n = 31 +29+31+30+31+ b-1;
            break;
            case 7:
            n = 31 +29+31+30+31+30+ b-1;
            break;
            case 8:
            n = 31 +29+31+30+31+30+ 31+b-1;
            break;
            case 9:
            n = 31 +29+31+30+31+30+ 31+31+b-1;
            break;
            case 10:
            n = 31 +29+31+30+31+30+31 +31+30+b-1;
            break;
            case 11:
            n = 31 +29+31+30+31+30+31 +31+30+31+b-1;
            break;
            case 12:
            n = 31 +29+31+30+31+30+31 +31+30+31+30+b-1;
            break;
        }
        int distance = n % 7;
        switch (distance){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        return answer;
    }
}
public class _51_2016년 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer = Solution51.solution(a,b);
        System.out.println(answer);
    }
}
