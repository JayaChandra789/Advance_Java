package javaAdvance;
import java.util.*;

class TreeSetExamples //having Qualities of Natural sorting for integer Ascending order or for char Alphabetical order
{
	public void treeSetInterface()
	{
		TreeSet<Integer> obj1 = new TreeSet<>();
		System.out.println("----------------------------------------------------------");
		System.out.println("With out any sorting In TreeSet natural jion is performed");
		obj1.add(5);
		obj1.add(4);
		obj1.add(3);
		obj1.add(1);
		obj1.add(2);
		System.out.println(obj1);
		System.out.println("----------------------------------------------------------");
	}
	public void treeSetExapmle()
	{
		TreeSet<String> obj2 = new TreeSet<>();
		System.out.println("----------------------------------------------------------");
		System.out.println("With out any sorting In TreeSet natural jion is performed");
		obj2.add("World");
		obj2.add("Hai");
		obj2.add("Apple");
		obj2.add("Cat");
		obj2.add("Juice");
		System.out.println(obj2);
		System.out.println("----------------------------------------------------------");
	}
}
public class TreeSetExample 
{
	public static void main(String[] args)
	{
		TreeSetExamples obj3 = new TreeSetExamples();
		obj3.treeSetInterface();
		obj3.treeSetExapmle();
	}
}
