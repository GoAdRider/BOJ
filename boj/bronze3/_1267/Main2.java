package bronze3._1267;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {

        int til = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = 0;
        int M = 0;
        for(int i=0;i<til;i++){
            int x = Integer.parseInt(st.nextToken());
            Y += ((x/30)+1)*10;
            M += ((x/60)+1)*15;
        }

        sb.append(Y>M? "M "+M : Y==M?"Y M "+Y:"Y "+Y);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
