class Solution{
    public static String solution(String[] cards1, String[] cards2, String[] goal){
        String answer = "";
        int goal_size = goal.length;
        int idx1 = 0;
        int idx2 = 0;
        boolean answer_flag = true;
        for (int i = 0; i < goal_size; i++) {
            String target = goal[i];
            if(target.equals(cards1[idx1])){// 타겟이 cards1 비교 단어와 같을때
                System.out.println(target.equals(cards1[idx1]) );
                if(idx1 < cards1.length-1 ){
                idx1++;}
            }
            else if(target.equals(cards2[idx2])){//타겟이 cards2 비교 단어와 같을때
                System.out.println(target.equals(cards2[idx2]) );
                if(idx2 < cards2.length-1 ){
                    idx2++;}
            }
            else {// 둘 다 같지 않을때
                answer_flag = false;
                break;
            }
        }
        if(answer_flag){ // 단어가 순서대로 cards1, cards2에 있을 때
            answer = "Yes";
        }
        else{
            answer = "No";
        }
        return answer;
    }
}