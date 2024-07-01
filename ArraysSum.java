package programs;

import java.util.Arrays;

import javax.lang.model.type.ArrayType;

public class ArraysSum {

	public static void main(String[] args) {
int a[]= {10,20,30,40};
System.out.println(Arrays.stream(a).sum());
int sum=0;
for(int b:a) {
	sum=sum+b;
}
System.out.println(sum);
//3rd approach
int sum1=Arrays.stream(a).reduce((x, y)->x+y).getAsInt();
System.out.println(sum1);
int sum4=Arrays.stream(a).reduce(Integer::sum).getAsInt()
;
System.out.println(sum4);
System.out.println(Arrays.stream(a).summaryStatistics().getSum());

}

}
