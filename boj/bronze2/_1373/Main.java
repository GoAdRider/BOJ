package bronze2._1373;

// 답은 맞는 것 같으나 메모리 부족으로 인해 실패

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
        StringBuilder toOctal = new StringBuilder();
        sb.append(br.readLine());
        sb.reverse();
        while(sb.length()!=0){
            char[] charArr=new char[len(sb)];
            sb.getChars(0, charArr.length, charArr, 0);
            toOctal.append(calc(charArr));
            del(sb);
        }
        toOctal.reverse();
        bw.write(toOctal.toString());
        bw.flush();
        bw.close();
    }

    static String calc(char[] charArr) {
        int num = charArr[0]-'0';
        switch (charArr.length) {
            case 3:
                num += (charArr[2]-'0')*4;
                num += (charArr[1]-'0')*2;
                break;
            case 2:
                num += (charArr[1]-'0')*2;
                break;
        }
        return Integer.toString(num);
    }

    static int len(StringBuilder sb){
        if(sb.length()>=3){
            return 3;
        }else if(sb.length()==2){
            return 2;
        }else{
            return 1;
        }
    }

    static void del(StringBuilder sb){
        if(sb.length()>=3){
            sb.delete(0, 3);
            sb.trimToSize();
        }else{
            sb.delete(0,sb.length());
            sb.trimToSize();
        }
    }
}