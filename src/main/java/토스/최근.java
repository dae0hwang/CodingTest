package 토스;

import java.util.ArrayList;
import java.util.List;

public class 최근 {

    public static void main(String[] args) {

    }

    public String[] solution(int maxSize, String[] actions) {
        List<String> back = new ArrayList<>();
        List<String> recent = new ArrayList<>();
        //중복이 잇으면 빼야 한다. 그 메모리 캐시문제랑 비슷
        String now = "";
        List<String> forward = new ArrayList<>();
        for (String action : actions) {
            if (action.equals("B")) {
                if (!back.isEmpty()) {
                }
            }
        }


        String[] answer = {};
        return answer;
    }

}
