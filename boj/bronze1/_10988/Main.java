package bronze1._10988;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 팰린드롬인지 확인하기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Stack<Character> st = new Stack();
        char[] cArr = br.readLine().toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            st.push(cArr[i]);
        }

        boolean check=true;
        for (int i = 0; i < cArr.length; i++) {
            if(cArr[i]!=st.pop()){
                check = false;
                break;
            } 
        }
        if(check) System.out.print(1);
        else System.out.print(0);
    }
}