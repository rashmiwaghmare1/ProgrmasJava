package programs;


public class PrintOnlyFirstletter {

	public static void main(String[] args) {
String string="welcome to java";
String st[]=string.split(" ");
String res=" ";
for(String st2:st) {
	String first=st2.substring(0,1);
	res=res+first+" ";
}
System.out.println(res.toUpperCase());
	}

}
