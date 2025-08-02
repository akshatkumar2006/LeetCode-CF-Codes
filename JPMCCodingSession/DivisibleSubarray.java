package JPMCCodingSession;

public class DivisibleSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 6};
		System.out.println(countSubarray(arr, arr.length));
	}
	static long countSubarray(int[] arr, int k) {
		int n = arr.length;
		long[] freq = new long[k];
		long sum = 0;
		freq[0] = 1;
		for(int i = 0; i<n; i++) {
			sum+=arr[i];
			int rem = (int)sum%k;
			if(rem<0) {
				rem+=n; // -ve rem
			}
			freq[rem]++;
		}
		long count = 0;
		for(int i = 0; i<k; i++) {
			if(freq[i]>=2) {
				long x = freq[i];
				count+=(x * (x - 1))/2; //nC2
			}
		}
		return count;
	}

}
