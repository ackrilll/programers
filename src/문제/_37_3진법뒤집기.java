package 문제;
import java.util.ArrayList;
import java.util.List;

/*문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
발상
1. long형 매개변수 -> long형 리턴
2. n 의 3진법 표현
2.1) n = 10일 때: 10 / 3 -> 몫 3, "나머지 1" -> 3 /3 -> "몫 1", "나머지 0"
10 =  101(3진법) 즉, 3진법을 만드는 핵심은 3으로 반복적으로 나누었을때 생겨나는 나머지들 (r1(제일첫번째 생긴 나머지),r2,r3...ri)과 마지막 몫 Q일때
n = "Q ri r(i-1) ... r2 r1" (3진법) 이 된다
따라서 while 문으로 몫이 0아니면 계속 되는 반복문을 작성하여 모든 나머지들과 마지막 몫을 뒤집어 다시 10진법으로 만들면 된다.

타임라인
1. 리스트 생성 -> List<String> list = new ArrayList<>();
2. 리스트 add메소드로 앞에 원소 끼워 넣기 -> list.add(0,원소) -> 0은 인덱스 번호의미
3. 자바에서는 제곱 연산자가 따로 없다... -> Math.pow(3,2) 3의 2제곱
*/
class Solution37{
    public static long solution(long n){
        long answer = 0;
        List<Long> list = new ArrayList<>();
        long R = 0; //나머지
        while( n/3 != 0 ){
            R = n % 3;
            list.add(R);// 제일 뒤의 원소로 리스트에 추가
            n = n / 3; // n을 갱신
        }
        list.add(n); // 여기까지 3진법을 뒤집은 과정 아래부터는 3진법을 10진법으로 변환하는 과정
        System.out.println(list);
        int length = list.size();
        long sum = 0;
        System.out.println(3^2);
        for (int i = 0; i < length ; i++) {// 리스트의 크기가 3이라면 (3^(3-1-0))*a +(3^(3-1-1))*b +(3^(3-1-2))*c
            sum += (long)Math.pow(3,length-1-i)*list.get(i);
        }
        answer = sum;
        return answer;
    }
}

public class _37_3진법뒤집기 {
    public static void main(String[] args) {
        int n = 125;
        long answer = Solution37.solution(n);
        System.out.println(answer);
    }
}
