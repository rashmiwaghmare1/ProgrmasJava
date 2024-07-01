package programs;

import java.util.Arrays;

public class ShiftZeroElementsToright {

	public static void main(String[] args) {
int a[]= {1,0,5,0,4,6,0};
int newarray[]=new int[a.length];
int count=0;
for(int b:a) {
	if(b!=0) {
		newarray[count]=b;
		count++;
	}
	
	
}
System.out.println(Arrays.toString(newarray));
	}

}
