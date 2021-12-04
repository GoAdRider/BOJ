package basic.mathmatics300._1676;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 팩토리얼 0의 개수

// %힌트% - 팩토리얼 5의 배수 때마다 '0' 카운트가 1씩 늘어남
// 25의 배수는 2개씩 늘어남
// 125의 배수는 3개씩 늘어남
// ex)
// 5! 의 '0' 의 개수 = 1
// 10! 의 '0' 의 개수 = 2
// 15! 의 '0' 의 개수 = 3
// 20! 의 '0' 의 개수 = 4
// 25! 의 '0' 의 개수 = 6
// 30! 의 '0' 의 개수 = 7
// 35! 의 '0' 의 개수 = 8 ...
// 120! 의 '0' 의 개수 = 28
// 125! 의 '0' 의 개수 = 31
// 130! 의 '0' 의 개수 = 32 ...

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        count += num/125;
        count += num/25;
        count += num/5;
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
