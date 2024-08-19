class Solution{
    public static String solution(String s){
        String answer;
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = min;
        int index = 0;
        for(String arrElement : arr){
            int targetint = Integer.parseInt(arr[index]);
            if(min > targetint){
                min = targetint;
            }
            if(max < targetint){
                max = targetint;
            }
            index++;
        }
        answer = min + " " + max;
        return answer;
    }
}