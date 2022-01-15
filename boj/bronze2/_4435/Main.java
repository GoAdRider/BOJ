package bronze2._4435;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 중간계 전투

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        int[] goodP = {1,2,3,3,4,10};
        int[] evilP = {1,2,2,2,3,5,10};
        for (int i = 1; i <= size; i++) {
            String[] goodU = br.readLine().split(" ");
            String[] evilU = br.readLine().split(" ");
            int goodSum=0;
            int evilSum=0;
            int point;
            for (int j = 0; j < goodU.length; j++) {
                point = Integer.parseInt(goodU[j]);
                goodSum += point*goodP[j];
            }
            for (int j = 0; j < evilU.length; j++) {
                point = Integer.parseInt(evilU[j]);
                evilSum += point*evilP[j];
            }

            sb.append("Battle ").append(i).append(": ");
            if (goodSum == evilSum) {
                sb.append("No victor on this battle field");
            } else if(goodSum > evilSum){
                sb.append("Good triumphs over Evil");
            }else {
                sb.append("Evil eradicates all trace of Good");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
