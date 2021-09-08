package bronze3._2935;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
        BigInteger a = new BigInteger(br.readLine());
        String b = br.readLine();
        BigInteger c = new BigInteger(br.readLine());
        if(b.equals("*")){
            sb.append(a.multiply(c));
        }else{
            sb.append(a.add(c));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
