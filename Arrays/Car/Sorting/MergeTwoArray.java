package Sorting;

public class MergeTwoArray 
{
	static int[] merge_two_array(int a[],int b[]) {
		int []c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while (i<a.length &&  j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
			
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}
 public static void main(String[] args) {
	int []a= {2,4,8,10,12,14};
	int []b= {3,9,15,20,24};
	
	int []c=merge_two_array(a,b);
	for(int l=0;l<c.length;l++) {
		System.out.print(c[l]+",");
	}
}
}
