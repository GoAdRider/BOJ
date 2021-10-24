package bronze1._1236;

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int colCount = 0;
        int rowCount = 0;

        boolean[] colBool = new boolean[N];
        boolean[] rowBool = new boolean[M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j)=='X') {
                    colBool[i] = true;
                    rowBool[j] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (!colBool[i]) {
                colCount++;
            }
        }

        for (int i = 0; i < M; i++) {
            if (!rowBool[i]) {
                rowCount++;
            }
        }

        bw.write(String.valueOf(rowCount>= colCount ? rowCount : colCount));
        bw.flush();
        bw.close();
    }
}
