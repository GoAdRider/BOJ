package bronze2._5218;

import java.util.ArrayList;
import java.util.Scanner;

// 알파벳 거리
// 출력형식으로 처리한 답

public class Main2 {

	private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            int x = s1.charAt(i)-'A'+1;
            int y = s2.charAt(i)-'A'+1;
            if(y>=x) answer.add(y-x);
            else answer.add(26+y-x);
        }
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for(Integer d : answer) {
				System.out.print(d+" ");
			}
			System.out.println();

		}
	}
}
