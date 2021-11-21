package bronze3._23037;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 5의 수난

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        char[] chr = br.readLine().toCharArray();
        int n;
        int multi;
        int result=0;
        for (int i = 0; i < chr.length; i++) {
            n = chr[i]-48;
            multi = 1;
            for (int j = 0; j < 5; j++) {
                multi*=n;
            }
            result += multi;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
