package bronze2._5656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 비교 연산자

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder(); 
    public static void main(String[] args)throws IOException  {
        String[] sArr=br.readLine().split(" ");
        int i=1;
        while(!sArr[1].equals("E")){
            sb.append("Case ").append(i).append(": ");
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[2]);
            switch (sArr[1]) {
                case ">": sb.append(a>b); break;
                case ">=": sb.append(a>=b); break;
                case "<": sb.append(a<b); break;
                case "<=": sb.append(a<=b); break;
                case "==": sb.append(a==b); break;
                case "!=": sb.append(a!=b); break;
            }
            sb.append("\n");
            sArr=br.readLine().split(" ");
            i++;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
