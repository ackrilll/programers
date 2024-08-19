class Solution{
    public static int solution(int [][]size){
        int answer =0;
        int [] short_arr = new int[size.length];
        int [] long_arr = new int[size.length];
        for (int i = 0; i < size.length; i++) {// 각 카드별로 긴 변, 짧은 변 나누어 줌
            if(size[i][0]<=size[i][1]){
                short_arr[i] = size[i][0];
                long_arr[i] = size[i][1];
            }
            else{
                short_arr[i] = size[i][1];
                long_arr[i] = size[i][0];
            }
        }// 카드 별 가로 세로 대소관계 구분 완료. 아래 부터는 긴 변 배열과 짧은 별 배열에서 각각 최댓값 뽑아내는 과정
        int max_short = MaxintInArr(short_arr);
        int max_long = MaxintInArr(long_arr);
        answer = max_long * max_short;

        return answer;
    }

    public static int MaxintInArr(int [] arr){// int 형 배열 받아 최댓값 리턴해주는 매소드
        int length = arr.length;
        int maxint =arr[0];
        for (int i = 0; i < length; i++) {
            if(arr[i]>=maxint){
                maxint = arr[i];
            }
        }
        return maxint;
    }
}