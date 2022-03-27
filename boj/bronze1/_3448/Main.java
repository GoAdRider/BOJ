package bronze1._3448;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

// 문자 인식

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        DecimalFormat df=new DecimalFormat("#.#");
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringBuilder sb2 = new StringBuilder();
            String str;
            while(!(str=br.readLine()).equals("")){
                sb2.append(str);
            }
            char[] cA = sb2.toString().toCharArray();
            double A = cA.length;
            double R = 0.0;
            for (int j = 0; j < A; j++) {
                if(cA[j]!='#') R++;
            }
            sb.append("Efficiency ratio is ").append(df.format(R/A*100.0)).append("%.\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
