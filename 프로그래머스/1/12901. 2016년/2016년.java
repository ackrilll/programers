class Solution{
    public static String solution(int a, int b){
        String answer = "";
        int n = 0; // 날짜 차이
        switch (a){
            case 1:
            n = b-1;
            break;
            case 2:
            n = 31 + b-1;
            break;
            case 3:
            n = 31 +29+ b-1;
            break;
            case 4:
            n = 31 +29+31+ b-1;
            break;
            case 5:
            n = 31 +29+31+30+ b-1;
            break;
            case 6:
            n = 31 +29+31+30+31+ b-1;
            break;
            case 7:
            n = 31 +29+31+30+31+30+ b-1;
            break;
            case 8:
            n = 31 +29+31+30+31+30+ 31+b-1;
            break;
            case 9:
            n = 31 +29+31+30+31+30+ 31+31+b-1;
            break;
            case 10:
            n = 31 +29+31+30+31+30+31 +31+30+b-1;
            break;
            case 11:
            n = 31 +29+31+30+31+30+31 +31+30+31+b-1;
            break;
            case 12:
            n = 31 +29+31+30+31+30+31 +31+30+31+30+b-1;
            break;
        }
        int distance = n % 7;
        switch (distance){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        return answer;
    }
}