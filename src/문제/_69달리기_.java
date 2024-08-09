package 문제;

import java.util.*;

/*\
문제 설명
얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다.
예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다.
즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.

제한사항
5 ≤ players의 길이 ≤ 50,000
players[i]는 i번째 선수의 이름을 의미합니다.
players의 원소들은 알파벳 소문자로만 이루어져 있습니다.
players에는 중복된 값이 들어가 있지 않습니다.
3 ≤ players[i]의 길이 ≤ 10
2 ≤ callings의 길이 ≤ 1,000,000
callings는 players의 원소들로만 이루어져 있습니다.
경주 진행중 1등인 선수의 이름은 불리지 않습니다.
입출력 예
players	                                callings	                    result
["mumu", "soe", "poe", "kai", "mine"]	["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]

타임라인
1. 최종 인덱스로 접근하면 겹치는 것이 생김 -> 계속 자리 갱신해줘야함
2. 런타임 에러 -> 해쉬맵 사용해보기
3. LinkedHashMap 에서 특정 키 값의 이전 키 값이 필요한 상황 발생 -> 밸류 값으로 이전 키값 알아내기
*/
class Solution69{
    public static String getPreKey(LinkedHashMap <String, Integer> LinkedHashMap,String key){
        String answer;
        int value = LinkedHashMap.get(key);
        int prevalue = value -1;

        LinkedHashMap.;

        return answer;
    }

    public static String[] solution(String[] players, String[] callings){
        String [] answer = new String[players.length];
        LinkedHashMap <String, Integer> playerHashMap = new LinkedHashMap<>();
        for (int i = 0; i < players.length; i++) { // 해쉬맵 채우기 (이름, 인덱스)
            String name = players[i];
            playerHashMap.put(name, i);
        }
        Deque<String> deque = new ArrayDeque<>();
        // callings 데크로 만들기
        for (String call : callings){
            deque.add(call);
        }
        for (int i = 0; i < deque.size(); i++) {
            String calledName = deque.poll();
            playerHashMap.replace(calledName,playerHashMap.get(calledName)-1);
            playerHashMap.replace(getK. ,);

        }



        // 인덱스 배열 만들기
        int[] indexArr = new int[players.length];
        for (int i = 0; i < players.length; i++) {
            indexArr[i] = i;
        }// 불려진 이름 index 값 -> 불려진 이름의 index 값
        for (String call : callings){
            int calledIdx = getIdx(players,call);
            indexArr[calledIdx]--;
            indexArr[calledIdx-1]++;
            // indexArr 에 각 단어의 인덱스가 저장되어 있음
            for (int i = 0; i < players.length; i++) {
                String target = players[i];
                answer[indexArr[i]] = target;}
            players = answer.clone(); // 배열 초기화
            for (int i = 0; i < players.length; i++) { // 인덱스 배열 초기화
                indexArr[i] = i;
            }
        }
        return answer;
    }

    public static int getIdx(String[] arr, String target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
public class _69달리기_ {
    public static void main(String[] args) {
        /*players	                                callings	                    result
         ["mumu", "soe", "poe", "kai", "mine"]	    ["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]*/
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] answer = Solution69.solution(players,callings);
        System.out.println(Arrays.deepToString(answer));
    }
}
