import java.util.*;
class Solution{
    public static int[] solution(int k, int[] score){
        List<Integer> list = new ArrayList<>();
        int score_length = score.length;
        int[] answer = new int[score_length];
        for (int i = 0; i < score_length; i++) {
            list.add(score[i]); // score 배열에서 하나씩 가져옴
            Collections.sort(list);// list 정렬
            if(list.size()<=k){// 리스트 크기가 아직 k개 이하일때 -> 전부 명예의 전당에 올라가므로 정렬된 리스트에서 인덱스가 0인 원소가 배열에 추가됨
                answer[i] = list.get(0);
            }
            else{// 리스트 크기가 k보다 커질때는 리스트에서 인덱스가 (리스트 크기 -k) 인 원소가 배열에 추가됨
                answer[i] = list.get(list.size()-k);
            }
        }
        return answer;
    }
}