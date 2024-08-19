class Solution{
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