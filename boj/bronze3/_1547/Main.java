package bronze3._1547;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int til = Integer.parseInt(br.readLine());
        sb.append("1B");

        for(int i=0; i<til; i++){
            char ball = sb.charAt(0);
            String str =  br.readLine();
            char x = str.charAt(0);
            char y = str.charAt(2);
            if(ball==x){
                sb.deleteCharAt(0);
                sb.insert(0,y);
            }else if(ball==y){
                sb.deleteCharAt(0);
                sb.insert(0,x);
            }
        }
        bw.write(sb.charAt(0));
        bw.flush();
        bw.close();
    }
}