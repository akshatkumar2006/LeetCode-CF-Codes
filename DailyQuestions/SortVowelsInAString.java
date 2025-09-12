package DailyQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class SortVowelsInAString {
	class Solution {
	    public String sortVowels(String s) {
	        ArrayList<Character> ll = new ArrayList<>();
	        for(int i = 0; i < s.length(); i++){
	            char c = s.charAt(i);
	            switch (c) {
	                case 'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U':
	                    ll.add(c);
	            }
	        }

	        Collections.sort(ll);

	        StringBuilder sb = new StringBuilder();
	        int idx = 0;
	        for(int i = 0; i < s.length(); i++){
	            char ch = s.charAt(i);
	            switch (ch) {
	                case 'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U':
	                    sb.append(ll.get(idx));
	                    idx++;
	                    break;
	                default:
	                    sb.append(ch);
	            }
	        }

	        return sb.toString();
	    }
	}
}
