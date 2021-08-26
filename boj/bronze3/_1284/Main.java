package bronze3._1284;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        while((sb.insert(0, br.readLine()).charAt(0))!='0'){
            int total=0;

            for(int i =0; i<sb.length();i++){
                if(sb.charAt(i)=='0')
                    total += 4;
                else if(sb.charAt(i)=='1')
                    total += 2;
                else
                    total += 3;
            }

            System.out.println(total+sb.length()+1);

            sb.delete(0, sb.length());
        }
    }
}
