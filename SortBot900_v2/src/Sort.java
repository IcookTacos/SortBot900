
public class Sort {

	public static final void insertion(final int[] a, final int lo, final int hi) {
		
		//TODO: 
		//try {Thread.sleep(500);}catch(InterruptedException e) {System.out.print(e);}
		
		for (int i = lo + 1; i <= hi; i++) {
			final int val = a[i];
			int j = i;
			while (j > lo && a[j - 1] > val) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = val;
		}
		
	}
	

	public Sort() {}
}