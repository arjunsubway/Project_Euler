
public class Problem21 {
	
	public static void main(String[] args) {
		
		long sum = 0;
		
		for(int i = 0; i < 10000; i++) {
			if(isAmicable(i))
				sum += i;
		}
		
		System.out.println(sum);
	}
	
	
	public static boolean isAmicable(int a) {
		int b = factorsum(a);
		int c = factorsum(b);
		
		if(a == c && b != c)
			return true;
		
		else
			return false;
	}
	
	
	public static int factorsum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0)
				sum += i;
		}
		
		return sum;
	}
	
	
	
	
	

}

