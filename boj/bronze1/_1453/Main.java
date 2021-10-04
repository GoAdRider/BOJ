package bronze1._1453;

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
        for (int i = 0; i < size; i++) {
            Computer.seat(Integer.parseInt(st.nextToken())-1);
        }
        bw.write(String.valueOf(Computer.getCount()));
        bw.flush();
        bw.close();
    }
}

class Computer{
    private static boolean[] computers = new boolean[100];
    private static int count=0;

    static int getCount(){
        return count;
    }

    static void seat(int num){
        if(!seatCheck(num)){
            computers[num] = true;
        }else{
            count++;
        }
    }

    private static final boolean seatCheck(int num){
        return computers[num];
    }
}