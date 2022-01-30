package bronze2._2154;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 수 이어 쓰기3

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String str = br.readLine();
        int num = Integer.parseInt(str);
        for (int i = 1; i <= num; i++) {
            sb.append(i);
        }
        int result = sb.indexOf(str)+1;
        System.out.println(result);
    }
}
