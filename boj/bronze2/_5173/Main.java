package bronze2._5173;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 대회 자리

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int k = Integer.parseInt(br.readLine());
        String[] strArr;
        boolean[] seat;
        for (int i = 0; i < k; i++) {
            strArr = br.readLine().split(" ");
            int p = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);

            seat = new boolean[m+1];
            int count=0;
            for (int j = 0; j < p; j++) {
                int want = Integer.parseInt(br.readLine());
                if(want<=m && !seat[want]) seat[want] = true;
                else count++;
            }
            sb.append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}