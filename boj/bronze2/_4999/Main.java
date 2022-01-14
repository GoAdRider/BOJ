package bronze2._4999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 아!

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int x = br.readLine().length()-1;
        int y = br.readLine().length()-1;
        String result = x >= y? "go":"no";
        bw.write(result);
        bw.flush();
        bw.close();
    }
}