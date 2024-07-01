package programs;


public class LongestWordInstatement {

	public static void main(String[] args) {
String st="welcome to java";
String st2[]=st.split(" ");
int max=0;
for(String st3:st2) {
	if(st3.length()>max) {
		max=st3.length();
		System.out.println("LOngest word"+max);
	}
}
	}

}
