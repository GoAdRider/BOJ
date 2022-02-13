package bronze2._5576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 콘테스트

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] w = new int[10];
        int[] k = new int[10];
        for (int i = 0; i < 10; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(w);
        Arrays.sort(k);
        int wSum = w[7]+w[8]+w[9];
        int kSum = k[7]+k[8]+k[9];

        sb.append(wSum).append(" ").append(kSum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
