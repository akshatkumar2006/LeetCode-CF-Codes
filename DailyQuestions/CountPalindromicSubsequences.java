package DailyQuestions;

import java.util.ArrayList;

public class CountPalindromicSubsequences {
	public static void main(String[] args) {
		System.out.println(countPalindromes("103301"));
	}
	public static int countPalindromes(String s) {
		ArrayList<String> ll = new ArrayList<>();
//		StringBuilder sb = new StringBuilder();

		subsequences(s, "", ll);
//		System.out.println(s);
		System.out.println(ll);
		return 2;
	}

	public static void subsequences(String s, String ans, ArrayList<String> ll) {
		if (s.length() == 0) {
			ll.add(ans);
			return;
		}
		char ch = s.charAt(0);
		subsequences(s.substring(1), ans+ch, ll);
		subsequences(s.substring(1), ans, ll);
	}
}
