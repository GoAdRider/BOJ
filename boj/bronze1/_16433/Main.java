package bronze1._16433;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 주디와 당근농장

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int n = Integer.parseInt(sA[0]);
        int r = Integer.parseInt(sA[1]);
        int c = Integer.parseInt(sA[2]);
        int check = (r+c)%2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int carrot = (i+j)%2;
                if(check == carrot) sb.append("v");
                else sb.append(".");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
