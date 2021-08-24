package bronze4._17362;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
	public static void main(String[] args) throws IOException { 
        long n = Long.parseLong(br.readLine())%8;

        if(n==1)
            sb.append("1");
        else if(n==2 || n==0)
            sb.append("2");
        else if(n==3 || n==7)
            sb.append("3");
        else if(n==4 || n==6)
            sb.append("4");
        else
            sb.append("5"); 

        
        bw.flush();
        bw.close();
    }
}
