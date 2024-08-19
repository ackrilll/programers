class Solution{
    public static String solution(String s, int n){
        String answer = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {// 문자열 하나씩 가져와서 공백인지, 소문자인지, 대문자인지 판별
            int ascii = (int) s.charAt(i);
            if(ascii == 32){// 공백일때
                answer = answer.concat(" ");
            }
            else if(ascii >=65 && ascii <= 90){//대문자일때
                int new_ascii = ascii + n;
                if(new_ascii > 90){// 범위 넘을 때 26빼줌
                    new_ascii -= 26;
                }
                answer = answer.concat(Character.toString((char)(new_ascii)));
            }
            else{
                int new_ascii = ascii + n;
                if(new_ascii>122){
                    new_ascii -= 26;
                }
                answer = answer.concat(Character.toString((char)(new_ascii)));
            }
        }

        return answer;
    }
}