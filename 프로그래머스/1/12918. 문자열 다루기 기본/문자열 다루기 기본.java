class Solution{
    public static boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if((length == 4)||(length==6)){// 매개변수 s의 크기가 4나 6이면 반복문 실행
            for (int i = 0; i < length; i++) {
                if (!(Character.isDigit(s.charAt(i)))) {// 숫자가 아니면
                    answer = false;
                }
            }
        }
        else{ // 매개변수 s의 크기가 4나 6이 아닌 사이즈 이면 answer->false
            answer = false;
        }
        return answer;
    }
}

