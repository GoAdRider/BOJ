package bronze2._2587;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 대표값2

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] intArr = new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
            sum += intArr[i];
        }
        Arrays.sort(intArr);
        sb.append(sum/5).append("\n").append(intArr[2]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
