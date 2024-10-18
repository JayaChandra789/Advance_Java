package javaAdvance;
import java.util.*;
/*Collection: is a collection of group of objects*/
/*FrameWork: is a pre-defined architecture which we can use without writing code, 
 using Classes like ArrayList,LinkedList*/

/*Type Safety: To catch errors at compile-time instead of runtime("Not Using TypeSafety: In other words typeSafety 
 * are for example using Class ArrayList we can many dataTypes and retrieve without typeCasting Explicitly 
 * but sometimes it may create runTime error like code confusion so to make it clear we use Generic's, 
  Which use Wrapper class to define dataType deal with separate data types in order to maintain typeSafety"). 
 *Code Re-usability: To avoid duplicating code for different data types.
 *Elimination of Casting: To remove the need for manual casting, which reduces errors and makes code cleaner.*/
/*For generic program we use same syntax of normal with small change i.e., using <wrapperClass> inAngular Brackets*/
/*ArrayList Without Generic's (Raw Type): If you don’t use generic's(i.e., you don't specify the data type), 
 *an ArrayList can hold any type of object, but this leads to the risk of runtime errors due to unsafe type casting.*/
/*Generic's are objects so they don't deal with primitive data type hence we need wrapper classes for prim dataType*/
/*List creation WithOut Generic Syntax:''' Interface obj1 = new Class '''*/
/*Iterator Syntax:                     ''' Interface obj2 = refObjOfList.iterator() '''*/
										/*.iterator() is a iteration method()*/
/*Mandate While*/   /*while(obj2.hasNext() {System.out.println(obj2.next())})*/

/*List creation With    Generic Syntax:''' Interface<WrapperClass> obj1 = new Class<> '''*/
/*Iterator Syntax:                     ''' Interface<WrapperClass> obj2 = refObjOfList(obj1).iterator() '''*/
/*Mandate While*/   /*while(obj2.hasNext() {System.out.println(obj2.next())})*/
public class CollectionFrameWork 
{
	public static void main(String[] args)
	{
		/*-------------WithOut Generic's Creation------------*/
		ArrayList obj1 = new ArrayList(); //Raw Type ArrayList,Which grows in size Dynamically.
		obj1.add("Hai");
		obj1.add("Hello");
		obj1.add("How Are You");
		obj1.add(12.5f);
		
		System.out.print("List is: ");
		System.out.println(obj1);
		/*-------------Iterator Creation------------*/
		/*Iterator=Interface*/	
		Iterator obj2 = obj1.iterator(); /*.iterator() is a iteration method() & obj2 is reference variable for obj1*/
		System.out.println("Iteration: ");
		
		while(obj2.hasNext()) // hasNext() is a method
		{
			System.out.println(obj2.next()); //next() is a method
		}
		System.out.println();//Space line
		
		/*-------------With Generic's Creation------------*/
		ArrayList<String> refVaraible1 = new ArrayList();
		System.out.println("STRING GENERIC");
		refVaraible1.add("Hai");
		refVaraible1.add("Hello");
		
		/*--------------------- Iterator ---------------------*/
		Iterator<String> refVaraible2 = refVaraible1.iterator();
		while(refVaraible2.hasNext())
		{
			System.out.println(refVaraible2.next());
		}
	}
}
