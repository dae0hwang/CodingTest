package 알고리즘복습;

public class 중복문자제거 {

    public static void main(String[] args) {
        String str = "ksekkset";
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }

}
