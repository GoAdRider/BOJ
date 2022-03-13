package bronze1._4641;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// Doubles

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String str;
        String[] sArr;
        while(!(str=br.readLine()).equals("-1")){
            sArr=str.split(" ");
            int size = sArr.length-1;
            int[] intArr = new int[size];
            for (int i = 0; i < size; i++) {
                intArr[i] = Integer.parseInt(sArr[i]);
            }
            Arrays.sort(intArr);
            int count=0;
            for (int i = 0; i < intArr.length; i++) {
                for (int j = i+1; j < intArr.length; j++) {
                    if(intArr[i]*2 == intArr[j]){
                        count++;
                        break;
                    } 
                }
            }
            sb.append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
