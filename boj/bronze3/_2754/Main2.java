package bronze3._2754;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        sb.append(br.readLine());
        char[] charArr = new char[3];
        charArr[1]='.';
        grade(sb,charArr);
        for(int i=0; i<charArr.length;i++){
            System.out.print(charArr[i]);
        }
    }

    static void grade(StringBuffer sb, char[] charArr){
        char plusOrminus = 0;
        if(sb.length()!=1)
            plusOrminus = plusPoint(sb.charAt(1),charArr);

        
        if(plusOrminus=='-'){
            switch (sb.charAt(0)) {
                case 'A':
                    charArr[0]='3';
                    break;
                case 'B':
                    charArr[0]='2';
                    break;
                case 'C':
                    charArr[0]='1';
                    break;
                case 'D':
                    charArr[0]='0';
                    break;
            }

        }else{
            switch (sb.charAt(0)) {
                case 'A':
                    charArr[0]='4';
                    break;
                case 'B':
                    charArr[0]='3';
                    break;
                case 'C':
                    charArr[0]='2';
                    break;
                case 'D':
                    charArr[0]='1';
                    break;
                default:
                    charArr[0]='0';
                    charArr[2]='0';
                    break;
            }
        }
    }

    static Character plusPoint(char cha,char[] charArr){
        char plusOrminus=0;
        switch (cha) {
            case '+':
            charArr[2]='3';
            break;
            case '0':
            charArr[2]='0';
            break;
            
            default:
            plusOrminus='-';
            charArr[2]='7';
            break;
        }
        return plusOrminus;
    }
}
