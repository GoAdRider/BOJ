package bronze1._17294;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 귀여운 수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int size = str.length();
        int between = 0;
        boolean flag=true;
        for (int i = 1; i < size; i++) {
            if(i==1) between = (str.charAt(i-1)-'0')-(str.charAt(i)-'0');
            else{
                if(((str.charAt(i-1)-'0')-(str.charAt(i)-'0')) != between){
                    flag = false;
                    break;
                }
            }
        }
        if(flag) sb.append("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        else sb.append("흥칫뿡!! <(￣ ﹌ ￣)>");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
