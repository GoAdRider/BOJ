package bronze1._1032;

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
        String[] strArr = new String[size];

        for (int i = 0; i < size; i++) {
            strArr[i] = br.readLine();
        }

        boolean dif = false;
        int len = strArr[0].length();
        size = size-1;

        for (int i = 0; i < len; i++) {
            dif = false;

            for (int j = 0; j < size; j++) {
                if (strArr[j].charAt(i) != strArr[j + 1].charAt(i)) {
                    dif = true;
                    break;
                }
            }

            if (dif)
                sb.append("?");
            else
                sb.append(strArr[0].charAt(i));
        }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
    }
}
