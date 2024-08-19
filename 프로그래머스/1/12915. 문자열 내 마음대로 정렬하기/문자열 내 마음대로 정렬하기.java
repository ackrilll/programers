import java.util.*;
import java.util.stream.Collectors;

class Solution{
    public static String[] solution(String[] strings,int n){
        List<String>alpha_list = alpha_listup(strings,n);//알파벳 정렬해서 담고 중복 제거하서 리스트로 반환해주는 메소드
        List<List<String>> myList = new ArrayList<>(); //이중 리스트 생성
        int alpha_length = alpha_list.size();
        int strings_length = strings.length;
        for (int i = 0; i < alpha_length; i++) { // 리스트업 된 알파벳 갯수만큼 반복
            List<String> innerList = new ArrayList<>(); // 새로운 리스트 생성
            for (int j = 0; j < strings_length; j++) {// 매개변수 배열의 크기만큼 반복
                if(alpha_list.get(i).equals(strings[j].substring(n,n+1))){
                    innerList.add(strings[j]);
                }
            }
            Collections.sort(innerList); // innerList 정렬
            myList.add(innerList);
            innerList = null;
        }
        String[] answer = ListToArr(myList);

        return answer;
    }

    public static List<String> alpha_listup(String[] strings,int n){// String 배열과 인덱스 받아서 해당 위치의 알파벳 담고 정렬 및 중복 제거하는 메소드
        List<String> alpha_list = new ArrayList<>();
        String target = "";
        int length = strings.length;
        for (int i = 0; i < length; i++) {
            target = strings[i].substring(n,n+1); // 알파벳 target에 담기
            alpha_list.add(target);//리스트에 담기
        }
        List<String> newalpha_list = alpha_list.stream().distinct().collect(Collectors.toList());// 중복 제거
        Collections.sort(newalpha_list);// 알파벳 정렬
        return newalpha_list;
    }

    public static String[] ListToArr(List<List<String>> mul_list) {//이중리스트 매개변수로 받아 1차원 배열로 반환해주는 메소드
        int row = mul_list.size();// 이중 리스트 행의 갯수
        int count = 0;
        for (int i = 0; i < row; i++) {
            int col = mul_list.get(i).size();// i행의 칼럼 수
            for (int j = 0; j < col; j++) {
                count++;
            }
        }
        String[] arr = new String[count];
        count = 0;
        for (int i = 0; i < row; i++) {
            int col = mul_list.get(i).size();// i행의 칼럼 수
            for (int j = 0; j < col; j++) {
                arr[count] = mul_list.get(i).get(j);
                count++;
            }
        }
        return arr;
    }
}