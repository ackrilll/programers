package 문제;
import java.util.*;
import java.util.stream.Collectors;
/*
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

입출력 예
strings	                    n	        return
["sun", "bed", "car"]	    1	        ["car", "bed", "sun"]
["abce", "abcd", "cdx"]	    2	        ["abcd", "abce", "cdx"]

발상
1. String 배열, int 매개변수 -> String형 배열 반환
2. n에 따라 인덱싱한 알파벳을 리스트업
3. 리스트 정렬 및 중복 제거
4. 리스트에 있는 알파벳 순서대로 배열에 있는 단어의 n 위치에 있는지 확인하고 있으면 정렬된 기준으로 가장 뒤에 재배치

타임라인
1. 빈 리스트 생성 -> List<String>list = new ArrayList<>();
2. 리스트 내 중복원소 제거 -> List<String> newList = list변수.stream().distinct().collect(Collectors.toList());
3. 리스트 정렬-> Collections.sort(리스트변수);
4. 인덱싱 했을때 같은 알파벳 존재하는 다른 단어의 경우 ->예시) "abce", "abcd" 사전 순서로 배치 하여 "abcd", "abce"
5. 이중리스트 만들어서 접근 -> List<List<String>> myList = new ArrayList<>();

*/
class Solution44{
    public static String[] solution(String[] strings,int n){
        List<String>alpha_list = alpha_listup(strings,n);//알파벳 정렬해서 담고 중복 제거하서 리스트로 반환해주는 메소드
        List<List<String>> myList = new ArrayList<>(); //이중 리스트 생성
        int alpha_length = alpha_list.size();
        int strings_length = strings.length;
        for (int i = 0; i < alpha_length; i++) { // 리스트업 된 알파벳 갯수만큼 반복
            List<String> innerList = new ArrayList<>(); // 새로운 리스트 생성
            for (int j = 0; j < strings_length; j++) {// 매개변수 배열의 크기만큼 반복
                if(alpha_list.get(i).equals(strings[j].substring(n,n+1))){
                    innerList.add(strings[j]);
                }
            }
            Collections.sort(innerList); // innerList 정렬
            myList.add(innerList);
            innerList = null;
        }
        String[] answer = ListToArr(myList);

        return answer;
    }

    public static List<String> alpha_listup(String[] strings,int n){// String 배열과 인덱스 받아서 해당 위치의 알파벳 담고 정렬 및 중복 제거하는 메소드
        List<String> alpha_list = new ArrayList<>();
        String target = "";
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            target = strings[i].substring(n,n+1); // 알파벳 target에 담기
            alpha_list.add(target);//리스트에 담기
        }
        List<String> newalpha_list = alpha_list.stream().distinct().collect(Collectors.toList());// 중복 제거
        Collections.sort(newalpha_list);// 알파벳 정렬
        return newalpha_list;
    }

    public static String[] ListToArr(List<List<String>> mul_list) {//이중리스트 매개변수로 받아 1차원 배열로 반환해주는 메소드
        int row = mul_list.size();// 이중 리스트 행의 갯수
        int count = 0;
        for (int i = 0; i < row; i++) {
            int col = mul_list.get(i).size();// i행의 칼럼 수
            for (int j = 0; j < col; j++) {
                count++;
            }
        }
        String[] arr = new String[count];
        count = 0;
        for (int i = 0; i < row; i++) {
            int col = mul_list.get(i).size();// i행의 칼럼 수
            for (int j = 0; j < col; j++) {
                arr[count] = mul_list.get(i).get(j);
                count++;
            }
        }
        return arr;
    }
}
public class _44_문자열마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = new String[]{"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = Solution44.solution(strings,n);
        System.out.println(Arrays.toString(answer));
    }
}
