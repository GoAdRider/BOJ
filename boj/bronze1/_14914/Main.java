package bronze1._14914;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 사과와 바나나 나눠주기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int a = Integer.parseInt(sA[0]);
        int b = Integer.parseInt(sA[1]);
        int min = a<b ? a : b;
        for (int i = 1; i <= min; i++) {
            if(a%i==0&&b%i==0) sb.append(i).append(" ").append(a/i).append(" ").append(b/i).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
