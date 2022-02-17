package bronze2._5704;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 팬그램

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        boolean[] alphabets;
        char[] cArr;
        String str;
        while (!(str=br.readLine()).equals("*")) {
            alphabets = new boolean[26];
            cArr = str.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                if(cArr[i] != ' ') alphabets[cArr[i]-'a']=true;
            }

            boolean check=true;
            for (int i = 0; i < alphabets.length; i++) {
                if(alphabets[i]==false){
                    check=false;
                    break;
                }
            }

            if(check) sb.append("Y");
            else sb.append("N");
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
