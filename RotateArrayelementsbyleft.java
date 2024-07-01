package programs;

public class RotateArrayelementsbyleft {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int j;
for(int i=0;i<3;i++) {
	int first=a[0];
	for( j=0;j<a.length-1;j++) {
		a[j]=a[j+1];
	}
	a[j]=first;
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	
	}

}
