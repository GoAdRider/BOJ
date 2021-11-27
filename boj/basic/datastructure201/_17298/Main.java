package basic.datastructure201._17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 오큰수
// 시간 초과

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[size];
        int pass = 0;
        for (int i = 0; i < size; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (intArr[i]<intArr[j]) {
                    sb.append(intArr[j]);
                    pass = 0;
                    break;
                }
                pass = 1;
            }

            if(pass==1){
                sb.append(-1);
            }
            sb.append(" ");
        }

        sb.append(-1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
