package programs;

public class DelArray {

	public static void main(String[] args) {
int a[]= {10,20,30,40,60};
int del=30;
for(int i=0;i<a.length;i++) {
	if(a[i]==del) {
		
	
		for(int j=i;j<a.length-1;j++) {
			a[j]=a[j+1];
			
		}
	}
}
for(int i=0;i<a.length-1;i++) {
	System.out.println(a[i]);
}
}
	}
