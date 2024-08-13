import java.util.ArrayList;
import java.util.Arrays;
class Solution{
    public static int[] solution(String today, String[] terms, String[] privacies){
        int[] answer;
        ArrayList<Integer>answerList = new ArrayList<>();
        int intToday = makeIntdate(today);
        int privaciesIdx = 0;
        int answerIdx = 0;

        for(String privacy : privacies){
            String tempStrDate = privacy.substring(0,10);
            String tempPromise = privacy.substring(11);
            int addNum = -1;
            for(String term : terms){
                if(term.substring(0,1).equals(tempPromise)){
                    addNum = Integer.parseInt(term.substring(2));
                    break;
                }
            }
            int promisDate = intEndDate(tempStrDate,addNum);
            if(intToday >= promisDate){ // 기간 지났을때
                answerList.add(privaciesIdx+1);
                System.out.println(promisDate);
            }
            privaciesIdx++;
        }
        answer = new int[answerList.size()];
        for(int element : answerList){
            answer[answerIdx] = element;
            answerIdx++;
        }

        return answer;
    }
    //2024.05.22 와 같은 STring 날짜 받아서 Int(20240522)로 변환해주는 메서드
    public static int makeIntdate(String date){
        int answer;
        int year = Integer.parseInt(date.substring(0,4));
        int month;
        String strMonth = date.substring(5,7);
        if(strMonth.charAt(0)==48){ // 앞자리 0일때 즉 1~9월 까지
            month = Integer.parseInt(strMonth.substring(1,2));
        } else { // 10~12월까지
            month = Integer.parseInt(strMonth);
        }
        String strDay = date.substring(8);
        int day;
        if(strDay.charAt(0)==48){ // 앞자리 0일때 즉 1~9일 까지
            day = Integer.parseInt(strDay.substring(1,2));
        } else { // 10 이후 날짜까지
            day = Integer.parseInt(strDay);
        }
        return year*10000+month*100+day;
    }
    // String 날짜, int 개월 받아서 Int 형 enddate 반환하는 메서드
    public static int intEndDate(String date, int month){
        int endDate;
        int dateYear = Integer.parseInt(date.substring(0,4));
        int yearUp = 0;

        String strMonth = date.substring(5,7);
        int dateMonth;
        if(strMonth.charAt(0)==48){ // 앞자리 0일때 즉 1~9월 까지
            dateMonth = Integer.parseInt(strMonth.substring(1,2));
        } else { // 10~12월까지
            dateMonth = Integer.parseInt(strMonth);
        }

        String strDateDay = date.substring(8);
        int dateDay;
        if(strDateDay.charAt(0)==48){ // 앞자리 0일때 즉 1~9일 까지
            dateDay = Integer.parseInt(strDateDay.substring(1,2));
        } else { // 10 이후 날짜까지
            dateDay = Integer.parseInt(strDateDay);
        }
        while(dateMonth+month > 12){
            month -= 12;
            yearUp++;
        }
        endDate = (dateYear+yearUp)*10000 + (dateMonth+month)*100 + dateDay;

        return endDate;
    }
}