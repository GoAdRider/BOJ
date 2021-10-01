package bronze1._1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
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
        
        int[][] MaxNums = new int[2][2];    // firstMax : {index, value}, secondMax : {index, value}
        for (int i = 0; i < alphabet.length; i++) {
            if(MaxNums[0][1] <= alphabet[i]){
                MaxNums[1][0] = MaxNums[0][0];
                MaxNums[1][1] = MaxNums[0][1];
                MaxNums[0][0] = i;
                MaxNums[0][1] = alphabet[i];
            }
        }

        sb.append(MaxNums[0][1] == MaxNums[1][1] ? "?" : (char)(65+MaxNums[0][0]));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}