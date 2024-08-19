import java.util.*;
class Solution {
    public static int solution(int[] num){
        int[] sumArray = SumArray(num);
        int Primecount = 0;
        for (int i = 0; i < sumArray.length; i++) { 
            for (int j = 2; j < sumArray[i]; j++) {
                if(sumArray[i] == 1){
                    Primecount++;
                }
                else {
                    if(sumArray[i]%j ==0){
                        break; 
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

    public static int[] SumArray(int[] nums){ 
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) { 
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
}