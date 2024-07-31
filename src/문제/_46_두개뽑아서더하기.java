package 문제;
import java.util.*;
/*
문제 설명
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.

입출력 예
numbers 	result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]

발상
1.배열 매개변수 -> 배열
2.배열에서 2개 뽑아 더하여 리스트에 존재하지 않는 원소라면 추가
3.리스트를 배열로 변환

타임라인
1. 리스트 내 특정 원소가 있는지 찾는 메소드 contain
*/
class Solution46{
    public static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) {//리스트 만드는 반복문
            for (int j = i+1; j < arr_length; j++) {
                int new_elmt = arr[i] + arr[j];
                if(!list.contains(new_elmt)){
                    list.add(new_elmt);
                }
            }
        }

        int answer_length = list.size();
        int[] answer = new int[answer_length];
        for (int i = 0; i < answer_length; i++) {// 리스트를 배열로 바꾸는 반복문
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);// 배열 정렬
        return answer;
        }
    }

public class _46_두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        int[] answer = Solution46.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
