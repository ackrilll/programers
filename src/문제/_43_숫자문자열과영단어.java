package 문제;
/*
문제설명
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

숫자	영단어
0	zero
1	one
2	two
3	three
4	four
5	five
6	six
7	seven
8	eight
9	nine

제한사항
1 ≤ s의 길이 ≤ 50
s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.

입출력 예
s	                result
"one4seveneight"	1478
"23four5six7"	    234567
"2three45sixseven"	234567
"123"	            123

발상
1.String 매개변수 -> int 리턴
2. 배열에 문자 zero 부터 nine 까지 저장
3. s.replace 메소드 사용하여 숫자로 변환
4. 문자열"1478" 을 int로 변환하여 리턴
*/
class Solution43{
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

public class _43_숫자문자열과영단어 {
    public static void main(String[] args) {
        String s = "2three45sixseven";
        int answer = Solution43.solution(s);
        System.out.println(answer);
    }
}
