package bronze1._1259;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }else{
                int cnt = 0;
                String str = Integer.toString(n);
                for(int i = 0; i < str.length()/2; i++){
                    if(str.charAt(i) == str.charAt(str.length()-1-i)){
                        cnt++;
                    }
                }
                if(cnt == str.length()/2){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        scan.close();
    }
}
