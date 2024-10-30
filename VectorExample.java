package javaAdvance;
import java.util.*; //importing all scanner and vector class
/*Write a program to create the vector of 15 numbers given by user
 *  through keyboard and find out the greatest number among them*/
public class VectorExample
{
	public static void main(String[] args) //main method
	{
		Scanner sc = new Scanner(System.in); //object for scanner class 
		Vector<Integer> obj1 = new Vector(); //Vector creation

		System.out.println("Enter 15 numbers:"); //Message for user
		for (int i = 0; i < 15; i++) //Iterating to take input
		{
			obj1.add(sc.nextInt()); //Taking input in add method..
		}	
		System.out.println(" Entered 15 numbers are: "+ obj1); //Printing 15 memebrs
		//Find Greatest........
		int greatest = 0;
		
	// for(int index = 0 ;greatest>index.length();index++)
		{
			
		}
	}
}
