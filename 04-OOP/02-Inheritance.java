// Q1: Create a Student class with id, name and age. Create a child class ugstudent that inherits from Student and adds a department attribute. Display the details using inheritance.
	class Student
	{
	    int id=10;
	    String name="Avu";
	    int age=20;
	    void displayinfo()
	    {
	        System.out.println("name:"+name);
	        System.out.println("age:"+age);
	        System.out.println("id:"+id);
	    }
	}
	class ugstudent extends Student
	{
	    String dept="cse";
	    void display()
	    {
	        super.displayinfo();
	        System.out.println("dept:"+dept);
	    }
	}
	public class Main
	{
	    public static void main(String[] args)
	    {
	        ugstudent ug=new ugstudent();
	        ug.display();
	    }
	}
