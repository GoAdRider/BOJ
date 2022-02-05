package bronze2._2495;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 연속 구간

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        for (int i = 0; i < 3; i++) {
            char[] cArr = br.readLine().toCharArray();
            boolean[] boolArr = new boolean[cArr.length];
            sb.append(solve(cArr, boolArr)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int solve(char[] cArr, boolean[] boolArr){
        int[] store = new int[2];
        for (int i = 1; i < cArr.length; i++) {
            if(cArr[i]==cArr[i-1]){
                boolArr[i]=true;
            } 
        }

        for (int i = 1; i < boolArr.length; i++) {
            if(boolArr[i]) store[1]++;
            else{
                store[0] = store[0] > store[1] ? store[0] : store[1];
                store[1]=0;
            }
        }
        store[0] = store[0] > store[1] ? store[0] : store[1];
        
        if(store[0]==0) return 1;
        return store[0]+1;
    }
}