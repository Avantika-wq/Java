/*
 * JAVA - CLASSES AND OBJECTS
 *
 * This file contains practice programs related to
 * classes, objects, constructors, attributes and methods.
 */
// Q1: Create a Car class and display its details
class Car {
  String color;
	int speed;
	String model;
	void display()
	{
	    System.out.println("Color:"+color+" Speed:"+speed+" Model:"+model);
	}
}
public class Main
{
    public static void main(String[] args)
    {
        car c1= new car();
        c1.color ="Red";
        c1.speed = 120;
        c1.model = "VDX";
        c1.display();
    }
}

// Q2: Create a Student class and display details
class Student {
  String name;
	int reg_no;
	String course;
	
	void display()
	{
	    System.out.println("name:"+name+" reg no:"+reg_no+" course:"+course);
	}
}
public class Main
{
     public static void main(String[] args)
     {
         student s1= new student();
         s1.name ="Avantika";
         s1.reg_no = 1074;
         s1.course = "CSE";
         s1.display();
         student s2= new student();
         s2.display();
     }
}

// QUESTION 3: Create an Account class and implement deposit and withdrawal
class Account {
      String accountHolderName;
	    long accountNumber;
	    String accountType;
	    private double accountBalance;
	    Account(String accountHolderName, long accountNumber, String accountType, double accountBalance)
	    {
	        this.accountHolderName=accountHolderName;
	        this.accountNumber=accountNumber;
	        this.accountType=accountType;
	        this.accountBalance=accountBalance;
	    }
	    void deposit(double amount)
	    {
	        this.accountBalance=this.accountBalance+amount;
	        System.out.println("balance after deposit is " + accountBalance);
	    }
	    void withdraw(double amount)
	    {
	        if(this.accountBalance>=amount)
	        {
	            this.accountBalance=this.accountBalance-amount;
	        System.out.println("amount is withdrawn ");
	        }
	        else{
	            System.out.println("Insufficient Balance");
	        }
	    }
	    private void balancenquiry()
	    {
	        System.out.println(accountBalance);
	    }
	    void display()
	    {
	    System.out.println("Account Type: " + accountType);
	    System.out.println("Account Balance: " + accountBalance);
	    }
}
public class Main
{
	  public static void main(String[] args)
	  {
	      Account a1=new Account("Maya",25367,"Savings",2345678);
	      a1.display();
	      a1.deposit(5000);
	      a1.withdraw(2000);
	      a1.balancenquiry();
	  }

}

// QUESTION 4: Create a Book class using a constructor
import java.util.Scanner;
class Book {
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("price: "+price);
    }
}
public class Main{
    public static void main(String[] args){
        Book b=new Book("Harry potter","JK Rowling",1234);
        b.display();
    }
}

// QUESTION 4: Create a Student class using a constructor to initialize student details.
import java.util.Scanner;
class Student{
    String name;
    int  id;
    String dept;
    Student(String name, int id, Strin dept){
        this.name=name;
        this.id=id;
        this.dept=dept
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("department: "+dept);
    }
}
public class Main{
    public static void main(String[] args){
        Student s=new Student("avu",12,"cse");
        s.display();
    }
}

// QUESTION 6: Create a Dog class and display its details.
import java.util.Scanner;
class Dog{
    String name;
    String color;
    Dog(String name, String color){
        this.name=name;
        this.color=color;
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("colour: "+color);
    }
}
public class Main{
    public static void main(String[] args){
        Dog d=new Dog("German shepherd","Black");
        d.display();
    }
}

// QUESTION 7: Create an Employee class and display employee details including salary.
import java.util.Scanner;
class Employee{
    String ename;
    int eid;
    int bsalary;
    Employee(String ename, int eid, int bsalary){
        this.ename=ename;
        this.eid=eid;
        this.bsalary=bsalary;
    }
    void fsalary(){
        double hra=(bsalary*(0.2));
        double da=(bsalary*(0.1));
        double gsalary=bsalary+hra+da;
        System.out.println("Gross Salary: " + gsalary);
    }
    void display(){
        System.out.println("employee name: "+ename);
        System.out.println("employee id: "+eid);
        System.out.println("employee salary: "+bsalary);
        
    }
}
public class Main{
    public static void main(String[] args){
        Employee e=new Employee("avu",78,500000);
        e.display();
        e.fsalary();
    }
}

