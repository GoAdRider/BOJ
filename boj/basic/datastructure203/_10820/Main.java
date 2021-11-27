package basic.datastructure203._10820;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문자열 분석
// 소문자, 대문자, 숫자, 공백의 개수
// 아스키 코드
// ' ' = 32, '0' = 48, '9' = 57
// 'A' = 65, 'Z' = 90, 'a' = 97, 'z' = 122

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
        String str;
        char[] cArr;
        int[] store;
        int asc;

        while ((str = br.readLine()) != null) {
            store= new int[4];
            cArr = str.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                asc = (int)cArr[i];
                if (asc == 32) {
                    ++store[3];
                }else if (48 <= asc && asc <= 57) {
                    ++store[2];
                }else if (65 <= asc && asc <= 90) {
                    ++store[1];
                }else {
                    ++store[0];
                }
            }
            sb.append(store[0]).append(" ")
            .append(store[1]).append(" ")
            .append(store[2]).append(" ")
            .append(store[3]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
