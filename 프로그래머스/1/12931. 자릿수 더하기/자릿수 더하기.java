class Solution {
    public static int solution(int N) {
        String string_n = String.valueOf(N);
        int answer = 0;
        int length = string_n.length(); //4자리수 정수이면 length는 4
        int number =0;
        int sum =0;
        for (int i =0 ; i <length ; i++){ //string_n[0]~string_n[3]까지 반복
            String S_number = string_n.substring(i,i+1);
            number = Integer.parseInt(S_number);
            sum += number;
        }
        answer = sum;
        return answer;
    }
}