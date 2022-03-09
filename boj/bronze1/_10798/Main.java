package bronze1._10798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 세로 읽기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[][] cArr=new char[5][15];
        int max=0;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            int len = str.length();
            max = len > max ? len : max;
            for (int j = 0; j < len; j++) {
                cArr[i][j]= str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++){
                if(cArr[j][i]=='\0') continue;
                sb.append(cArr[j][i]);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
