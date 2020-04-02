
public class Sort {

	static DrawingComponent d1;
	static int[] a;
	static int lo;
	static int hi;
	

	public Sort(DrawingComponent dC, final int[] a1, final int low, final int high) { 
			d1 = dC;
			lo = low;
			a = a1;
			hi = high;
		
		}
	
	
	public final void insertion() {
		Thread th = new Thread(() -> {
		for (int i = lo + 1; i <= hi; i++) {
			final int val = a[i];
			int j = i;
			while (j > lo && a[j - 1] > val) {
				a[j] = a[j - 1];
				j--;
			}
			try {Thread.sleep(350);}catch(InterruptedException e) {System.out.print(e);}
			d1.debugg();
			d1.repaint();
			a[j] = val;
		}
		});
		th.start();

	}
}