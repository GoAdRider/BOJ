package bronze1._1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26]; // a-z
        char[] inputStr = br.readLine().toUpperCase().toCharArray();
        for (int i = 0; i < inputStr.length; i++) {
            int space = inputStr[i]-'A';
            alphabet[space]++;
        }
        
        boolean dupl = false;   // true ? 최대값 중복
        int maxIndex = 0;
        int maxNum = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if(maxNum < alphabet[i]){
                maxIndex = i;
                maxNum = alphabet[i];
                dupl = false;
            }else if(maxNum == alphabet[i]){
                dupl = true;
            }
        }

        sb.append(dupl ? "?" : (char)(maxIndex+65));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}