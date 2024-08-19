import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
class Solution{
    public static int solution(int n, int[] lost, int[] reserve){
        int answer =0;
        List<Integer> lost_List = new ArrayList<>(lost.length);
        for (int i = 0; i < lost.length; i++) {
            lost_List.add(lost[i]);
        }
        List<Integer> reserve_List = new ArrayList<>(reserve.length);
        for (int i = 0; i < reserve.length; i++) {
            reserve_List.add(reserve[i]);
        }
        List<Integer> same_List = new ArrayList<>();

        // lost_List와 reserve_List 중복되는 요소 삭제하기
        for (int i = 0; i < lost_List.size(); i++) {
            for (int j = 0; j < reserve_List.size(); j++) {
                if(lost_List.get(i).equals(reserve_List.get(j))){
                    same_List.add((lost_List.get(i)));
                }
            }
        }
        for (int i = 0; i < same_List.size(); i++) {
            lost_List.remove(same_List.get(i));
            reserve_List.remove(same_List.get(i));
        }
        lost_List.sort(Comparator.naturalOrder());
        reserve_List.sort(Comparator.naturalOrder());

        
        for (int i = 0; i < lost_List.size(); i++) {// lost_List 갱신하는 반복문
            int target = lost_List.get(i); // 최종 갱신될 lost_List에 target 숫자가 남아 있을지 판단해야함
            if( reserve_List.contains(target-1)){// 여분 옷 가진 학생번호가 lost 학생 -1 이라면 빌려줄수 있으므로 두 학생은 lost_List와 reserve_List에서 제외
                lost_List.remove(Integer.valueOf(target));
                reserve_List.remove(Integer.valueOf(target-1));
                i-=1;
            } else if (reserve_List.contains(target+1)) {// 여분 옷 가진 학생번호가 lost 학생+1 이라면 마찬가지로 두 학생은 각 리스트에서 제외
                lost_List.remove(Integer.valueOf(target));
                reserve_List.remove(Integer.valueOf(target+1));
                i-=1;
            }
        }
        System.out.println(lost_List);
        answer = n - lost_List.size();
        return answer;
    }
}