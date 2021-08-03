package _10757;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
 
public class Main2 {
 
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // 예제 입력 ) 6725 15648
        String []inputs = br.readLine().split(" "); 
        
        String A = inputs[0];//6725
        String B = inputs[1];//15648
 
        int len1 = A.length() - 1; // 3
        int len2 = B.length() - 1; // 4
        
        int remainder = 0 ;
        StringBuilder builder = new StringBuilder();
        
        while(len1 >= 0 || len2 >= 0) {
 
            // 문자를 정수형으로 변경.
            // 만약 현재 덧셀할 자리수를 초과 한경우 0 으로 간주한다. 
            int c1 = len1 < 0 ? c1 = 0 : A.charAt(len1) - '0'; // 5 2 7 6 0 순서로 뽑힘
            int c2 = len2 < 0 ? c2 = 0 : B.charAt(len2) - '0'; // 8 4 6 5 1 순서로 뽑힘
            
            
            int sum =  c1+c2 + remainder; // 13 7 13 12 2 순서로 계산됨
            // 자리수를 더한 값에서 몫은 다음 자리수 덧셈을 위해 저장해두고 
            // 나머지 값은 문자열에 추가해준다. 
            int c = sum%10; // 3 7 3 2 2 순서로 계산됨
            remainder = sum/10; // 1 0 1 1 0 
            /*
             
             StringBuilder 객체의 append 와 insert 차이
             
             append() : 문자열 데이터 끝에 문자의 형태로 추가
			 insert() : 첫번째 인자로 삽입될 위치 (0이 맨 앞을 의미 문자가 삽입될 위치), 두번째 인자 삽입될 문자
             
             ex)
             
             문자 "ABCD"
             위치 "(0)A(1)B(2)C(3)D(4)
             insert(2,'z')
             
             예제출력--
             "ABzCD"
             
             */
            builder.insert(0, c);//
            
            len1--; // 3 2 1 0 -1
            len2--; // 4 3 2 1 0
        }
 
        if(remainder > 0) {
            builder.insert(0, remainder);
        }
		bw.write(builder.toString());//22373
		bw.flush(); 
		bw.close();
    }
 
}