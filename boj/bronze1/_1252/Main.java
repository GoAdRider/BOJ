package bronze1._1252;

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
        String firstStr = st.nextToken();
        String secondStr = st.nextToken();

        int firstNumLen = firstStr.length();
        int secondNumLen = secondStr.length();

        if(firstStr.charAt(0)=='0'){
            for (int i = 0; i < firstNumLen; i++) {
                if(firstStr.charAt(i)=='1'){
                    firstStr = firstStr.substring(i, firstNumLen);
                    break;
                }else if(i==(firstNumLen-1) && firstStr.charAt(i)=='0' ){
                    firstStr = "0";
                }
                
            }
        }
        
        if(secondStr.charAt(0)=='0'){
            for (int i = 0; i < secondNumLen; i++) {
                if(secondStr.charAt(i)=='1'){
                    secondStr = secondStr.substring(i, secondNumLen);
                    break;
                }else if(i==(secondNumLen-1) && secondStr.charAt(i)=='0' ){
                    secondStr = "0";
                }
                
            }
        }
        
        firstNumLen = firstStr.length();
        secondNumLen = secondStr.length();

        int add = 0;
        while (true) {
            if(firstNumLen<1 && secondNumLen<1){
                if(add==1)
                    sb.insert(0,add);
                break;
            }
            int first;
            int second;
            int sum;

            if(firstNumLen<1){
                second = secondStr.charAt((secondNumLen--)-1)-'0';
                sum = second+add;
            }else if(secondNumLen<1){
                first = firstStr.charAt((firstNumLen--)-1)-'0';
                sum = first+add;
            }else{
                first = firstStr.charAt((firstNumLen--)-1)-'0';
                second = secondStr.charAt((secondNumLen--)-1)-'0';
                sum = first+second+add;
            }

            if(sum/2==1){
                add = 1;
                sb.insert(0,sum%2);
            }else{
                add = 0;
                sb.insert(0,sum%2);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
