package bronze1._17363;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 우유가 넘어지면?

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int x = Integer.parseInt(sA[0]); // 행 -> 열
        int y = Integer.parseInt(sA[1]); // 열 -> 행
        char[][] joke = new char[x][y];
        for (int i = 0; i < x; i++) {
            joke[i] = br.readLine().toCharArray();
        }

        for (int i = y-1; i >= 0; i--) {
            for (int j = 0; j < x; j++) {
                switch (joke[j][i]) {
                    case '-': sb.append("|"); break;
                    case '|': sb.append("-"); break;
                    case '/': sb.append("\\"); break;
                    case '\\': sb.append("/"); break;
                    case '^': sb.append("<"); break;
                    case '<': sb.append("v"); break;
                    case 'v': sb.append(">"); break;
                    case '>': sb.append("^"); break;
                    default: sb.append(joke[j][i]); break;
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
