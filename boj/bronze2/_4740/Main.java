package bronze2._4740;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 거울, 오! 거울

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String str;
        while(!(str=br.readLine()).equals("***")){
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.reverse();
            sb.append(sb2).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}