package bronze2._1440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int hourNum = 0;
        int possible = 1;
        for (int i = 0; i < 3; i++) {
            int num  = Integer.parseInt(st.nextToken());
            if(num>0 && num<13){
                hourNum++;
            }else if(num>59){
                possible=0;
            }
        }

        sb.append(hourNum*2*possible);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}