package bronze1._2999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 비밀 이메일

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int len=str.length();
        if(len==2) sb.append(str);
        else{
            int x=0;
            for (int i = 1; i <= len; i++) {
                for (int j = i; j <= len; j++) {
                    if(i*j == len){
                        x=i;
                    }
                }
            }
            int point=0;
            int plus=1;
            for (int i = 0; i < len; i++) {
                sb.append(str.charAt(point));
                point+=x;
                if(point>len-1) point=plus++;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
