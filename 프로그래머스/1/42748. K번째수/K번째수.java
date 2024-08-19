import java.util.*;
class Solution{
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