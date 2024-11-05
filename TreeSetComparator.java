package javaAdvance;
import java.util.*;

class Employees  //Emp class implementing Comparable inteface
{//for comparator interface just use simple class no need off implementation
    private int id, salary, age; // Private Member variables
    private String designation, name;
    
    public Employees(int id, String name, int salary, int age, String designation) //parameterised constructor
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.designation = designation;
    }
    
    // Getter and Setter methods
    public int getEmpsId() { return id; }
    public void setEmpId(int id) { this.id = id; }
    
    public String getEmpsName() { return name; }
    public void setEmpName(String name) { this.name = name; }
    
    public int getEmpsSalary() { return salary; }
    public void setEmpSalary(int salary) { this.salary = salary; }
    
    public int getEmpsAge() { return age; }
    public void setEmpAge(int age) { this.age = age; }
    
    public String getEmpsDesignation() { return designation; }
    public void setEmpDesignation(String designation) { this.designation = designation; }
    
    @Override
    public String toString() 
    {
        return "\nEmployee id : " + id +
               "\nEmployee name : " + name +
               "\nEmployee salary : " + salary + 
               "\nEmployee age : " + age +
               "\nEmployee designation : " + designation;        
    }
}
class EmployeeCompare implements Comparator<Employees>
{
	public int compare(Employees obj1,Employees obj2)
	{
		return (obj1.getEmpsId() - obj2.getEmpsId());
	}
}

public class TreeSetComparator //Main class
{
    public static void main(String[] args) //Main Method
    {
        TreeSet<Employees> obj1 = new TreeSet<Employees>(new EmployeeCompare()); //Creating object for TreeSet class 
        
        // Creating Employee objects and adding them to the TreeSet
        obj1.add(new Employees(7, "Dhoni", 10000, 43, "Captain"));
        obj1.add(new Employees(5, "Jadeja", 15000, 34, "All Rounder"));
        obj1.add(new Employees(30, "Rohit", 12000, 35, "Batsman"));
        obj1.add(new Employees(18, "Virat", 2000, 35, "Batsman"));
        
        // Printing the TreeSet
        System.out.print(obj1);
    }
}

