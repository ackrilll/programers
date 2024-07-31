package nbc;

import java.util.*;

//자료구조 요리 레시피 메모장 만들기
//입력값
//저장할 자료구조명을 입력합니다. (List / Set / Map)  -> scanner
//내가 좋아하는 요리 제목을 먼저 입력합니다. -> title
//이어서 내가 좋아하는 요리 레시피를 한 문장씩 입력합니다. -> scanner
//입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다. -> scanner
//
//출력값
//입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력해 줍니다.
//이어서, 입력한 모든 문장 앞에 번호를 붙여서 입력 순서에 맞게 모두 출력해 줍니다.
//
//예시 입력 :
//Set
//백종원 돼지고기 김치찌개 만들기
//돼지고기는 핏물을 빼주세요.
//잘익은 김치 한포기를 꺼내서 잘라주세요.
//냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
//다진마늘 한스푼, 설탕 한스푼 넣어주세요.
//종이컵으로 물 8컵 부어서 센불에 끓여주세요.
//핏물 뺀 돼지고기를 넣어주세요.
//된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
//간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
//중불로 줄여서 오래 끓여주세요~!!
//마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
//끝
//
//예시 출력:
//
//[ Set 으로 저장된 백종원 돼지고기 김치찌개 만들기 ]
//1. 돼지고기는 핏물을 빼주세요.
//2. 잘익은 김치 한포기를 꺼내서 잘라주세요.
//3. 냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
//4. 다진마늘 한스푼, 설탕 한스푼 넣어주세요.
//5. 종이컵으로 물 8컵 부어서 센불에 끓여주세요.
//6. 핏물 뺀 돼지고기를 넣어주세요.
//7. 된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
//8. 간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
//9. 중불로 줄여서 오래 끓여주세요~!!
//10. 마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
public class _2주차과제_ {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String col = sc.nextLine();
    String title = sc.nextLine();
    boolean endFlag = true;
    int index = 0;
    switch (col) {
        case "List":
            ArrayList<String> list = new ArrayList<String>();
            while (endFlag) {
                String body = sc.nextLine();
                if (!body.equals("끝")) {
                    list.add(body);
                    index++;
                } else {
                    endFlag = false;
                    System.out.println("[ List로 저장된 " + title + " ]");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + ". " + list.get(i));
                    }
                }
            }
            break;
        case "Set":
            Set<String> set = new HashSet<String>();
            while (endFlag) {
                String body = sc.nextLine();
                if (!body.equals("끝")) {
                    set.add(body);
                    index++;
                } else {
                    endFlag = false;
                    System.out.println("[ Set으로 저장된 " + title + " ]");
                    int set_index = 0;
                    for (String answer : set) {
                        System.out.println(set_index+1 + ". " + answer);
                        set_index++;
                    }
                }
            }
            break;
        case "Map":
             Map<Integer, String> map = new HashMap<>();
             while (endFlag) {
                 String body = sc.nextLine();
                 if (!body.equals("끝")) {
                     map.put(index, body);
                     index++;
                 } else {
                     endFlag = false;
                     System.out.println("[ Map으로 저장된 " + title + " ]");
                     for (int i = 0; i < map.size(); i++) {
                         System.out.println(i + 1 + ". " + map.get(i));
                     }
                 }
             }
             break;
        }
    }
}

