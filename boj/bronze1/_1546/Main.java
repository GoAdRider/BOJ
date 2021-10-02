package bronze1._1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] dblArr = new double[size];
        double max = 0;
        double avg = 0;
        for (int i = 0; i < size; i++) {
            dblArr[i] = Integer.parseInt(st.nextToken());
            max = max < dblArr[i] ?
                    dblArr[i] : max;
        }
        for (int i = 0; i < size; i++) {
            dblArr[i] = (dblArr[i]*100)/max;
            avg += dblArr[i];
        }
        avg /= size;
        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
    }
}
