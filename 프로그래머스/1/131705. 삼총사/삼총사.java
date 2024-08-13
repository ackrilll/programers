class Solution{
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