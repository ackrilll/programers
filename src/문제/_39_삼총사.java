package 문제;
/*
문제 설명
한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다.
이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다. 예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때
, 첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다.
또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다.
따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.

한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.

제한사항
3 ≤ number의 길이 ≤ 13
-1,000 ≤ number의 각 원소 ≤ 1,000
서로 다른 학생의 정수 번호가 같을 수 있습니다.

발상:
1.int형 배열 매개변수 -> int 리턴
2.갤탭 메모 참고, 3중 for문
*/
class Solution39{
    public static int solution(int[]arr){
        int answer = 0;
        int length = arr.length; // 학생들의 수
        int count = 0; // 삼총사가 되는 경우의 수 카운터
        for (int i = 0; i < length; i++) {// 첫번째 뽑을 학생
            for (int j = i+1; j < length; j++) {//두번째 뽑을 학생
                for (int k = j+1; k < length; k++) {//세번째 뽑을 학생
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("삼총사: "+arr[i]+","+arr[j]+","+arr[k]);
                        count ++;
                    }
                }
            }
        }
        answer = count;
        return answer;
    }
}
public class _39_삼총사 {
    public static void main(String[] args) {
        int [] arr1 = {-2, 3, 0, 2, -5}; //2
        int [] arr2 = {-3, -2, -1, 0, 1, 2, 3};//5
        int [] arr3 = {-1, 1, -1, 1};//0
        int answer = Solution39.solution(arr1);
        System.out.println(answer);
    }
}
