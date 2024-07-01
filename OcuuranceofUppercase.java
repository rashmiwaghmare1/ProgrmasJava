package programs;

public class OcuuranceofUppercase {

	public static void main(String[] args) {
String string="Welcome To Selnium with java";
int count=0;
for(int i=0;i<string.length();i++) {
	char ch=string.charAt(i);
	if(Character.isUpperCase(ch)) {
		 count++;
	}
	
}
System.out.println("Occurace of uppercase"+" "+count);
	}

}
