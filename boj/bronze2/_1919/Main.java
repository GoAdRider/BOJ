package bronze2._1919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 애너그램 만들기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        char[] aArr = br.readLine().toCharArray();
        char[] bArr = br.readLine().toCharArray();

        int count=0;
        for (int i = 0; i < aArr.length; i++) {
            for (int j = 0; j < bArr.length; j++) {
                if (aArr[i] == bArr[j]) {
                    aArr[i]='A';
                    bArr[j]='B';
                    ++count;
                    break;
                }
            }
        }
        int result;
        result = aArr.length - count;
        result += bArr.length - count;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
