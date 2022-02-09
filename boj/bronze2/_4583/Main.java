package bronze2._4583;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 거울상

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args)throws IOException  {
        StringBuilder sbMain = new StringBuilder();
        String str;
        while(!(str=br.readLine()).equals("#")){
            sbMain.append(charChecker(str)).append("\n");
        }
        bw.write(sbMain.toString());
        bw.flush();
        bw.close();
    }

    static String charChecker(String str){
        StringBuilder sb = new StringBuilder();
        int size = str.length();
        char[] cArr = new char[size];
        
        for (int i = 0; i < size; i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'b':
                    cArr[size-i-1] = 'd';
                    break;
                case 'd':
                    cArr[size-i-1] = 'b';
                    break;
                case 'p':
                    cArr[size-i-1] = 'q';
                    break;
                case 'q':
                    cArr[size-i-1] = 'p';
                    break;
                    
                case 'i': case 'o': case 'v': case 'w': case 'x': cArr[size-i-1] = c; break;
            
                default: return "INVALID";
            }
        }

        for (int i = 0; i < cArr.length; i++) {
            sb.append(cArr[i]);
        }
        return sb.toString();
    }
}
