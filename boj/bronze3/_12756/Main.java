package bronze3._12756;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 고급여관

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int aA = Integer.parseInt(sA[0]);
        int lA = Integer.parseInt(sA[1]);
        sA = br.readLine().split(" ");
        int aB = Integer.parseInt(sA[0]);
        int lB = Integer.parseInt(sA[1]);
        while(true){
            if(lA<=0) break;
            else if(lB<=0) break;
            lA -= aB;
            lB -= aA;
        }
        if(lA <= 0 && lB <= 0) sb.append("DRAW");
        else{
            if(lA > 0) sb.append("PLAYER A");
            else if(lB > 0) sb.append("PLAYER B");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
