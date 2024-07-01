package programs;

public class AddArrayelements {

	public static void main(String[] args) {
int a[]= {10,20,40,50,60};
int ele=30;
int pos=3;
for(int i=a.length-1;i>pos-1;i--) {
	a[i]=a[i-1];
}
a[pos-1]=ele;
System.out.println("After adding array elements");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}
