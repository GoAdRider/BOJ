package bronze1._1110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException  {
        String initialStr = br.readLine();
        int resultInt = Integer.parseInt(initialStr);
        int sum = -1;
        int count=0;
        while(sum!=resultInt){
            char firLastNum = initialStr.charAt(initialStr.length()-1);
            String processSum = initialStr.length()==1 
                                    ? "0"+initialStr
                                        : Integer.toString((initialStr.charAt(0)-'0')+(firLastNum-'0'));

            String firstNum = String.valueOf(firLastNum);
            String secNum = String.valueOf(processSum.charAt(processSum.length()-1));

            initialStr = firstNum + secNum;
            sum = Integer.parseInt(initialStr);
            count++;
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
