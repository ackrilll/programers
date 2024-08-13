import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution{
    public static int[] solution(String[] wallpaper){
        int[] answer = new int[4];
        ArrayList<Integer>leftRight = new ArrayList<>();
        ArrayList<Integer>upDown = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) { // 행 순회
            String target = wallpaper[i];
            if(target.contains("#")){
                upDown.add(i);
                leftRight.add(target.indexOf("#"));
                leftRight.add(target.lastIndexOf("#"));

            }
        }
        Collections.sort(leftRight);
        Collections.sort(upDown);
        answer[0] = upDown.get(0);
        answer[1] = leftRight.get(0);
        answer[2] = upDown.get(upDown.size()-1)+1;
        answer[3] = leftRight.get(leftRight.size()-1)+1;


        return answer;
    }
}