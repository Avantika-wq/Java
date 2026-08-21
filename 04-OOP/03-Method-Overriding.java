//Q1. Write a java program to create a class called Animal with a method called makesound(). Create a subclass called cat that overrides the makesound() method to print "meow".
	class Animal {
	    void makeSound() {
	        System.out.println("Animal makes sound");
	    }
	}
	class Cat extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Meow");
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Cat c = new Cat();
	        Animal a = new Animal();
	        c.makeSound();  
	        a.makeSound();  
	    }
	}

// Q2.  Write a java program to create a class called vehicle with a method called drive(). Create a subclass called car that overrides the drive() method to print "Driving car".
	class Vehicle {
	    void drive() {
	        System.out.println("Driving a vehicle");
	    }
	}
	class Car extends Vehicle {
	    @Override
	    void drive() {
	        System.out.println("Driving a car");
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Vehicle v = new Vehicle();
	        v.drive();   
	
	        Car c = new Car();
	        c.drive();   
	    }
	}

// Q3. Write a java program to create a class called shape with a method called getArea(). Create a subclass called rectangle that overrides the getArea() method to calculate the area of rectangle.
	import java.util.Scanner;
	class Shape {
	    double getArea() {
	        System.out.println("Area calculation not defined for generic shape.");
	        return 0;
	    }
	}
	class Rectangle extends Shape {
	    int length;
	    int breadth;
	    Rectangle(Scanner sc) {
	        System.out.print("Enter length: ");
	        length = sc.nextInt();
	
	        System.out.print("Enter breadth: ");
	        breadth = sc.nextInt();
	    }
	    @Override
	    double getArea() {
	        return length * breadth;
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Rectangle rect = new Rectangle(sc);
	        System.out.println("Area of Rectangle: " + rect.getArea());
	        sc.close();
	    }
	}

// Q4. Write a java program to create a class called employee with a method called work() and getsalary(). Create a subclass called HRmanager that overrides the work() method and adds a new mathod called addempployee().
	import java.util.Scanner;
	class Employee {
	    String name;
	    double salary;
	    Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	    void work() {
	        System.out.println(name + " is working...");
	    }
	    double getSalary() {
	        return salary;
	    }
	}
	class HRManager extends Employee {
	    HRManager(String name, double salary) {
	        super(name, salary);
	    }
	    @Override
	    void work() {
	        System.out.println(name + " is managing HR tasks...");
	    }
	    void addEmployee(String newEmployeeName) {
	        System.out.println("HR Manager added a new employee: " + newEmployeeName);
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter HR Manager name: ");
	        String hrName = sc.nextLine();
	        System.out.print("Enter HR Manager salary: ");
	        double hrSalary = sc.nextDouble();
	        sc.nextLine(); 
	        HRManager hr = new HRManager(hrName, hrSalary);
	        hr.work();
	        System.out.println("HR Manager Salary: " + hr.getSalary());
	        System.out.print("Enter new employee name to add: ");
	        String newEmpName = sc.nextLine();
	        hr.addEmployee(newEmpName);
	        sc.close();
	    }
	}

// Q5.  Write a java program to create a class called BankAccount with a method called deposit() and withdraw(). Create a subclass called SavingsAccount() that overrides the withdraw() method to prevent withdrawals if the account balance falls one hundered.
  import java.util.Scanner;
	class BankAccount {
	    double balance;
	    BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	        System.out.println("Current Balance: " + balance);
	    }
	    void withdraw(double amount) {
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	        System.out.println("Current Balance: " + balance);
	    }
	}
	class SavingsAccount extends BankAccount {
	    SavingsAccount(double initialBalance) {
	        super(initialBalance);
	    }
	    @Override
	    void withdraw(double amount) {
	        if (balance - amount < 100) {
	            System.out.println("Withdrawal denied! Balance cannot fall below 100.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	            System.out.println("Current Balance: " + balance);
	        }
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter initial balance: ");
	        double initialBalance = sc.nextDouble();
	        SavingsAccount sa = new SavingsAccount(initialBalance);
	        System.out.print("Enter deposit amount: ");
	        double depositAmount = sc.nextDouble();
	        sa.deposit(depositAmount);
	        System.out.print("Enter withdrawal amount: ");
	        double withdrawAmount = sc.nextDouble();
	        sa.withdraw(withdrawAmount);
	        sc.close();
	    }
	}

// Q6. Writa a java program to create a class Person with a constructor that takes name and age. Extends this class to employee and add a property salary. Use super keyword to call the parent class constructor.
	import java.util.Scanner;
	class Person {
	    String name;
	    int age;
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    void displayPerson() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}
	class Employee extends Person {
	    double salary;
	    Employee(String name, int age, double salary) {
	        super(name, age); // call parent constructor
	        this.salary = salary;
	    }
	    void displayEmployee() {
	        super.displayPerson(); // reuse parent display
	        System.out.println("Salary: " + salary);
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter employee name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter employee age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter employee salary: ");
	        double salary = sc.nextDouble();
	        Employee emp = new Employee(name, age, salary);
	        emp.displayEmployee();
	        sc.close();
	    }
	}

// Q7. Student details
import java.util.Scanner;
class Person{
    String name;
    int age;
    void getpersondetails(Scanner sc){
        System.out.print("Enter name:");
        name=sc.nextLine();
        
        System.out.println("Enter age:");
        age=sc.nextInt();
        sc.nextLine();
     }
 }
 class Student extends Person{
     int marks;
     
     void getStudentdetails(Scanner sc){
            
         System.out.println("Enter marks: ");
         marks=sc.nextInt();
     }
     void display()
    {
     System.out.println("\nStudent Details:");
     System.out.println("Name:"+name);
     System.out.println("Age:"+age);
     System.out.println("Marks:"+marks);
     }
 }

 public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Student s=new Student();
         s.getpersondetails(sc);
         s.getStudentdetails(sc);
         s.display();
         sc.close();
        
     }
 }

// Q8. Employee and Manager
	import java.util.Scanner;
	class Employee{
	    String name;
	    double salary;
	    void inputEmployee(Scanner sc){
	        System.out.println("Enter employee name:");
	        name=sc.nextLine();
	        System.out.println("Enter employee salary:");
	        salary=sc.nextInt();
	        sc.nextLine();
	    }
	}
	class Manager extends Employee{
	    String department ;
	    void inputManager(Scanner sc){
	        super.inputEmployee(sc);
	        System.out.print("Enter department: ");
	        department=sc.nextLine();
	    }
	    void display(){
	        System.out.println("\nEmployee Name:"+name);
	        System.out.println("Salary: "+salary);
	        System.out.println("Department: "+department);
	    }
	}
	public class Main{
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        Employee e=new Employee();
	        Manager m=new Manager();
	        m.inputManager(sc);
	        m.display();
	        sc.close();
	    }
	}
