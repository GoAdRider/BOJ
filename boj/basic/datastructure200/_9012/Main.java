package basic.datastructure200._9012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            char[] charArr = br.readLine().toCharArray();
            double sum=0.0;
            boolean check = true;

            for (int j = 0; j < charArr.length; j++) {
                double component =charArr[j]-40.5;
                sum += component;
                if (sum>0) {
                    check = false;
                    break;
                }
            }

            if (check && sum==0) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
