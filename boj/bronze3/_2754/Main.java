package bronze3._2754;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        sb.append(br.readLine());

        switch(sb.charAt(0)){
            case 'A':
                if(sb.charAt(1)=='+'){
                    sb.delete(0,2);
                    sb.append(4.3);
                }
                else if(sb.charAt(1)=='0'){
                    sb.delete(0,2);
                    sb.append(4.0);
                }
                else{
                    sb.delete(0,2);
                    sb.append(3.7);
                }
                break;

            case 'B':
                if(sb.charAt(1)=='+'){
                    sb.delete(0,2);
                    sb.append(3.3);
                }
                else if(sb.charAt(1)=='0'){
                    sb.delete(0,2);
                    sb.append(3.0);
                }
                else{
                    sb.delete(0,2);
                    sb.append(2.7);
                }
                break;
            case 'C':
                if(sb.charAt(1)=='+'){
                    sb.delete(0,2);
                    sb.append(2.3);
                }
                else if(sb.charAt(1)=='0'){
                    sb.delete(0,2);
                    sb.append(2.0);
                }
                else{
                    sb.delete(0,2);
                    sb.append(1.7);
                }
                break;
            case 'D':
                if(sb.charAt(1)=='+'){
                    sb.delete(0,2);
                    sb.append(1.3);
                }
                else if(sb.charAt(1)=='0'){
                    sb.delete(0,2);
                    sb.append(1.0);
                }
                else{
                    sb.delete(0,2);
                    sb.append(0.7);
                }
                break;
            default:
                    sb.deleteCharAt(0);
                    sb.append(0.0);
                    break;
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
    }
}