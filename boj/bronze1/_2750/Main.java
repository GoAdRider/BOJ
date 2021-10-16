package bronze1._2750;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] intArr = new int[size];

        for (int i = 0; i < size; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArr);
        
        for (int i = 0; i < size; i++) {
            sb.append(intArr[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
