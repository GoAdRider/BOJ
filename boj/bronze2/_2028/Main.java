package bronze2._2028;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 자기복제수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            int n = Integer.parseInt(str);
            String compare = String.valueOf(n*n);
            compare = compare.substring(compare.length()-str.length(), compare.length());
            
            sb.append(str.equals(compare) ? "YES" : "NO").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}