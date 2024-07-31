package 문제;

import java.util.ArrayList;


/*
문제 설명
두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.

문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
skip에 있는 알파벳은 제외하고 건너뜁니다.
예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만 [b, c, d, e, f]에서 'b'와 'd'는 skip에
포함되므로 세지 않습니다. 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다.
나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.

두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.

제한사항
5 ≤ s의 길이 ≤ 50
        1 ≤ skip의 길이 ≤ 10
s와 skip은 알파벳 소문자로만 이루어져 있습니다.
skip에 포함되는 알파벳은 s에 포함되지 않습니다.
        1 ≤ index ≤ 20
입출력 예
s	        skip	    index	    result
"aukks"	    "wbqd"	    5	        "happy"

발상
1. s와 skip을 char 배열로 만들기 str.toChararray
2. 이중 반복문으로 s+5 한 아스키 코드값이 skip 배열에 있는지 확인하여 있다면 빼고 새로운 배열 만듦
3. 새로운 char 배열을 string으로 변환 String 생성자 활용

타임라인
1. 알파벳 소문자 아스키코드 번호 : 97 ~ 122
2. 문제 이해 잘못함 -> target 마다 skip 되는 수 몇 가지인지 카운팅 하는 로직 필요
*/
class Solution64{
    public static String solution(String s, String skip, int index){
        StringBuilder answer = new StringBuilder();
        String answer_str;
        char[] s_char = s.toCharArray();
        char[] skip_char = skip.toCharArray();
        ArrayList<Character>skip_List = new ArrayList<>();
        for (int i = 0; i < skip_char.length; i++) {
            skip_List.add(skip_char[i]);
        }
        ArrayList<Integer>Ascii_List = new ArrayList<>(); // char로 바꿀 int 모아둔 리스트 해당리스트로 answer 뽑아냄
        for (int i = 0; i < s_char.length; i++) {
            char target = s_char[i];
            for (int j = 0; j < index; j++) {// target을 1씩 5번 더함 이때 해당 요소가 skip_char에 있는지 확인해서 있다면 j-=1
                target++;
                if(target == 123){
                    target ='a';
                }
                if(skip_List.contains(target)){
                    j--;
                }
            }
            Ascii_List.add((int)target);
        }
        for(int c : Ascii_List){
            answer.append((char)c);
        }

        answer_str = answer.toString();
        return answer_str;
    }
}

public class _64_둘만의암호 {
    public static void main(String[] args) {
        String s = "zzzzz";
        String skip = "a";
        int index = 1;
        String answer = Solution64.solution(s,skip,index);
        System.out.println(answer);
    }
}
