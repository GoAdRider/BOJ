package basic.datastructure203._11655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ROT 13
//  영어 알파벳을 13글자씩 밀어서 만든 알파벳

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        char[] cArr = str.toCharArray();
        int replace;

        for (int i = 0; i < cArr.length; i++) {
            replace = -1;
            if(65<=cArr[i] && cArr[i] <=90){
                replace = cArr[i]+13;
                if(90 < replace) replace-=26;
            }else if(97<=cArr[i] && cArr[i]<=122){
                replace = cArr[i]+13;
                if(replace > 122) replace-=26;
            }

            if(replace != -1){
                cArr[i] = (char)replace;
            }
            sb.append(cArr[i]);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
