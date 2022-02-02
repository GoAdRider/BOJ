package bronze2._3040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백설공주와 일곱난쟁이

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int[] dwarfs = new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum+=dwarfs[i];
        }

        int[] wrong = wrongDwarfs(dwarfs,sum);
        for (int i = 0; i < 9; i++) {
            if(dwarfs[i]==wrong[0] || dwarfs[i]==wrong[1]) continue;
            else sb.append(dwarfs[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int[] wrongDwarfs(int[] dwarfs, int sum){
        int[] wrong = new int[2];

        loop:
        for (int i = 0; i < dwarfs.length; i++) {
            for (int j = i+1; j < dwarfs.length; j++) {
                if(sum-dwarfs[i]-dwarfs[j] ==100){
                    wrong[0] = dwarfs[i];
                    wrong[1] = dwarfs[j];
                    break loop;
                }
            }
        }
        return wrong;
    }
}
