package bronze2._5524;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 입실 관리

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int n = Integer.parseInt(br.readLine());
        char[] cArr;
        for (int i = 0; i < n; i++) {
            cArr = br.readLine().toCharArray();
            for (int j = 0; j < cArr.length; j++) {
                if(cArr[j]<91) cArr[j] +=32;
                sb.append(cArr[j]);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}