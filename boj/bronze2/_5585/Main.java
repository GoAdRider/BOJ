package bronze2._5585;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 거스름돈

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int change = 1000-Integer.parseInt(br.readLine());
        int count=0;
        if(change>=500){
            count++;
            change%=500;
        }
        if(change>=100){
            count += change/100;
            change%=100;
        }
        if(change>=50){
            count++;
            change%=50;
        }
        if(change>=10){
            count += change/10;
            change%=10;
        }
        if(change>=5){
            count++;
            change%=5;
        }
        count+=change;

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}