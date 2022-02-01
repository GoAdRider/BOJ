package bronze2._1551;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 수열의 변화

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int k = Integer.parseInt(strArr[1]);

        strArr = br.readLine().split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        while(k-->0){
            intArr = solve(intArr);
        }

        for (int i = 0; i < intArr.length-1; i++) {
            sb.append(intArr[i]).append(",");
        }
        sb.append(intArr[intArr.length-1]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static int[] solve(int[] intArr){
        int[] newArr = new int[intArr.length-1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = intArr[i+1]-intArr[i];
        }
        return newArr;
    }
}
