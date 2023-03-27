package string;

import java.util.Scanner;

public class 문장속단어 {

}
class Main2 {
    public static void main(String[] args){
        var in=new Scanner(System.in);
        String str = in.nextLine();
        String[] split = str.split(" ");

        int max = Integer.MIN_VALUE;
        String answer = null;
        for (String s : split) {
            int length = s.length();
            if (length > max) {
                max = length;
                answer = s;
            }
        }
        System.out.println(answer);
    }
}