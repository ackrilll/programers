class Solution{
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