package bronze2._7567;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 그릇

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException  {
        char[] cArr = br.readLine().toCharArray();
        int size = cArr.length;
        int count=10;
        for (int i = 1; i < size; i++) {
            if(cArr[i-1] == cArr[i]){
                count+=5;
            }else{
                count+=10;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}