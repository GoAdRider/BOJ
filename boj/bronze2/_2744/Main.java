package bronze2._2744;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 대소문자 바꾸기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        char[] cArr = br.readLine().toCharArray();
        
        for(int i=0; i<cArr.length; i++){
            if(cArr[i] >= 97){
                cArr[i]-=32;
            }else{
                cArr[i]+=32;
            }
            System.out.print(cArr[i]);
        }
    }
}