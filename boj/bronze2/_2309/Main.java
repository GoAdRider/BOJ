package bronze2._2309;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] intArr = new int[9];
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
            total+=intArr[i];
        }
        process(intArr, total);
        for (int i = 2; i < intArr.length; i++) {
            sb.append(intArr[i]+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void process(int[] intArr, int total){
        loop:
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if (total-intArr[i]-intArr[j]==100){
                    intArr[i] = 0;
                    intArr[j] = 0;
                    Arrays.sort(intArr);
                    break loop;
                }
            }
        }
    }
}
