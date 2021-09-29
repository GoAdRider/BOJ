package bronze2._5988;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException  {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            BigInteger bigNum = new BigInteger(br.readLine());
            bigNum = bigNum.remainder(BigInteger.valueOf(2));
            sb.append(bigNum.toString().equals("1") ? "odd" : "even").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
