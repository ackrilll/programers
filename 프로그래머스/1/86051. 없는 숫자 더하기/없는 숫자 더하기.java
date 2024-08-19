import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution{
    public static int solution (int [] numbers){
        int answer = 0;
        int length = numbers.length;
        int sum = 0;
        List<Integer> nonum_list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(nonum_list);
        for(int i = 0; i < length; i++){// i는 인덱스 번호
            for(int j=0; j<10; j++) {//j는 0~9까지 비교할 숫자
                if(numbers[i] == j){
                    nonum_list.remove(Integer.valueOf(j));
                    break;
                }
            }
        }
        int nonum_length = nonum_list.size();
        for (int i=0; i < nonum_length; i++){
            sum+=nonum_list.get(i);
        }
        answer = sum;
        return answer;
    }
}