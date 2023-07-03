//package 프로그래머스2;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Stack;
//
//public class 과제진행하기 {
//
//    class Assignment implements Comparable<Assignment> {
//        String subject;
//        int start;
//        int time;
//
//        public Assignment(String subject, int start, int time) {
//            this.subject = subject;
//            this.start = start;
//            this.time = time;
//        }
//
//        public Assignment(String subject, int time) {
//            this.subject = subject;
//            this.time = time;
//        }
//
//        @Override
//        public int compareTo(Assignment o) {
//            return this.start - o.start;
//        }
//    public String[] solution(String[][] plans) {
//        List<Assignment> assignments = new ArrayList<>();
//        for (String[] plan : plans) {
//            String subject = plan[0];
//            String[] split = plan[1].split(":");
//            int start = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
//            int time = Integer.parseInt(plan[2]);
//            assignments.add(new Assignment(subject, start, time));
//        }
//        Collections.sort(assignments);
//
//        Stack<Assignment> stack = new Stack<>();
//        List<String> answer = new ArrayList<>();
//
//        for (int i = 0; i < assignments.size(); i++) {
//            //마지막 요소인 경우
//            if (i == assignments.size() - 1) {
//                answer.add(assignments.get(i).subject);
//                break;
//            }
//
//            int current = assignments.get(i).start + assignments.get(i).time;
//            int next = assignments.get(i + 1).start;
//            int differ = next - current;
//            if(differ < 0){//끝나지 않은 것. stack에 추가.
//                stack.push(new Assignment(assignments.get(i).subject,Math.abs(differ)));
//            }else {//충분히 소요되는 것. 두 가지로 나뉨.
//                answer.add(assignments.get(i).subject);
//                if (differ > 0) {
//
//                }
//                }
//            }
//
//        }
//
//        return null;
//
//    }
//
////    public static void main(String[] args) {
////        //정렬을 일단 해야겠다.
////        String[][] plans = {{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};
////        //시간순으로 저렬을 한번 해야할 것 같다.
////        List<Assignment> assignments = new ArrayList<>();
////        for (String[] plan : plans) {
////            String time = plan[1];
////            String[] split = time.split(":");
////            Integer realTime = Integer.valueOf(split[0]) * 60 + Integer.valueOf(split[1]);
////            assignments.add(new Assignment(plan[0], realTime, Integer.valueOf(plan[2])));
////        }
////        Collections.sort(assignments);
////
////        Stack<Assignment> stack = new Stack<>();
////        //끝난 순서대로 과목명을 답을 리스트
////        List<String> answer = new ArrayList<>();
////        for (int i = 0; i < assignments.size(); i++) {
////            //마지막 요소인 경우
////            if (i == assignments.size() - 1) {
////                answer.add(assignments.get(i).name);
////                break;
////            }
////
////
////        }
////
////    }
//}
