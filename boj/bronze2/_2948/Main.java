package bronze2._2948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2009년
// 요일 구하기 풀이법 참조 링크
// https://elwlsek.tistory.com/978

        // 연도 계산
        // 연도의 뒤 두자리로 계산한다. 이 문제는 2009 년 고정이기에 09년 기준으로 설명한다.
        // 1. 2009 의 뒷 두자리 수를 7의 배수로 뺌 = 9-7 = 2
        // 2. 그리고 2009 의 뒷 두자리 수를 4로 나눈 후 몫만 가져감 = 9/4 = 2.xx = 2
        // 위 1과 2를 더해주고 각 연도에 해당하는 수를 더해줌
        // 각 연도에 해당하는 수
        // (1600년대=0, 1700년대=5, 1800년대=3, 1900년대=1, 2000년대=0)
        // 2+2+0 = 4

        // 월일 계산
        // 월에 해당하는 수 
        // (1월=0, 2월=3, 3월=3, 4월=6, 5월=1, 6월=4, 7월=6, 8월=2, 9월=5, 10월=0, 11월=3, 12월=5)
        // 월 M과 일D 일때, D+(M 해당 수) 한 후 7의 배수를 뺀다.
        // ex) 10월 9일
        // 9+0 = 9
        // 9-7 = 2

        // 연도 계산과 월일 계산으로 요일 찾기
        // 요일에 해당하는 수
        // (일=1, 월=2, 화=3, 수=4, 목=5, 금=6, 토=0)
        // 2009 년 10월 09일이라면 위에서 계산한 값 4+2 = 6이니 금요일이라는 것을 알 수 있다.
        // (참고로 계산하는 년도가 윤년(leap year)이면서 1, 2월달이면 1을 빼주어야 한다.)


public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String[] strArr = br.readLine().split(" ");
        int d = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]); //월일 계산법
        int week = (d + numOfMonth(m))%7;
        week = (week+ 4)%7; // 4는 위 연도계산법의 09년도 값
        switch (week) {
            case 0: bw.write("Saturday"); break;
            case 1: bw.write("Sunday"); break;
            case 2: bw.write("Monday"); break;
            case 3: bw.write("Tuesday"); break;
            case 4: bw.write("Wednesday"); break;
            case 5: bw.write("Thursday"); break;
            case 6: bw.write("Friday"); break;
        }
        bw.flush();
        bw.close();
    }

    static int numOfMonth(int m){ // 월 해당 수 구하기
        switch(m){
            case 1: return 0;
            case 2: return 3;
            case 3: return 3;
            case 4: return 6;
            case 5: return 1;
            case 6: return 4;
            case 7: return 6;
            case 8: return 2;
            case 9: return 5;
            case 10: return 0;
            case 11: return 3;
            case 12: return 5;
        }
        return 0;
    }
}
