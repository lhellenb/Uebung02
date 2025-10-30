package h2;

public class H2_main {
	public static void main(String[] args) {
		int i=5, j=-2, k=10, min=4, max=5;
		if (i<j) {
			if (i<k) {
				min=i;
				System.out.println(min);	
			}
		}
		if (j<i) {
			if (j<k) {
				min=j;
				System.out.println(min);	
			}
		}
		if (k<i) {
			if (k<j) {
				min=k;
				System.out.println(min);
			}
		}
		if (i>j) {
			if (i>k) {
				max=i;
				System.out.println(max);	
			}
		}
		if (j>i) {
			if (j>k) {
				max=j;
				System.out.println(max);	
			}
		}
		if (k>i) {
			if (k>j) {
				max=k;
				System.out.println(max);
			}
		}
	}
}
