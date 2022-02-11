package bronze2._5218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 알파벳 거리

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        String[] strArr;
        for (int i = 0; i < size; i++) {
            strArr = br.readLine().split(" ");
            int len = strArr[0].length();
            sb.append("Distances:");
            for (int j = 0; j < len; j++) {
                sb.append(" ");
                int x = strArr[0].charAt(j)-'A'+1;
                int y = strArr[1].charAt(j)-'A'+1;
                if(y>=x) sb.append(y-x);
                else sb.append(26+y-x);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
