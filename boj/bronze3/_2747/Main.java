package bronze3._2747;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 피보나치 수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException  {
        int n = Integer.parseInt(br.readLine());
        int result = fiboTail(n,0,1);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int fiboTail(int n, int previous, int next){
        if (n == 0) return previous;
        else return fiboTail(n - 1, next, previous + next);
    }
}
