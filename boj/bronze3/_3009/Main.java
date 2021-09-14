package bronze3._3009;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] x = new int[3];
        int[] y = new int[3];
        int resultX = 0;
        int resultY = 0;
        for (int i = 0; i < y.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[0]-x[1]==0){
            resultX = x[2];
        }else if(x[1]-x[2]==0){
            resultX = x[0];
        }
        
        if(y[0]-y[1]==0){
            resultY = y[2];
        }else if(y[1]-y[2]==0){
            resultY = y[0];
        }

        sb.append(resultX+" "+resultY);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
