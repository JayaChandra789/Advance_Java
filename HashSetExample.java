package javaAdvance;
import java.util.*;

class HashSetExamples
{ //HashSet class and LinkedHashSet class Wont allow sorting and also no duplications are allowed
 //These are implemented from Set Interface Extended from Collection Interface Extended from Iterable interface
	public void hashSetInt()
	{
		HashSet<Integer> obj1 = new HashSet<>();
		obj1.add(2);
		obj1.add(1);
		obj1.add(4);
		obj1.add(4);
		obj1.add(3);
		System.out.println(obj1);
	}
	public void hashSetString()
	{
		HashSet<String> obj2 = new HashSet<>();
		obj2.add("Jaya");
		obj2.add("Jaya");
		obj2.add("Apple");
		obj2.add("Tommy");
		obj2.add("Jordan");
		System.out.println(obj2);
	}
}
public class HashSetExample 
{
	public static void main(String[] args) 
	{
		HashSetExamples obj3 = new HashSetExamples();
		obj3.hashSetInt();
		obj3.hashSetString();
	}
}
