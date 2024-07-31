package 문제;
/*
문제 설명
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록
 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

제한사항
3 ≤ n ≤ 1,000,000

발상
매개변수n을 입력받으면 for문을 사용하여 i = 2일 때 부터
n % i != 1 라면 반복적으로 i를 1씩 증가,
n % i ==1 일 때 answer = i 하고 answer 반환
*/


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Solution12 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2;; i++){
            if (n % i ==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
public class _12_나머지가1되는수찾기 {
    public static void main(String[] args) {
        int n = 10;
        int answer = Solution12.solution(n);
        System.out.println(answer);
    }
}
