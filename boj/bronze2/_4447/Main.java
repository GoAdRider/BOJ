package bronze2._4447;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 좋은놈 나쁜놈

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        char[] cArr = null;
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            sb.append(str);

            cArr = str.toCharArray();
            int good = 0;
            int bad = 0;
            for (int j = 0; j < cArr.length; j++) {
                if(cArr[j]==' ') continue;
                else if(cArr[j]=='g' || cArr[j]=='G') good++;
                else if(cArr[j]=='b' || cArr[j]=='B') bad++;
            }

            sb.append(" is ");
            if(good > bad) sb.append("GOOD");
            else if(good < bad) sb.append("A BADDY");
            else sb.append("NEUTRAL");
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
