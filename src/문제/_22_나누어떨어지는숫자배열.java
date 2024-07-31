package 문제;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/*문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

발상:
1. divisor (int형) 과  배열 array(int형) 매개변수로 받아 배열 answer(int형) 을 반환하는 함수 작성
2. 배열 array를 오름차순으로 정렬
2. array의 원소를 하나씩 빼서 divisor로 나누어지면 answer에 하나씩 담기

타임라인
1. answer 배열 빈 배열로 선언하기 -> int [] answer = {};
2. 배열 array를 오름차순으로 정렬 -> import java.util.Arrays; 그리고 Arrays.sort(배열이름);
3. 선언했던 배열 크기가 작아 문제 발생 -> 리스트로 변환
4. 리스트 선언 ->
import java.util.List;
import java.util.ArrayList;
List<Integer> 리스트이름 = new ArrayList<Integer>();
5. 배열 그대로 출력하면 이상한 문자 나옴 ->
6. 리스트가 비었는지 확인 -> if (answer_list.isEmpty())
*/

class Solution22{
    public static int [] solution(int divisor,int [] array){
        int length = array.length;
        Arrays.sort(array);
        List<Integer> answer_list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0;i < length;i++ ){
            if(array[i] % divisor==0){
                answer_list.add(array[i]); // divisor로 나누어지는 원소는 리스트에 추가
            }
        }
        if (answer_list.isEmpty()){//리스트가 빈리스트인지 확인하여 빈 리스트라면 -1원소 추가
            answer_list.add(-1);
        }
        int [] answer = answer_list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

public class _22_나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int [] array = {3,2,6};
        int divisor = 10;
        int [] answer = Solution22.solution(divisor,array);
        System.out.println(Arrays.toString(answer));
    }
}
