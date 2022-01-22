package bronze2._3943;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 헤일스톤 수열

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        
        while(size-->0){
            int n = Integer.parseInt(br.readLine());
            sb.append(hailStone(n,1)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int hailStone(int n, int max){
        if(n==1) return max;
        else if(n%2==0) return hailStone(n/2, max > n ? max : n);
        else return hailStone(n*3+1, max > n ? max : n);
    }
}
