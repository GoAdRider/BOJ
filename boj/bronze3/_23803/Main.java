package bronze3._23803;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 골뱅이 찍기 - ㄴ

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException  {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size*5; i++) {
            for (int j = 0; j < size*5; j++) {
                if(i>=size*5-size || j<size){
                    sb.append("@");
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
