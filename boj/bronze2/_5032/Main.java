package bronze2._5032;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 탄산 음료

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String[] strArr = br.readLine().split(" ");
        int e = Integer.parseInt(strArr[0]);
        int f = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);
        int bottles = e+f;
        int drink;
        int result = 0;
        while(bottles>=c){
            drink = bottles/c;
            result += drink;
            bottles = (bottles%c)+drink;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}