package 문제;
import java.util.*;
/*문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
입출력 예
nums	    result
[1,2,3,4]	1
[1,2,7,6,4]	4

발상
1.int형배열 -> int 리턴
2. 소수 -> 1부터 쭉 증가시켜서 자기 자신과 1밖에 나누어 떨어지지 않는 수
3. 소수인지 판단하는 메소드 작성
4. 배열에서 3개 골라 더해 새로운 배열에 담는 메소드

*/
class Solution55 {
    public static int solution(int[] num){
        int[] sumArray = SumArray(num);
        int Primecount = 0;
        for (int i = 0; i < sumArray.length; i++) { // 매개변수 배열에서 소수인지 검사할 수 하나씩 꺼냄
            for (int j = 2; j < sumArray[i]; j++) {// j는 1부터 (자기 자신-1) 까지 증가하면서 나누어 떨어지는지 확인
                if(sumArray[i] == 1){
                    Primecount++;
                }
                else {// 검사할 숫자가 1이 아닌 자연수 일 때
                    if(sumArray[i]%j ==0){// 소수인지 검사할 숫자가 자기 이외의 숫자로 나뉠때
                        break; //내부 for문 나가서 다음 숫자 검사
                    }
                    if(j == sumArray[i]-1){
                        Primecount++;
                    }
                }
            }
        }
        System.out.println(Primecount);
        return Primecount;
    }

    public static int[] SumArray(int[] nums){ // int 배열 받아서 3개 원소의 합을 새로운 배열에 담아 반환하는 메소드
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {//가장 왼쪽
            for (int j = i+1; j < nums.length-1; j++) { // 중간
                for (int k = j+1; k < nums.length; k++) {
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = Solution55.solution(nums);
        System.out.println(answer);

    }
}
