package 백준하나씩;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 검열 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String A = br.readLine();
        String T = br.readLine();

        while (T.contains(A)) {
            T = T.replace(A, "");
        }
        bw.write(T);
        bw.flush();
    }
}
