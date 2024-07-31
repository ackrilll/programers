package 문제;
import java.util.*;
/*
문제 설명
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
입출력 예
array	                commands	                        return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

발상
1. 1차원 배열, 2차원 배열 매개변수 -> 1차원 배열 리턴
2. commands에서 [[2, 5, 3], [4, 4, 1], [1, 7, 3]] -> 크기는 5-2+1, 4-4+1, 7-1+1 인 1차원 배열 commands.length개 생성
3. for문 사용하여 각 배열 채워넣고 정렬
4. commands의 각 행의 마지막 원소로 값 뽑아 리턴 배열에 담기

*/

class Solution45{
    public static int[] solution(int[] array, int[][] commands){
        int length = commands.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {// 행 갯수만큼 반복
            int[] arr = new int[commands[i][1]-commands[i][0]+1];// commands 연산에 따라 생성되는 배열
            for (int j = 0; j < arr.length; j++) {// commands 연산에 따라 배열에 원소 추가
                int strat_idx = commands[i][0]-1;
                arr[j] = array[strat_idx+j];//
            }
            Arrays.sort(arr);// arr 정렬
            int sel_idx = commands[i][2] -1;
            answer[i] = arr[sel_idx];
        }

        return answer;
    }
}
public class _45_k번째수정렬 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = Solution45.solution(array,commands);
        System.out.println(Arrays.toString(answer));
    }
}
