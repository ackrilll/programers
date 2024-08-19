class Solution{
    public static String solution(String phone_number){
        String answer = "";
        int length = phone_number.length(); // 휴대폰 전화번호(11자리)인지 집 전화(10자리)인지 모르기 때문에 뒤에서 슬라이싱을 해야함
        System.out.println(length);
        answer = phone_number.substring(length-4);
        for(int i = 0; i < length-4; i++ ){
            answer = '*' + answer;
        }
        return answer;
    }
}