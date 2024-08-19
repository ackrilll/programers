import java.util.ArrayList;
import java.util.List;
class Solution{
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