import java.util.*;
class Solution{
    public static int[] solution(String s){
        int s_length = s.length();
        int[] answer = new int[s_length];
        List<String> tem_list = new ArrayList<>();
        for (int i = 0; i < s_length; i++) {
            String target = s.substring(i,i+1);// 작업 중인 글자
            if(!tem_list.contains(s.substring(i,i+1))){// 리스트에 글자 없을때
                answer[i] = -1;
            }
            else{// 리스트에 중복되는 알파벳 있을때
                int distance = i - tem_list.lastIndexOf(target);// 글자의 마지막 인덱스와 현재 글자의 거리
                answer[i] = distance;
            }
            tem_list.add(target);// 리스트에 한글자씩 담음
        }
        return answer;
    }
}