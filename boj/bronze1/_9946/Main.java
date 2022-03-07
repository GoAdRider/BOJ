package bronze1._9946;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 단어 퍼즐

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String str1;
        String str2;
        int num=1;
        while(true){
            str1=br.readLine(); str2=br.readLine();
            if(str1.equals("END")&&str2.equals("END")) break;

            int[] store = new int[26];
            boolean check=true;
            int len=str1.length();

            if(len != str2.length()) check=false;
            else{
                for (int i = 0; i < len; i++) {
                    ++store[(int)(str1.charAt(i)-'a')];
                    --store[(int)(str2.charAt(i)-'a')];
                }
            }

            if(check){
                for (int i = 0; i < 26; i++) {
                    if(store[i]!=0){
                        check=false;
                        break;
                    }
                }
            }
            
            sb.append("Case ").append(num++).append(": ");
            if(check) sb.append("same\n");
            else sb.append("different\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}