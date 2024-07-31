package 문제;
/*
문제 설명
나만의 카카오 성격 유형 검사지를 만들려고 합니다.
성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.

지표 번호	성격 유형
1번 지표	    라이언형(R), 튜브형(T)
2번 지표	    콘형(C), 프로도형(F)
3번 지표	    제이지형(J), 무지형(M)
4번 지표	    어피치형(A), 네오형(N)
4개의 지표가 있으므로 성격 유형은 총 16(=2 x 2 x 2 x 2)가지가 나올 수 있습니다. 예를 들어, "RFMN"이나 "TCMA"와 같은 성격 유형이 있습니다.

검사지에는 총 n개의 질문이 있고, 각 질문에는 아래와 같은 7개의 선택지가 있습니다.

매우 비동의
비동의
약간 비동의
모르겠음
약간 동의
동의
매우 동의
각 질문은 1가지 지표로 성격 유형 점수를 판단합니다.

예를 들어, 어떤 한 질문에서 4번 지표로 아래 표처럼 점수를 매길 수 있습니다.

선택지	        성격 유형 점수
매우 비동의	    네오형 3점
비동의	        네오형 2점
약간 비동의	    네오형 1점
모르겠음	        어떤 성격 유형도 점수를 얻지 않습니다
약간 동의	    어피치형 1점
동의	            어피치형 2점
매우 동의	    어피치형 3점
이때 검사자가 질문에서 약간 동의 선택지를 선택할 경우 어피치형(A) 성격 유형 1점을 받게 됩니다. 만약 검사자가 매우 비동의 선택지를 선택할 경우 네오형(N) 성격 유형 3점을 받게 됩니다.

위 예시처럼 네오형이 비동의, 어피치형이 동의인 경우만 주어지지 않고, 질문에 따라 네오형이 동의, 어피치형이 비동의인 경우도 주어질 수 있습니다.
하지만 각 선택지는 고정적인 크기의 점수를 가지고 있습니다.

매우 동의나 매우 비동의 선택지를 선택하면 3점을 얻습니다.
동의나 비동의 선택지를 선택하면 2점을 얻습니다.
약간 동의나 약간 비동의 선택지를 선택하면 1점을 얻습니다.
모르겠음 선택지를 선택하면 점수를 얻지 않습니다.
검사 결과는 모든 질문의 성격 유형 점수를 더하여 각 지표에서 더 높은 점수를 받은 성격 유형이 검사자의 성격 유형이라고 판단합니다.
단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.

질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey와 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices가 매개변수로 주어집니다.
이때, 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ survey의 길이 ( = n) ≤ 1,000
survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
choices의 길이 = survey의 길이

choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미합니다.
1 ≤ choices의 원소 ≤ 7
choices	뜻
1	매우 비동의
2	비동의
3	약간 비동의
4	모르겠음
5	약간 동의
6	동의
7	매우 동의
입출력 예
survey	                        choices	            result
["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	    "TCMA"
["TR", "RT", "TR"]	            [7, 1, 3]	        "RCJA"
발상:
1. 특정 지표 가지고있는 survey의 요소의 인덱스 다 찾아옴 (R, F, M, A)
2. 해당 인덱스의 choices 요소를 보고 해당 지표에 점수를 줌
3. 각 지표(RFMA) 양수인지 음수인지 판별
*/
class Solution66{
    public static String solution(String[] survey, int[] choices){
        int surveyIndex = 0;
        String answer = "";

        int R=0;
        int C=0;
        int J =0;
        int A=0;
        String one;
        String two;
        String three;
        String four;

        for (String element : survey){
            int choice = choices[surveyIndex];

            if(element.contains("R")){
                if(element.indexOf("R") == 0){// RT
                    R += 4-choice; //  1번이면 3점, 2번 2점 3번 1점 ...
                }
                else {
                    R += choice -4;
                }
            } else if (element.contains("C")) {
                if(element.indexOf("C") == 0){// CF
                    C += 4-choice;
                }
                else {
                    C += choice -4;
                }
            } else if (element.contains("J")) {
                if(element.indexOf("J") == 0){// JM
                    J += 4-choice;
                }
                else {
                    J += choice -4;
                }
            } else {
                if(element.indexOf("A") == 0){// AN
                    A += 4-choice;
                }
                else {
                    A += choice -4;
                }

            }
            surveyIndex++;
        }
        if(R >=0){
            one = "R";
        }else {
            one = "T";
        }
        if(C >=0){
            two = "C";
        }else {
            two = "F";
        }
        if(J >=0){
            three = "J";
        }else {
            three = "M";
        }
        if(A >=0){
            four = "A";
        }else {
            four = "N";
        }
        answer = one+two+three+four;
        return  answer;
    }
}

public class _66성격유형검사_ {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String answer = Solution66.solution(survey,choices);
        System.out.println(answer);

    }
}
