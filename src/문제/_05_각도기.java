package 문제;
/*
문제설명:각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각
180도는 평각으로 분류합니다. 각 angle이 매개변수로 주어질 때 예각일 때 1,
직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.

제한사항:
1. 0 < angle ≤ 180
2. angle은 정수입니다.

발상: 정수형 매개변수를 입력받아 90도 보다 작을 때, 90도일때 둘 다 아니고 180보다 작을때,
세 조건 모두 아닌 180도 일 때로 나누어 각각 1,2,3,4 를 리턴하도록 함수 작성
*/

class Solution5 {
    public static int solution(int angle) {
        int answer =0;
        if (angle < 90){
            answer = 1;
        }
        else if (angle ==90){
            answer = 2;
        }
        else if(angle <180){
            answer = 3;
        }
        else{
            answer =4;
        }
        return answer;
    }
}

public class _05_각도기 {
    public static void main(String[] args) {
        int angle = 87;
        int answer = Solution5.solution(angle);
        System.out.println(answer);
    }
}
