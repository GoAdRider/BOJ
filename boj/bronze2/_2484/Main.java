package bronze2._2484;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        int maxPrice = 0;
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] intArr = new int[4];
            for (int j = 0; j < 4; j++) {
                intArr[j] = Integer.parseInt(st.nextToken());
            }
            int temp = dice(intArr);
            maxPrice = maxPrice > temp ?
                        maxPrice : temp;
        }
        sb.append(maxPrice);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int dice(int[] intArr){
        Arrays.sort(intArr);
        if(intArr[0] == intArr[3]){
            return 50000+(intArr[0])*5000;
        }else if(intArr[0] == intArr[2] || intArr[1] == intArr[3]){
            return 10000+ (intArr[1])*1000;
        }else if(intArr[0] == intArr[1] && intArr[2] == intArr[3]){
            return 2000+(intArr[0])*500+(intArr[2])*500;
        }else if(intArr[0] == intArr[1] || intArr[1] == intArr[2] || intArr[2] == intArr[3]){
            if(intArr[0] == intArr[1] || intArr[1] == intArr[2])
                return 1000+(intArr[1])*100;
            else
                return 1000+(intArr[2])*100;
        }else{
            return (intArr[3])*100;
        }
    }
}