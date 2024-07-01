package programs;

public class RightRotionofarray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int j;
for(int i=0;i<3;i++) {
	int last=a[a.length-1];
	for( j=a.length-1;j>0;j--) {
		a[j]=a[j-1];
	}
	a[j]=last;
}
for(int i=0;i<a.length-1;i++) {
	System.out.println(a[i]);
}
	}

}
