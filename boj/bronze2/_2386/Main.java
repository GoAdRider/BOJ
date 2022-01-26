package bronze2._2386;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 도비의 영어 공부

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String str ="";
        while(!(str=br.readLine()).equals("#")){
            char c = str.charAt(0);
            char[] cArr = str.substring(2, str.length()).toCharArray();
            sb.append(solve(c,cArr)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String solve(char c, char[] cArr){
        int count=0;
        for (int i = 0; i < cArr.length; i++) {
            if(cArr[i]==' ') continue;
            else if(cArr[i]<91) cArr[i] +=32;
            
            if(cArr[i]==c) count++;
        }
        return c+" "+count;
    }
}
