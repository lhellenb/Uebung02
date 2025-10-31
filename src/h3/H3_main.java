package h3;

public class H3_main {
	public static void main(String[] args) {
		int i=90,j=500,k=-10;
	if (i>j) {
		if (i<201) {
			if (j<101) {
				k=1;
			}
		}
		if (i>200) {
			if (j<101) {
				k=2;
			}
			else {
				k=3;
			}
		}
	}
	if (i<j) {
		if (i<201) {
			if (j<101) {
				k=4;
			}
		}
	}
	System.out.println("Der Wert von k ist "+k);
	}

}
