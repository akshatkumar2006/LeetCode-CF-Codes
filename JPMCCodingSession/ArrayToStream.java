package JPMCCodingSession;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 34, 45, 24, 65, 234, 45};
		Arrays.stream(arr)
			.filter(ele -> ele%2 == 0)
			.forEach(System.out::println);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
//		int result = 0;
//		for(int ele : arr) {
//			result+=ele;
//		}
//		System.out.println(result);
//		Arrays.stream()
//		long count = Arrays.stream(arr)
//				.distinct().count();
//		System.out.println(count);
		
		// sum of odd
		int sumOdd = Arrays.stream(arr)
				.filter(ele -> ele%2 != 0)
				.sum();
		System.out.println(sumOdd);
		
		int maxx = Arrays.stream(arr)
				.max().orElse(-1);
		System.out.println(maxx);
		
		IntStream stream = Arrays.stream(arr);
//		int minn = stream.min().orElse(-1);
		OptionalInt minn = stream.min();
		System.out.println(minn.getAsInt());
		
		Arrays.stream(arr).sorted().forEach(ele -> System.out.println(ele));
		
		String[] strarr = {"23", "45", "15"};
		sumOdd = Arrays.stream(strarr)
				.mapToInt(Integer::parseInt)
				.filter(ele -> ele%2 != 0)
				.sum();
		System.out.println(sumOdd);
		
		
	}

}
