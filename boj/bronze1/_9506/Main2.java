package bronze1._9506;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    private static String notPerf = " is NOT perfect.";
    public static void main(String[] args) throws IOException {
        int n;
        while((n=Integer.parseInt(br.readLine()))!=-1){
            sb.append(n);
            switch (n) {
                case 6: sb.append(" = 1 + 2 + 3"); break;
                case 28: sb.append(" = 1 + 2 + 4 + 7 + 14"); break;
                case 496: sb.append(" = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248"); break;
                case 8128: sb.append(" = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064"); break;
                default: sb.append(notPerf); break;
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
