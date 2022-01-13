package bronze2._2592;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] intArr = new int[101];
        int sum=0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum+= num;
            num/=10;
            intArr[num]++;
        }
        sb.append(sum/10).append("\n");
        int max =0;
        int idx =0;
        for (int i = 0; i < 101; i++) {
            if(max < intArr[i]){
                max = intArr[i];
                idx = i;
            }
        }
        sb.append(idx*=10);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
