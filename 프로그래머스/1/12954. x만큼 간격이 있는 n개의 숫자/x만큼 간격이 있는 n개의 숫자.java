import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/*
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아,
x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.

발상
x=2, n = 5일 때 리턴해야하는 리스트는 [2,4,6,8,10]
2*1 ~ 2*5 까지의 원소를 가진 리스트이다.
*/
class Solution{
    public static List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>(); // 결과를 저장할 리스트
        for(int i = 1; i <= n; i++){
            answer.add((long)x*i);  // 배열 answer에 x부터 x*n 까지 삽입
        }

        return answer;
    }
}