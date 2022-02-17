package bronze2._5724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 파인만

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int n;
        while((n=Integer.parseInt(br.readLine()))!=0){
            int result=0;
            for (int i = 2; i <= n; i++) {
                result += i*i;
            }
            sb.append(result+1).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
