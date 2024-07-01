package programs;

import java.util.Scanner;

public class MatrixArrray {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter row");
int row=scanner.nextInt();
System.out.println("enter cell");
int cell=scanner.nextInt();
int data[][]=new int[row][cell];
System.out.println("enter data elements");
for(int i=0;i<row;i++) {
	for(int j=0;j<cell;j++) {
		data[i][j]=scanner.nextInt();
	}
}
System.out.println("print array elements");
for(int i=0;i<row;i++) {
	for(int j=0;j<cell;j++) {
		System.out.println(data[i][j]);
}
}
	System.out.println("print matrix array elements");
	for(int i=0;i<row;i++) {
		for(int j=0;j<cell;j++) {
			System.out.print(data[i][j]+" ");
		}
		System.out.println();
	}
}

	}


