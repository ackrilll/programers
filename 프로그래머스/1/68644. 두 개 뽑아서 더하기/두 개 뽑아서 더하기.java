import java.util.*;
class Solution{
    public static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) {//리스트 만드는 반복문
            for (int j = i+1; j < arr_length; j++) {
                int new_elmt = arr[i] + arr[j];
                if(!list.contains(new_elmt)){
                    list.add(new_elmt);
                }
            }
        }

        int answer_length = list.size();
        int[] answer = new int[answer_length];
        for (int i = 0; i < answer_length; i++) {// 리스트를 배열로 바꾸는 반복문
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);// 배열 정렬
        return answer;
        }
    }