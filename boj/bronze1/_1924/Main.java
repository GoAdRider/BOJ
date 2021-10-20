package bronze1._1924;

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
        int[] daysEachMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken())-1;
        int day = Integer.parseInt(st.nextToken());

        int sum = 0;


        for (int i = 0; i < month; i++) {
            sum+=daysEachMonth[i];
        }
        sum += day;

        switch (sum%7) {
            case 0: bw.write(String.valueOf("SUN")); break;
            case 1: bw.write(String.valueOf("MON")); break;
            case 2: bw.write(String.valueOf("TUE")); break;
            case 3: bw.write(String.valueOf("WED")); break;
            case 4: bw.write(String.valueOf("THU")); break;
            case 5: bw.write(String.valueOf("FRI")); break;
            case 6: bw.write(String.valueOf("SAT")); break;
        }
        bw.flush();
        bw.close();
    }
}