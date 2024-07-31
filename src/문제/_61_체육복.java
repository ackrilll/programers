package 문제;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

/*문제 설명
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
입출력 예
n	lost	reserve	    return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	        4
3	[3]	    [1]	        2

발상
1. 전체 학생 수(n) - lost 학생 수 + lost 학생중 여벌 옷 받을 수 있는 학생 수  -> 리턴
2. 여벌 옷 받을 수 있는지 판단하는 알고리즘 필요
3. lost[0] 부터 차례로 -1 한 번호의 학생이 여분 옷 가지고 있는지 판단 있다면 reserve 에서 해당 학생 제외하고 lost 학생도 제외
 없다면 +1 한 번호의 학생이 여분 옷 가지고 있는지 판단 있다면 reserve에서 해당 학생 제외하고  lost 학생도 제외
4. 수정된 lost와 n의 차이를 리턴

타임라인
1. 입력받은 배열을 가변 리스트로 변환
import java.util.ArrayList;
import java.util.List;
List<Integer> 리스트변수 = new ArrayList<>(배열.length());

2. 리스트에 특정 숫자 있는지 확인하는 방법
리스트변수.contains(요소)

3. remove 메서드 사용시 인덱스 번호가 아닌 요소 지정하는 방법 -> Integer.valueOf(target) 로 인자 전달하기
4. 3,7,12,13,14,24 오답 ->"여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다" 해당 문장 재해석
5. lost와 reserve 겹치는 정수 있을 때 -> lost와 reserve에서 해당 학생 숫자 삭제하는 과정 중간에 추가
6. 13,14 문제 여전히 오답 -> n = 5 이고 lost = [4,2] reserve = [3,5] 일 때 기존 로직으로 는 4가 먼저 reserve의 3을 지워버리므로
lost의 2 번 학생이 보충을 받지 못하게 됨 따라서 lost와 reserve를 오름차순으로 정렬할 필요가 있음.
7.list 의 sort 메서드 ->
import java.util.Comparator;
lost_List.sort(Comparator.naturalOrder());
*/


class Solution61{
    public static int solution61(int n, int[] lost, int[] reserve){
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

public class _61_체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {4,2};
        int[] reserve = {3,5};
        int answer = Solution61.solution61(n,lost,reserve);
        System.out.println(answer);
    }
}
