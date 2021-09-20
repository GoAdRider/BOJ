package bronze2._1264;

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
        String str = "";
        char[] charArr;
        while(!(str=br.readLine()).equals("#")){
            int sum = 0;
            charArr = new char[str.length()];
            charArr = str.toCharArray();
            for (char c : charArr) {
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': 
                        sum++;
                        break;
                }
            }
            sb.append(sum+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
