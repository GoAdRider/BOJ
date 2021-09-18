package bronze2._1100;

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
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            if(i%2==0){
                for (int j = 0; j < 4; j++) {
                    switch(str.charAt(j*2)){
                        case 'F' : count++;
                                    break;
                        case '.' : continue;
                    }
                }
            }else{
                for (int j = 0; j < 4; j++) {
                    switch(str.charAt((j*2)+1)){
                        case 'F' : count++;
                                    break;
                        case '.' : continue;
                    }
                }
            }
        }

        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
