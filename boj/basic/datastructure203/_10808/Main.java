package basic.datastructure203._10808;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 알파벳 개수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] alphabets = new int[26];
        String str = br.readLine();
        int size = str.length();

        for (int i = 0; i < size; i++) {
            int num = str.charAt(i)-'a';
            ++alphabets[num]; 
        }
        
        for (int i = 0; i < 26; i++) {
            sb.append(alphabets[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
