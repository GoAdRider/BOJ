package bronze2._5691;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 평균 중앙값 문제

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder(); 
    public static void main(String[] args)throws IOException  {
        String str;
        String[] sArr;
        while(!(str=br.readLine()).equals("0 0")){
            sArr = str.split(" ");
            int x = Integer.parseInt(sArr[0]);
            int y = Integer.parseInt(sArr[1]);
            int temp = y-x;
            sb.append(x-temp).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}