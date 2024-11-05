package javaAdvance;
import java.util.*;

class Employee implements Comparable<Employee> //Emp class implementing Comparable inteface
{//for comparator interface just use simple class no need off implementation
    private int id, salary, age; // Private Member variables
    private String designation, name;
    
    public Employee(int id, String name, int salary, int age, String designation) //parameterised constructor
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.designation = designation;
    }
    // Getter and Setter methods
    public int getEmpId() { return id; }               // data_type getMethodname() { return parameter}
    public void setEmpId(int id) { this.id = id; }    //  void setMethodName(data_type parameter ) {this.parameter=parameter}
    
    public String getEmpName() { return name; }
    public void setEmpName(String name) { this.name = name; }
    
    public int getEmpSalary() { return salary; }
    public void setEmpSalary(int salary) { this.salary = salary; }
    
    public int getEmpAge() { return age; }
    public void setEmpAge(int age) { this.age = age; }
    
    public String getEmpDesignation() { return designation; }
    public void setEmpDesignation(String designation) { this.designation = designation; }
    
    // Implementing the compareTo method
    @Override
    public int compareTo(Employee EmployeeObj) //Custom Comparable interface HANDLE ONLY 
    										//SINGLE METHOD/COMPARABLE , SO USE COMPARATOR INTERFACE
    {
    	//returning another obj 
        return (this.id - EmployeeObj.id);
    }
   
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

public class TreeSetExampleEmp //Main class
{
    public static void main(String[] args) //Main Method
    {
        TreeSet<Employee> obj1 = new TreeSet<Employee>(); //Creating object for TreeSet class 
        
        // Creating Employee objects and adding them to the TreeSet
        obj1.add(new Employee(7, "Dhoni", 10000, 43, "Captain"));
        obj1.add(new Employee(27, "Jadeja", 15000, 34, "All Rounder"));
        obj1.add(new Employee(45, "Rohit", 12000, 35, "Batsman"));
        
        // Printing the TreeSet
        System.out.print(obj1);
    }
}
