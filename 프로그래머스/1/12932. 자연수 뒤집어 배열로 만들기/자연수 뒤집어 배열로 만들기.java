class Solution {
    public static int[] solution(long n) {
        String new_n = String.valueOf(n); // n을 String 형으로 형변환
        int length = new_n.length(); // length 변수에 n의 크기 저장
        int[] answer = new int[length]; // n의 크기만큼의 배열 생성

        for (int i = 0; i < length; i++) {
            char c_num = new_n.charAt(length - (i + 1));
            answer[i] = Character.getNumericValue(c_num); // char 형의 원소를 int로 변환하여 배열에 넣기
        }

        return answer;
    }
}
