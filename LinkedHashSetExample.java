package javaAdvance;
import java.util.*;

class LinkedHashSetExamples
{ //HashSet class and LinkedHashSet class Wont allow sorting and also no duplications are allowed
	//These are implemented from Set Interface Extended from Collection Interface Extended from Iterable interface
	public void LinkedHashSetInt()
	{
		LinkedHashSet<Integer> obj1 = new LinkedHashSet<>();
		obj1.add(2);
		obj1.add(1);
		obj1.add(4);
		obj1.add(1); //Accept to add data but it wont printed in both classes of unsorted set Interface.
		System.out.println(obj1);
	}
	public void linkedHashSetString()
	{
		HashSet<String> obj2 = new HashSet<>();
		obj2.add("Jaya");
		obj2.add("Apple");
		obj2.add("Apple");//Accept to add data but it wont printed in both classes of unsorted set Interface.
		obj2.add("Jordan");
		System.out.println(obj2);
	}
}
public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSetExamples obj3 = new LinkedHashSetExamples();
		obj3.LinkedHashSetInt();
		obj3.linkedHashSetString();
	}
}
