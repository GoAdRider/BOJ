package bronze1._6996;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 애너그램

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] sArr;
        int[] alphabet = new int[26];
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            int len = sArr[0].length();
            
            if(len != sArr[1].length()){
                sb.append(sArr[0]).append(" & ").append(sArr[1]).append(" are NOT anagrams.\n");
            }else{
                for (int j = 0; j < len; j++) {
                    alphabet[sArr[0].charAt(j)-'a']++;
                    alphabet[sArr[1].charAt(j)-'a']--;
                }

                boolean check=true;
                for (int j = 0; j < 26; j++) {
                    if(alphabet[j] != 0){
                        check=false;
                        break;
                    }              
                }
                if(check) sb.append(sArr[0]).append(" & ").append(sArr[1]).append(" are anagrams.\n");
                else sb.append(sArr[0]).append(" & ").append(sArr[1]).append(" are NOT anagrams.\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}