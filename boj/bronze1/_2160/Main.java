package bronze1._2160;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < 5; j++) {
                sb.append(br.readLine());
            }

            strArr[i] = sb.toString();
        }

        bw.write(compare(strArr, size));
        bw.flush();
        bw.close();
    }

    static String compare(String[] strArr,int size){
        int which = 36;
        String str = "";

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                int mismatchCount = 0;

                for (int k = 0; k < 35; k++) {
                    if(strArr[i].charAt(k) != strArr[j].charAt(k)){
                        mismatchCount++;
                    }
                }

                if(which > mismatchCount){
                    which = mismatchCount;
                    str = String.valueOf(i+1)+" "+String.valueOf(j+1);
                }
            }
        }

        return str;
    }
}
