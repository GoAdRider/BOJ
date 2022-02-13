package bronze2._5586;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// JOI 와 IOI

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        char[] cArr = br.readLine().toCharArray();
        int joiCnt = 0;
        int ioiCnt = 0;
        for (int i = 2; i < cArr.length; i++) {
            if(cArr[i]=='I' && cArr[i-1]=='O'){
                switch (cArr[i-2]) {
                    case 'J': joiCnt++; break;
                    case 'I': ioiCnt++; break;
                }
            }
        }
        sb.append(joiCnt).append("\n").append(ioiCnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
