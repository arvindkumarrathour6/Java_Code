package Pattern;

public class knum {
	public static void main(String[] args) {
		int n=4;
		int a=1;
	for (int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(a+"   ");
			a*=2;
			}
		System.out.println();
	}

for (int i=n;i>1;i--) {
	a=2;
	if(i%2!=0) {
		continue;
	}
	else {
	for(int j=i;j>1;j--) {
		System.out.print(a*4+"  ");
		a*=2;
		}
	}
	System.out.println();
}

	}
	}
