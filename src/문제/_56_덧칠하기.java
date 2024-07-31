package 문제;
import java.util.*;
/*문제 설명
어느 학교에 페인트가 칠해진 길이가 n미터인 벽이 있습니다. 벽에 동아리 · 학회 홍보나 회사 채용 공고 포스터 등을 게시하기 위해 테이프로 붙였다가 철거할 때 떼는 일이 많고
그 과정에서 페인트가 벗겨지곤 합니다. 페인트가 벗겨진 벽이 보기 흉해져 학교는 벽에 페인트를 덧칠하기로 했습니다.

넓은 벽 전체에 페인트를 새로 칠하는 대신, 구역을 나누어 일부만 페인트를 새로 칠 함으로써 예산을 아끼려 합니다. 이를 위해 벽을 1미터 길이의 구역 n개로 나누고,
각 구역에 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙였습니다. 그리고 페인트를 다시 칠해야 할 구역들을 정했습니다.

벽에 페인트를 칠하는 롤러의 길이는 m미터이고, 롤러로 벽에 페인트를 한 번 칠하는 규칙은 다음과 같습니다.

롤러가 벽에서 벗어나면 안 됩니다.
구역의 일부분만 포함되도록 칠하면 안 됩니다.
즉, 롤러의 좌우측 끝을 구역의 경계선 혹은 벽의 좌우측 끝부분에 맞춘 후 롤러를 위아래로 움직이면서 벽을 칠합니다. 현재 페인트를 칠하는 구역들을 완전히 칠한 후 벽에서 롤러를 떼며,
이를 벽을 한 번 칠했다고 정의합니다.

한 구역에 페인트를 여러 번 칠해도 되고 다시 칠해야 할 구역이 아닌 곳에 페인트를 칠해도 되지만 다시 칠하기로 정한 구역은 적어도 한 번 페인트칠을 해야 합니다.
예산을 아끼기 위해 다시 칠할 구역을 정했듯 마찬가지로 롤러로 페인트칠을 하는 횟수를 최소화하려고 합니다.

정수 n, m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 매개변수로 주어질 때 롤러로 페인트칠해야 하는 최소 횟수를 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ m ≤ n ≤ 100,000
1 ≤ section의 길이 ≤ n
1 ≤ section의 원소 ≤ n
section의 원소는 페인트를 다시 칠해야 하는 구역의 번호입니다.
section에서 같은 원소가 두 번 이상 나타나지 않습니다.
section의 원소는 오름차순으로 정렬되어 있습니다.

입출력 예
n	m	section	        result
8	4	[2, 3, 6]	    2
5	4	[1, 3]	        1
4	1	[1, 2, 3, 4]	4

발상
1. int m,n int 배열 section -> int 리턴
2. section 가장 왼쪽 원소부터 하나씩 꺼내서 페인트 칠 ([1, 2, 3, 4] 이면 1꺼내서 1+m-1 까지 칠함
3. 처음 칠할 곳 -> section[0]가 시작되는 구역, 두번째 칠할 곳 -> 칠한 구역을 지우고 가장 먼저 칠해야할 곳 부터
4.
*/
class Solution56{
    public static int solution(int m, int n, int[] section){
        int count =0;
        List<Integer>section_list = new ArrayList<>();
        List<Integer>temp_list = new ArrayList<>();

        for (int i = 0; i < section.length; i++) {// 배열을 리스트에 복사
            section_list.add(section[i]);
        }
        boolean flag = true;
        while (flag) {
            int startSec = section_list.get(0); // 가장 왼쪽에 있는 원소
            int endSec = section_list.get(0) + m - 1; //붓 칠 한번할 때의 범위 끝
            for (int i = 0; i <section_list.size(); i++) {
                int target = section_list.get(i);
                if (startSec <= target && target <= endSec) {// 한 붓칠 범위 안에 있을때
                    temp_list.add(target);
                }
                else{ // 한 붓칠 범위 벗어날때 temp 리스트에 있는 원소들 section_list에서 삭제, temp 리스트 초기화, count 증가
                    for (int j = 0; j < temp_list.size(); j++) { // temp
                        for (int k = 0; k < section_list.size(); k++) {// section
                            if(temp_list.get(j).equals(section_list.get(i))){

                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
public class _56_덧칠하기 {
    public static void main(String[] args) {

    }
}
