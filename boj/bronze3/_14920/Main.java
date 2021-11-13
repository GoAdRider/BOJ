package bronze3._14920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = Integer.parseInt(br.readLine());
    	int cnt = 1;
        while(true)
        {
        	if(num == 1) break;
            num = num%2 == 0 ?
                num/2 : num*3+1;
            cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        
	}
}
