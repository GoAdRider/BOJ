package bronze2._5054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 주차의 신

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int distance=0;
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int[] xi = new int[n];
            for (int j = 0; j < n; j++) {
                xi[j] = Integer.parseInt(arr[j]);
            }
            Arrays.sort(xi);

            for (int j = 0; j < n; j++) {
                if(j!=n-1){
                    distance += xi[j+1]-xi[j];
                }else{
                    distance += xi[j]-xi[0];
                }
            }
            sb.append(distance).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
