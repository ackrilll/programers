package 문제;
/*문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

발상:
1. String 매개변수 -> String 리턴
2. 글자수 세어 홀수 or 짝수 판별
3. 홀수라면 (매개변수글자수) / 2 번째 인덱스
4. 짝수라면 (매개변수글자수) /2 -1,  (매개변수글자수) /2 번째 인덱스
5. 인덱스와 Stirng변수.substirng()으로 슬라이싱
*/
class Solution27{
    public static String solution(String str){
        String answer = "";
        int str_length = str.length();
        int index = str_length/2;
        if(str_length % 2 == 0){ // 매개변수 글자수 짝수일때
            answer = str.substring(index-1,index+1);
        }
        else{
            answer = str.substring(index,index+1);
        }
        return answer;
    }
}
public class _27_가운데글자가져오기 {
    public static void main(String[] args) {
        String str = "사랑";
        String answer = Solution27.solution(str);
        System.out.println(answer);
    }
}
