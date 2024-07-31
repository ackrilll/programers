package 문제;

import java.util.Arrays;

/*
문제 설명
휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다. 키 하나에 여러 문자가 할당된 경우,
동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.

예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A", 두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.

같은 규칙을 적용해 아무렇게나 만든 휴대폰 자판이 있습니다. 이 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있으며, 특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열되어 있습니다.
또, 같은 문자가 자판 전체에 여러 번 할당된 경우도 있고, 키 하나에 같은 문자가 여러 번 할당된 경우도 있습니다. 심지어 아예 할당되지 않은 경우도 있습니다.
따라서 몇몇 문자열은 작성할 수 없을 수도 있습니다.

이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.

1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때,
각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.

단, 목표 문자열을 작성할 수 없을 때는 -1을 저장합니다.

제한사항
1 ≤ keymap의 길이 ≤ 100
1 ≤ keymap의 원소의 길이 ≤ 100
keymap[i]는 i + 1번 키를 눌렀을 때 순서대로 바뀌는 문자를 의미합니다.
예를 들어 keymap[0] = "ABACD" 인 경우 1번 키를 한 번 누르면 A, 두 번 누르면 B, 세 번 누르면 A 가 됩니다.
keymap의 원소의 길이는 서로 다를 수 있습니다.
keymap의 원소는 알파벳 대문자로만 이루어져 있습니다.
1 ≤ targets의 길이 ≤ 100
1 ≤ targets의 원소의 길이 ≤ 100
targets의 원소는 알파벳 대문자로만 이루어져 있습니다.

입출력 예
keymap	            targets	        result
["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
["AA"]	            ["B"]	        [-1]
["AGZ", "BSSS"]	    ["ASA","BGZ"]	[4, 6]

발상
1. targets 원소 하나씩 꺼내서 ("ABCD") 슬라이싱 ('A','B','C','D')
2.슬라이싱 된 요소들 이 keymap 요소들의 몇 번 째 인덱스에 있는지 파악 하여 최솟값을 가지는 인덱스를 가져와 sum을 함
*/
class Solution63{
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

public class _63_대충만든자판 {
    public static void main(String[] args) {
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA","BGZ"};
        int[] answer = Solution63.solution(keymap,targets);
        System.out.println(Arrays.toString(answer));
    }
}
