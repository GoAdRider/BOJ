package bronze2._5363;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 요다

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int n = Integer.parseInt(br.readLine());
        String[] sArr;
        for (int i = 0; i < n; i++) {
            sArr = br.readLine().split(" ");
            for (int j = 2; j < sArr.length; j++) {
                sb.append(sArr[j]).append(" ");
            }
            sb.append(sArr[0]).append(" ").append(sArr[1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
