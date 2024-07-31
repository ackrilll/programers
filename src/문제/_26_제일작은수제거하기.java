package 문제;
import java.util.*;
/*문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

발상:
1. int 형 배열을 매개변수로 받아 int형 배열을 리턴하는 함수작성
2. 배열의 크기를 length에 담아 length가 1이면 배열 [-1] 반환
3. 배열의 크기가 1이 아니라면 for문을 통해 각 요소를 비교하여 제일 작은 원소를 찾아냄
4. for문을 사용하여 해당 원소의 인덱스만 제외하고 모든 원소를 새로운 배열에 담는다.

타임라인:
0. 배열을 가변리스트로 생성 방법
0-1) Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);//arr 배열을 Integer 배열로 ㅂ변환
0-2) List<Integer> list = new ArrayList<>(Arrays.asList(integerArray)); // Integer 배열을 가변 리스트로 변환
1. 가변리스트 생성 방법
1-1) List<Integer> fixedSizeList = Arrays.asList(array);  // 고정 리스트 생성
1-2) List<Integer> modifiableList = new ArrayList<>(fixedSizeList); // 가변 리스트 생성
2. 리스트 인덱싱 -> list.get(0)
3. list.remove() -> ()안에는 인덱스가 들어가게 된다
만약 특정 요소를 삭제하고 싶다면 Integer 형으로 바꿔줘야함-> new Integer(min_num)
4. 리스트를 배열로 변환-> int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
5. 배열 출력시 -> Arrays.toString(arr)
*/

class Solution26 {
    public static int[] solution(int[] arr) {
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new); // arr 배열을 Integer 배열로 변환
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray)); // Integer 배열을 가변 리스트로 변환
        int length = list.size();
        if(length == 1){ //arr의 원소가 1개 일때
            list.remove(0);
            list.add(-1);
        }
        else{
            int min_num = list.get(0);// 리스트 인덱싱
            for(int i= 1; i < length;i++){
                if(list.get(i)<min_num){
                    min_num = list.get(i);// 리스트의 최솟값 갱신

                }
            }
            list.remove((Integer)min_num);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
public class _26_제일작은수제거하기 {
    public static void main(String[] args) {
        int [] arr = {4,5,9,7,3,6};
        int [] answer = Solution26.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
