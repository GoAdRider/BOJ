package _5339;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*

 
 마이크로소프트 로고를 예제 출력처럼 출력하는 프로그램을 작성하시오.
 
 
 
 --예제출력
      /~\
    ( oo|
    _\=/_
   /  _  \
  //|/.\|\\
 ||  \ /  ||
============
|          |
|          |
|          |


 */

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		bw.write("     /~\\\n    ( oo|\n    _\\=/_\n   /  _  \\\n  //|/.\\|\\\\\n ||  \\ /  ||\n============\n|          |\n|          |\n|          |");
		bw.flush(); 
		bw.close();
	}
}
