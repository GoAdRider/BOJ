package bronze1._15312;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 이름 궁합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] alpha = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        char[] me = br.readLine().toCharArray();
        char[] her = br.readLine().toCharArray();
        int[] kunghap = new int[her.length*2];
        int j=0;
        for (int i = 0; i < her.length; i++) {
            kunghap[j] = alpha[me[i]-'A'];
            kunghap[j+1] = alpha[her[i]-'A'];
            j+=2;
        }

        int i=0;
        int len=kunghap.length;
        while(true){
            kunghap[i] = (kunghap[i]+kunghap[i+1])%10;
            
            if(i<len-2) i++;
            else{
                i=0;
                --len;
                if(len==2) break;
            } 
        }
        sb.append(kunghap[0]).append(kunghap[1]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
