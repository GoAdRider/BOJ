package bronze1._15947;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 아기 석환 뚜루루 뚜루

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] lylics = {"baby","sukhwan","tururu","turu","very", "cute", "tururu", "turu","in", "bed", "tururu", "turu","baby","sukhwan"};
        int n = Integer.parseInt(br.readLine());
        int cycle = n/14;
        int word = (n-1)%14;
        switch (word) {
            case 2:case 6:case 10:
                sb.append("tu");
                if(cycle>2){
                    sb.append("+ru*").append(cycle+2);
                }else{
                    sb.append("ruru");
                    for (int i = 0; i < cycle; i++) {
                        sb.append("ru");
                    }
                }
                break;
            case 3:case 7:case 11:
                sb.append("tu");
                if(cycle>3){
                    sb.append("+ru*").append(cycle+1);
                }else{
                    sb.append("ru");
                    for (int i = 0; i < cycle; i++) {
                        sb.append("ru");
                    }
                }
                break;
            default:
                sb.append(lylics[word]);
                break;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
