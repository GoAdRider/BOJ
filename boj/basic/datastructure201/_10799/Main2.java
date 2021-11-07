package basic.datastructure201._10799;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 스택 풀이

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws NumberFormatException, IOException {
        char[] charArr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') { 
                stack.push('(');
                continue;
            }else if (charArr[i] == ')') { 
                stack.pop();

                if (charArr[i-1] == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
