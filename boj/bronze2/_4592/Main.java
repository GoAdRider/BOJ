package bronze2._4592;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 중복을 없애자

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0) break;
            
            int[] intArr = new int[n];
            for (int i = 0; i < n; i++) {
                intArr[i] = Integer.parseInt(st.nextToken());
                if(i>0){
                    if(intArr[i]==intArr[i-1]) continue;
                }
                sb.append(intArr[i]).append(" ");
            }
            sb.append("$").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}