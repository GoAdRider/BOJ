package bronze2._2857;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// FBI

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String str;
        for (int i = 1; i <= 5; i++) {
            str = br.readLine();
            int size = str.length();
            for (int j = 2; j < size; j++) {
                char c = str.charAt(j);
                if(c=='I'){
                    c= str.charAt(j-1);
                    if(c=='B'){
                        c= str.charAt(j-2);
                        if(c=='F'){
                            sb.append(i).append(" ");
                            break;
                        }
                    }
                }
            }
        }
        if(sb.length()==0) sb.append("HE GOT AWAY!");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
