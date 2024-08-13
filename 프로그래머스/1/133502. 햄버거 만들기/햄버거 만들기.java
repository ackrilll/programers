import java.util.Stack;
class Solution{
    public static int solution(int[] ingredient){
        int answer = 0;
        // 배열을 리스트로
        Stack<Integer>ingredientStack = new Stack<>();
        for (int element : ingredient) {
            ingredientStack.push(element);
            if(ingredientStack.size()>=4){ // stack 에 요소 4개 이상일 때
                int tatget1 = ingredientStack.pop(); // 1
                int tatget2 = ingredientStack.pop(); // 3
                int tatget3 = ingredientStack.pop(); // 2
                int tatget4 = ingredientStack.pop(); // 1
                if(!(tatget1 == 1 && tatget2==3 && tatget3==2 && tatget4 == 1)){// 1231 아닐 때
                    ingredientStack.push(tatget4);
                    ingredientStack.push(tatget3);
                    ingredientStack.push(tatget2);
                    ingredientStack.push(tatget1);
                }else { // 1231 일 때
                    answer+=1;
                }
            }
        }
        
        return answer;
    }
}