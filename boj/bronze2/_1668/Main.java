package bronze2._1668;

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
        int size = Integer.parseInt(br.readLine());
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        int fromLeftSide = intArr[0];
        int fromRightSide = intArr[size-1];
        int fromLeft = 1;
        int fromRight = 1;

        for (int i = 1; i < intArr.length; i++) {
            if(intArr[i]>fromLeftSide){
                fromLeft++;
                fromLeftSide = intArr[i];
            }
        }

        for(int i=size-1; i>=0; i--){
            if(intArr[i]>fromRightSide){
                fromRight++;
                fromRightSide = intArr[i];
            }
        }

        sb.append(fromLeft).append("\n").append(fromRight);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
