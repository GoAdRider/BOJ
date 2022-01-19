package bronze2._1371;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 가장 많은 글자

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] alphNums = new int[26];
        int max=0;
        String str ="";
        while((str=br.readLine())!=null){
            char[] cArr = str.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                if(cArr[i] == ' ') continue;
                alphNums[cArr[i]-'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            max = max < alphNums[i] ? alphNums[i] : max;
        }
        for (int i = 0; i < 26; i++) {
            if(alphNums[i] == max) sb.append((char)('a'+i));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
