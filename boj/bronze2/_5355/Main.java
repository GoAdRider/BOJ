package bronze2._5355;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 화성 수학

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int t = Integer.parseInt(br.readLine());
        String[] sArr;
        for (int i = 0; i < t; i++) {
            sArr=br.readLine().split(" ");
            double result=Double.parseDouble(sArr[0]);
            for (int j = 1; j < sArr.length; j++) {
                switch (sArr[j]) {
                    case "@": result*=3; break;
                    case "%": result+=5; break;
                    case "#": result-=7; break;
                }
            }
            sb.append(String.format("%.2f", result)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
