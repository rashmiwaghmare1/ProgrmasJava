package programs;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
int a[]= {1,2,0,5,0,4};
int newarray[]=new int[a.length];
int count=a.length-1;
for(int num:a) {
	if(num!=0) {
		newarray[count]=num;
		count--;
	}
}
System.out.println(Arrays.toString(newarray));
	}

}
