package basic.datastructure201._17413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    public static void main(String[] args) throws IOException {
        ReverseStr rStr = new ReverseStr();
        rStr.splitStr(br.readLine());
        bw.write(rStr.output());
        bw.flush();
        bw.close();
    }
}

class ReverseStr{
    private StringBuilder sb = new StringBuilder();

    protected String output(){
        return sb.toString();
    }

    protected void splitStr(String str){    // 입력받은 문자열 나누기
        int len = str.length();
        char[] charArr = str.toCharArray();
        boolean openChevron = false;        // '<' 체크
        boolean closeChevron = false;       // '>' 체크
        int startWith = 0;
        int endWith = 0;
        int tempIdx=0;

        for (int i = 0; i < len; i++) {
            if (charArr[i]=='<') {
                if(closeChevron){
                    endWith = i;
                    transferStr(str.substring(startWith, endWith));
                    closeChevron = false;
                }
                tempIdx = i;
                openChevron = true;
            }else if(charArr[i]=='>'){                        // <> 꺽새 안쪽 처리
                closeChevron = false;
                if(openChevron){
                    startWith = tempIdx;
                    endWith = i+1;
                    transferStr(str.substring(startWith, endWith));
                    startWith = endWith;
                    openChevron = false;
                    closeChevron = true;
                }
            }else if(!openChevron && charArr[i]==' '){                      // <> 꺽새 사이에 있는 공백이 아닌 split 해야하는 공백
                endWith = i;
                transferStr(str.substring(startWith, endWith));
                
                sb.append(" ");
                startWith = endWith+1;
            }else if(!openChevron && i==len-1){                             // 마지막 단어 처리
                endWith = i+1;
                transferStr(str.substring(startWith, endWith));
            }
        }
    }

    protected void transferStr(String str){    // <>, (space) 분리된 단어들 분배
        char a = str.charAt(0);
        char b = str.charAt(str.length()-1);

        if (a =='<' && b == '>') {
            if (str.length()<5) {
                reverse(str);
            }else{
                sb.append(str);
            }
        }else{
            reverse(str);
        }
    }

    protected void reverse(String str){// 분배된 문자열 뒤집기
        int size = str.length();
        char[] charArr = str.toCharArray();

        for (int i = size-1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
    }
}
