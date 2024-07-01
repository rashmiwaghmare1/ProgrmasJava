package programs;


public class Rotationofstring {

	public static void main(String[] args) {
String string="abcd";
String string2="bcda12";
if(string.length()==(string2.length()) && string!=null && string2!=null) {
	String reString=string+string2;
	reString.contains(string2);
	System.out.println("rotation of string is present");
}
else {
	System.out.println("rotation of string is not present ");
}

	}

}
