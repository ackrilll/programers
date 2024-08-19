class Solution{
    public static boolean solution(int x) {
        boolean answer = false;
        String str_x = String.valueOf(x);// int -> String 형변환
        int length = str_x.length();
        int sum = 0;
        int part_num = 0;
        for (int i = 0; i<length; i++){
            part_num =  Integer.parseInt(str_x.substring(i,i+1));// str_x를 하나씩 int 형으로 바꿈
            sum += part_num;
        }
        if(x % sum ==0){// 하샤드 수일 때
            answer = true;
        }
        return answer;
    }
}