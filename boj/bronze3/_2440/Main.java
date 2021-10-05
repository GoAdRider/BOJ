package bronze3._2440;

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
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
