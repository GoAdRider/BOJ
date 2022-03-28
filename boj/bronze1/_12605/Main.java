package bronze1._12605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 단어 순서 뒤집기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] str;
        for (int i = 1; i <= n; i++) {
            str = br.readLine().split(" ");
            int j = str.length;
            sb.append("Case #").append(i).append(": ");
            while(j-->0){
                sb.append(str[j]);
                if(j!=0) sb.append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
