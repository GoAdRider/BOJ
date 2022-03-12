package bronze1._14696;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 딱지놀이

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] sArr;
        int[] a;
        int[] b;
        int size;
        while(n-->0){
            a = new int[5];
            b = new int[5];

            sArr = br.readLine().split(" ");
            size = Integer.parseInt(sArr[0]);
            for (int i = 0; i < size; i++) {
                a[Integer.parseInt(sArr[i+1])]++;
            }

            sArr = br.readLine().split(" ");
            size = Integer.parseInt(sArr[0]);
            for (int i = 0; i < size; i++) {
                b[Integer.parseInt(sArr[i+1])]++;
            }

            boolean check = true;
            for (int i = 4; i > 0 ; i--) {
                if(a[i]!=b[i]){
                    check = false;
                    if(a[i]>b[i]) sb.append("A");
                    else sb.append("B");
                    break;
                }
            }
            if(check) sb.append("D");
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
