package bronze2._2399;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 거리의 합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] lArr = new long[n];
        for (int i = 0; i < n; i++) {
            lArr[i] = Integer.parseInt(st.nextToken());
        }

        long sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                sum += Math.abs(lArr[i]-lArr[j]);
            }
        }
        bw.write(Long.toString(sum));
        bw.flush();
        bw.close();
    }
}
