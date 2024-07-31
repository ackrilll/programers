package 문제;
import java.util.Arrays;
/*
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

발상:
1. 2차원 int 배열 매개변수 2개-> 2차원 int 배열 리턴
타임라인:
1. 2차원 배열의 선언 ->
int[][] array;
array =  new int[i][j]
2. 2차원 배열의 크기 ->
arr.length -> 2차원 배열 arr의 행의 갯수
arr[0].length -> 2차원 배열 arr의 칼럼 갯수
3. 2차원 배열의 출력 -> System.out.println(Arrays.deepToString(arr)



*/
class Solution34{
    public static int[][] solution(int[][] arr_a,int[][] arr_b){
        int[][] answer;
        answer = new int[arr_a.length][arr_a[0].length];// arr_a 와 똑같은 크기의 2차원 배열 생성
        for (int i = 0; i < answer.length; i++) { //행의 크기만큼 반복
            for (int j = 0; j <answer[0].length; j++) {// 열의 크기만큼 반복
                answer[i][j] = arr_a[i][j]+arr_b[i][j];
            }

        }
        return answer;
    }
}
public class _34_행렬의덧셈 {
    public static void main(String[] args) {
        int[][]arr_a = {{1,2},{2,3}};
        int[][]arr_b = {{3,4},{5,6}};
        int[][]answer = Solution34.solution(arr_a,arr_b);
        System.out.println(Arrays.deepToString(answer));
    }
}
