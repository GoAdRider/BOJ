package bronze3._3028;

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
        String str = new String(br.readLine());
        char ballPlace = '1';

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':{
                    if(ballPlace=='1')
                        ballPlace = '2';
                    else if(ballPlace=='2')
                        ballPlace = '1';
                    break;
                }
                case 'B':{
                    if(ballPlace=='2')
                        ballPlace = '3';
                    else if(ballPlace=='3')
                        ballPlace = '2';
                    break;
                }
                case 'C':{
                    if(ballPlace=='1')
                        ballPlace = '3';
                    else if(ballPlace=='3')
                        ballPlace = '1';
                    break;
                }
            }
        }
        bw.write(ballPlace);
        bw.flush();
        bw.close();
    }
}
