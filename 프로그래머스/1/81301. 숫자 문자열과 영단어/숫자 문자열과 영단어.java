class Solution{
    public static int solution(String s){
        int answer = 0;
        String[] str_arr = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] int_arr = new String[]{"0","1","2","3","4","5","6","7","8","9"};
        for (int i = 0; i < 10; i++) {//매개변수 s에 영문을 숫자 문자열로 바꾸어줌
            s = s.replace(str_arr[i],int_arr[i]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}