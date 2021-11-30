package basic.datastructure203._11656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 접미사 배열

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        int size = str.length();
        String[] strArr = new String[size];

        for (int i = 0; i < size; i++) {
            strArr[i] = str.substring(i, size);
        }

        Arrays.sort(strArr);

        for (String suffix : strArr) {
            sb.append(suffix).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
