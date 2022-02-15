package bronze2._5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 과제 안 내신 분..?

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        boolean[] bArr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            bArr[Integer.parseInt(br.readLine())]=true;
        }
        for (int i = 1; i < 31; i++) {
            if(!bArr[i]) sb.append(i).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}