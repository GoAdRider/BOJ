package bronze5._10757;

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
        String[] nums = br.readLine().split(" "); 
        
        String A = nums[0];//6725
        String B = nums[1];//15648
 
        int lenA = A.length() - 1; // 3
        int lenB = B.length() - 1; // 4
        
        int count = 0 ;
        StringBuilder sb = new StringBuilder();
        
        while(lenA >= 0 || lenB >= 0) {
 
        	
        	/*
        	char 의 특징은
        	문자를 변수에 대입하면, 문자 그대로 저장되는 것이 아니라 그문자에 해당하는 정수 값(아스키 코드값) 이 저장된다
        	
        	해결법-1)
        	A.charAt(len1)-'0'   : int 형으로 변환 됨
        	
        	해결법-2)
        	Character.getNumericValue(A.charAt(len1))
        	 : wrapper class 중 Character에 char형을 int형으로 바꾸는 메소드가 있었다. 
        	
        	 */
        	
        	// 두 숫자의 자리수가 맞지 않을 경우 
        	//ex) 6725 15648 ==> 06725 15648
            int temp1 = 
            		lenA < 0 ? temp1 = 0 : 
            			Character.getNumericValue(A.charAt(lenA)); // 5 2 7 6 0 순서로 뽑힘
            int temp2 = 
            		lenB < 0 ? temp2 = 0 : 
            			Character.getNumericValue(B.charAt(lenB)); // 8 4 6 5 1 순서로 뽑힘
            
            
            int sum =  temp1+temp2 + count; // 13 7 13 12 2 순서로 계산됨



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
            sb.insert(0, sum%10);//계속 가장 왼쪽에 숫자를 추가하게 된다.
            
            // 자릿 수 끼리의 계산이 10이 넘어갈때 받는 수 = count
            count = sum/10; // 1 0 1 1 0 
            
            lenA--; // 3 2 1 0 -1
            lenB--; // 4 3 2 1 0
        }
 
        if(count > 0) {
        	sb.insert(0, count);
        }
		bw.write(sb.toString());//22373
		bw.flush(); 
		bw.close();
    }
}