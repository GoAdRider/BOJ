package bronze1._2755;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 이번학기 평점은 몇점?

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[][] sArr = new String[n][3];
        double sum = 0.00;
        double multi=0;
        for (int i = 0; i < n; i++) {
            sArr[i] = br.readLine().split(" ");
            double a = Double.parseDouble(sArr[i][1]);
            sum+=a;
            multi+=a*solvor(sArr[i][2]);
        }
        bw.write(String.format("%.2f",multi/sum));
        bw.flush();
        bw.close();
    }

    private static double solvor(String record){
        switch (record) {
            case "A+": return 4.3; case "A0": return 4.0; case "A-": return 3.7;
            case "B+": return 3.3; case "B0": return 3.0; case "B-": return 2.7;
            case "C+": return 2.3; case "C0": return 2.0; case "C-": return 1.7;
            case "D+": return 1.3; case "D0": return 1.0; case "D-": return 0.7;
            case "F" : return 0.0;
        }
        return 0.0;
    }
}