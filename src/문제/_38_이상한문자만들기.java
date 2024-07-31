package 문제;
import java.util.Arrays;

/*문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

발상
1. String형 매개변수 -> String 리턴
2.매개변수 s 짝수번째만 모아 str1 생성
3.홀수 번째만 모아 str2 생성
4. str1을 대문자로 변환, str2를 소문자로 변환
5. answer에 두 문자열을 하나씩 넣어 만듬

타임라인
1.concat 매소드는 그자체로 변수를 갱신해주지 않는다
-> str2 = str2.concat(s.substring(i,i+1)); 이런식으로 갱신해줘야함
2. 문제 이해를 잘못하고 있었음 전체 인덱스를 홀짝으로 나누는게 아니라 단어별로 홀수 구별해서 변환해 줘야함
-> 한 단어씩 배열에 담도록 split 매소드 활용
3. 테스트 케이스 중 맨 마지막이 공백인 케이스에서 오류 발생
-> split 매소드에서 -1을 인자로 넣어 맨 마지막 공백까지 단어로 담아줘야 함

*/
class Solution38{
    public static String solution(String s){
        String answer = "";
        String [] arr = s.split(" ",-1); // 문장 맨 마지막 공백까지 단어로 취급
        System.out.println(Arrays.toString(arr));
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) { // 단어 선택
            String sel_word = arr[i]; // 선택된 단어 sel_word
            int length = sel_word.length();// 선택된 단어의 문자열 길이 length
            for (int j = 0; j < length; j++) {//선택된 단어의 인덱스 j
                if(j%2==0){//짝수번 째 문자열은 대문자로
                    answer = answer.concat(sel_word.substring(j,j+1).toUpperCase());
                }
                else{//홀수번 째 문자열은 소문자로
                    answer = answer.concat(sel_word.substring(j,j+1).toLowerCase());
                }
            }
            if(i == arr_length-1){
                break;
            }
            answer = answer.concat(" ");
        }
        return answer;
    }
}
public class _38_이상한문자만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        s = "disappeared aPpEaReD"; // "DiSaPpEaReD ApPeArEd"
        String answer = Solution38.solution(s);
        System.out.println(answer);
        System.out.println(answer.length());
    }
}
