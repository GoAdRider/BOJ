package bronze3._5086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 배수와 약수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        String str ="";
        String[] strArr;
        int a;
        int b;
        while (!(str=br.readLine()).equals("0 0")) {
            strArr = str.split(" ");
            a = Integer.parseInt(strArr[0]);
            b = Integer.parseInt(strArr[1]);
            if (a%b == 0) {
                System.out.println("multiple");
            } else if(b%a == 0){
                System.out.println("factor");
            }else{
                System.out.println("neither");
            }
        }
    }
}
