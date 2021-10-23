package bronze1._2954;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        sb.append(br.readLine());
        replaceWords();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void replaceWords(){
        
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' 
                || sb.charAt(i) == 'o'|| sb.charAt(i) == 'u'){
                    sb.replace(i, i+3, sb.charAt(i)+"");
            }
        }
    }
}