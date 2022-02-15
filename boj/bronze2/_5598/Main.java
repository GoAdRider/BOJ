package bronze2._5598;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 카이사르 암호

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        char[] cArr = br.readLine().toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if(cArr[i]>67) cArr[i]-=3;
            else cArr[i]+=23;
            sb.append(cArr[i]);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}