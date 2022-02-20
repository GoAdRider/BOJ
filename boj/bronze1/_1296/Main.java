package bronze1._1296;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 팀 이름 정하기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[] yuendu = br.readLine().toCharArray();
        int size = Integer.parseInt(br.readLine());
        int[] love = new int[4];
        countor(love,yuendu);

        int[] results = new int[size];
        String[] teamNames = new String[size];

        for (int i = 0; i < size; i++) {
            int[] teamLove = new int[4];
            teamNames[i] = br.readLine();
            char[] teamChar = teamNames[i].toCharArray();

            countor(teamLove, teamChar);
            loveSum(teamLove, love);

            results[i] = expression(teamLove);
        }

        bw.write(sort(results, teamNames));
        bw.flush();
        bw.close();
    }

    static String sort(int[] results, String[] teamNames){
        int max = 0;
        for (int i = 0; i < results.length; i++) {
            if(max < results[i]) max = results[i];
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < teamNames.length; i++) {
            if(max==results[i]) sb2.append(teamNames[i]).append(" ");
        }
        String[] dupl = sb2.toString().split(" ");
        Arrays.sort(dupl);
        return dupl[0];
    }
    
    static int expression(int[] teamLove){
        int a = teamLove[0]+teamLove[1];
        int b = teamLove[0]+teamLove[2];
        int c = teamLove[0]+teamLove[3];
        int d = teamLove[1]+teamLove[2];
        int e = teamLove[1]+teamLove[3];
        int f = teamLove[2]+teamLove[3];

        return (a*b*c*d*e*f)%100;
    }
    
    static void loveSum(int[] teamLove, int[] love){
        teamLove[0]+=love[0];
        teamLove[1]+=love[1];
        teamLove[2]+=love[2];
        teamLove[3]+=love[3];
    }

    static void countor(int[] love, char[] name){
        for (int i = 0; i < name.length; i++) {
            switch (name[i]) {
                case 'L': love[0]++; break;
                case 'O': love[1]++; break;
                case 'V': love[2]++; break;
                case 'E': love[3]++; break;
            }
        }
    }
}