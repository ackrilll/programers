import java.util.ArrayList;

class Solution{
    public static String solution(String s, String skip, int index){
        StringBuilder answer = new StringBuilder();
        String answer_str;
        char[] s_char = s.toCharArray();
        char[] skip_char = skip.toCharArray();
        ArrayList<Character>skip_List = new ArrayList<>();
        for (int i = 0; i < skip_char.length; i++) {
            skip_List.add(skip_char[i]);
        }
        ArrayList<Integer>Ascii_List = new ArrayList<>(); // char로 바꿀 int 모아둔 리스트 해당리스트로 answer 뽑아냄
        for (int i = 0; i < s_char.length; i++) {
            char target = s_char[i];
            for (int j = 0; j < index; j++) {// target을 1씩 5번 더함 이때 해당 요소가 skip_char에 있는지 확인해서 있다면 j-=1
                target++;
                if(target == 123){
                    target ='a';
                }
                if(skip_List.contains(target)){
                    j--;
                }
            }
            Ascii_List.add((int)target);
        }
        for(int c : Ascii_List){
            answer.append((char)c);
        }

        answer_str = answer.toString();
        return answer_str;
    }
}