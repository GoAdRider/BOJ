package bronze2._1350;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 진짜 공간

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        long[] files = new long[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            files[i] = Integer.parseInt(st.nextToken());
        }
        
        int cluster = Integer.parseInt(br.readLine());
        sb.append(disk(files,cluster));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static long disk(long[] files, int cluster){
        long result=0;
        for (int i = 0; i < files.length; i++) {
            if(files[i]>cluster){
                long times = files[i] / cluster;
                files[i] %= cluster;
                result += cluster * times;
            }

            if(files[i]>0){
                result += cluster;
            }
        }
        return result;
    }
}
