package 문제;
import java.util.*;
/*
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,// 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, //3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]

발상
1. int형 배열 -> int형 배열 리턴
2. 세 사람 배열 만들기
3. 두 배열 비교하여 같은 인덱스에 같은 원소가 몇개 있는지 세어 해당 갯수를 리턴하는 메소드 작성
4. 세 사람의 점수를 비교해서 가장 점수 높은사람 번호 배열에 담음
*/
class Solution54{
    public static int scoreMethod(int[] a,int[] answers){ // 학생이 제출한 답지와 정답지 배열을 매개변수로 받아 몇 개 맞았는지 리턴하는 메소드
        int score = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == answers[i]){
                score++;
            }
        }
        return score;
    }

    public static int[] Compare(int[] allScores){
        int max_num = 0;
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < allScores.length; i++) {
            if(max_num < allScores[i]){
                max_num = allScores[i];
            }
        }
        for (int i = 0; i < allScores.length; i++) {
            if(max_num == allScores[i]){
                list.add(i+1);
            }
        }
        int[] bestStusents = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bestStusents[i] = list.get(i);
        }
        return bestStusents;
    }

    public static int[] solution(int[] answers){
        int[] a = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            int answer_a = i%5+1;
            a[i] = answer_a;
        }
        int[] b = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            int answer_b = 2;
            int itter_idx = i % 8;
            switch (itter_idx){
                case 1:
                    answer_b = 1;
                    break;
                case 3:
                    answer_b = 3;
                    break;

                case 5:
                    answer_b = 4;
                    break;

                case 7:
                    answer_b = 5;
                    break;

            }
            b[i] = answer_b;
        }
        int[] c = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            int answer_c = 0;
            int itter_idx = i % 10;
            switch (itter_idx){
                case 0:
                case 1:
                    answer_c = 3;
                    break;

                case 2:
                case 3:
                    answer_c = 1;
                    break;

                case 4:
                case 5:
                    answer_c = 2;
                    break;

                case 6:
                case 7:
                    answer_c = 4;
                    break;

                case 8:
                case 9:
                    answer_c = 5;
                    break;

            }
            c[i] = answer_c;
        }
        int score_a  = scoreMethod(a,answers);
        int score_b  = scoreMethod(b,answers);
        int score_c  = scoreMethod(c,answers);
        int[] allScores = new int[]{score_a,score_b,score_c};
        int[] answer = Compare(allScores);
        return answer;
    }
}
public class _54_모의고사 {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int[] answer = Solution54.solution(answers);
        System.out.println(Arrays.toString(answer));
    }
}
