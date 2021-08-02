package _5337;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 Welcome을 예제 출력처럼 출력하는 프로그램을 작성하시오.
 
 --예제출력
.  .   .
|  | _ | _. _ ._ _  _
|/\|(/.|(_.(_)[ | )(/.


 */

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		bw.write(".  .   .\n|  | _ | _. _ ._ _  _\n|/\\|(/.|(_.(_)[ | )(/.");
		bw.flush(); 
		bw.close();
	}
}