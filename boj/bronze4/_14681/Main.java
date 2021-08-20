package bronze4._14681;

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
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        int answer = 0;

        if(x*y>0){
            sb.append(answer=x<0? 3: 1);
        }else{
            sb.append(answer=x>y? 4: 2);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
