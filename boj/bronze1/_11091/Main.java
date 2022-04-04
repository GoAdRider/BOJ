package bronze1._11091;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 알파벳 전부 쓰기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            int[] alpha = new int[26];
            char[] words = br.readLine().toLowerCase().toCharArray();
            for (int i = 0; i < words.length; i++) {
                int temp = (int)(words[i]-'a');
                if(0<=temp && temp<26) alpha[temp]++;
            }

            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if(alpha[i]==0) {
                    if(flag) sb.append("missing ");
                    flag = false;
                    sb.append((char)(i+'a'));
                }
            }
            if(flag) sb.append("pangram");
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}