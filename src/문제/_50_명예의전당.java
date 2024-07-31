package 문제;
import java.util.*;
/*
문제
명예의 전당에 오를 수 있는 기록은 k개, 하루에 한 명의 가수가 점수를 받음
명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때,
매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.

제한사항
3 ≤ k ≤ 100
7 ≤ score의 길이 ≤ 1,000
0 ≤ score[i] ≤ 2,000

입출력 예
k	score	                                        result
3	[10, 100, 20, 150, 1, 100, 200]	                [10, 10, 10, 20, 20, 100, 100]
4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]

발상
1. int 매개변수 k, int 배열 매개변수 score -> int형 배열
2. score 원소를 앞에서 하나씩 가져와 추가하고 정렬하는 리스트 작성 -> idx k-1까지는 정렬된 리스트의 0번 인덱스의 원소를 score 크기와 같은 배열에 담음
3. idx k 부터는 정렬된 리스트에서 인덱스 번호가 (리스트크기 - 3) 인 원소가 배열에 추가됨
*/

class Solution50{
    public static int[] solution(int k, int[] score){
        List<Integer> list = new ArrayList<>();
        int score_length = score.length;
        int[] answer = new int[score_length];
        for (int i = 0; i < score_length; i++) {
            list.add(score[i]); // score 배열에서 하나씩 가져옴
            Collections.sort(list);// list 정렬
            if(list.size()<=k){// 리스트 크기가 아직 k개 이하일때 -> 전부 명예의 전당에 올라가므로 정렬된 리스트에서 인덱스가 0인 원소가 배열에 추가됨
                answer[i] = list.get(0);
            }
            else{// 리스트 크기가 k보다 커질때는 리스트에서 인덱스가 (리스트 크기 -k) 인 원소가 배열에 추가됨
                answer[i] = list.get(list.size()-k);
            }
        }
        return answer;
    }
}
public class _50_명예의전당 {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] answer = Solution50.solution(k,score);
        System.out.println(Arrays.toString(answer));
    }
}
