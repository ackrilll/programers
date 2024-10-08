package 문제;


import java.util.Stack;

/*문제 설명
햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다. 함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면
조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다. 상수는 손이 굉장히 빠르기 때문에
상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵일 때, 상수는 여섯 번째 재료가 쌓였을 때,
세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때,
두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다. 즉, 2개의 햄버거를 포장하게 됩니다.

상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

제한사항
1 ≤ ingredient의 길이 ≤ 1,000,000
ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
입출력 예
ingredient	                result
[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
[1, 3, 2, 1, 2, 1, 3, 1, 2]	0

발상:
1.배열 -> 리스트, 리스트에서 하나씩 꺼내 1,2,3,1 연속한 것 찾고 찾으면 리스트에서 삭제

타임라인
1. 시간 초과 -> 로직 변경 필요
2. 스택을 이용해서 데이터를 저장과 동시에 1231 인지 확인되면 pop 기존 로직은 리스트로 변환 후 접근 -> 스택으로 쌓는 중에 1231 빼기
*/
class Solution65{
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

public class _65_햄버거 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = Solution65.solution(ingredient);
        System.out.println(answer);
    }
}
