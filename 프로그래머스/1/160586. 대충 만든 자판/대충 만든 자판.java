import java.util.Arrays;
class Solution{
    public static int [] solution(String[] keymap, String[] targets){
        int[] answer = new int[targets.length];
        int[] index = new int[keymap.length]; // key 맵 요소들에 대한 최단 인덱스
        for (int i = 0; i < targets.length; i++) {// targets 배열 요소 순회
            answer[i] = 0;
            for (int j = 0; j < targets[i].length(); j++) {// targets 요소의 글자 순회
                String s = targets[i].substring(j,j+1);
                for (int k = 0; k < keymap.length; k++) { // keymap 요소 하나씩 순회하며 index 배열 갱신
                    index[k] = keymap[k].indexOf(s);
                }
                Arrays.sort(index); // index 정렬 이때 -1이 있다면 맨 앞으로 옴
                int fast_index = -1;
                for (int k = 0; k < index.length; k++) { //정렬되어있는 index 배열 순회 -1 요소가 아닌 것 찾기 못찾으면 fast_index는 여전히 -1
                    if(index[k] != -1){
                        fast_index = index[k];
                        break;
                    }
                }
                if(fast_index == -1){// fast_index가 -1인 것은 해당 알파벳을 입력할수 없다는 의미 -> 다음 targets 요소로 넘어가야 함
                    answer[i] = -1;
                    break;
                }else {// fast_index가 -1이 아니라는 것은 fast_index 가장 적게 눌러서 알파벳을 칠 수 있고 해당 숫자는 누르는 횟수를 의미 -> 다 더해서 answer[i]에 남겨야함
                    answer[i] += fast_index+1;
                }

            }
        }
        return answer;
    }
}