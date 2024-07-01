package programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance_of_DuplicateChar {

	public static void main(String[] args) {
String string="Welcome to java";

HashMap<Character, Integer>map=new HashMap<>();

for(int i=0;i<string.length();i++) {
	char ch=string.charAt(i);
	if(map.containsKey(ch)) {
		map.put(ch, map.get(ch)+1);
	}
	else {
		map.put(ch, 1);
	}
}
Set<Entry<Character,Integer>> set=map.entrySet();
for(Entry<Character, Integer> s:set) {
	if(s.getValue()>1) {
		System.out.print(s.getKey()+":"+s.getValue()+" ");
	}
}


	}

}
