package bronze2._3059;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 등장하지 않는 문자의 합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int total=2015;
        int size=Integer.parseInt(br.readLine());
        char[] cArr;
        boolean[] flag;
        for (int i = 0; i < size; i++) {
            cArr = br.readLine().toCharArray();
            flag = new boolean[26];
            int sum=0;
            for (int j = 0; j < cArr.length; j++) {
                int num = cArr[j]-'A';
                if(!flag[num]){
                    flag[num]=true;
                    sum+=cArr[j];
                } 
            }
            sb.append(total-sum).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}