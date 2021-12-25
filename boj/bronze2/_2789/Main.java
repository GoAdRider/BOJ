package bronze2._2789;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 유학금지

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        char[] cArr = br.readLine().toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            switch (cArr[i]) {
                case 'C': break;
                case 'A': break;
                case 'M': break;
                case 'B': break;
                case 'R': break;
                case 'I': break;
                case 'D': break;
                case 'G': break;
                case 'E': break;
            
                default: sb.append(cArr[i]); break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}