// Q1. Overriding and overloading
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
    void display(){
        System.out.println("This is basic calculator");
    }
}
class advancedcal extends Calculator{
    @Override
    void display(){
        System.out.println("This is advanced calculator");
    }
    int add(int a, int b, int c){
        System.out.println("Add overidden");
        return a+b+c;
    }
}
class Main{
    public static void main(String[] args){
        int x;
        Calculator c=new Calculator();
        advancedcal a=new advancedcal();
        c.display();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5,20.5));
        a.display();
        x=a.add(40,50,60);
        System.out.println(x);
    }
}

// Inner class
class Calculator{ [private int x]
    class Basiccal{
        void show(){
            System.out.println("This is basic calculator"); [+x]
        }
    }
}
class Main{
    public static void main(String[] args){
        Calculator c=new Calculator();
        Calculator.Basiccal bas=c.new Basiccal();
        bas.show();
    }
}

// Static inner class
class Calculator{
    static class Basiccal{
        void show(){
            System.out.println("This is basic calculator");
        }
    }
}
class Main{
    public static void main(String[] args){
        Calculator c=new Calculator();
        Calculator.Basiccal bas=new Calculator.Basiccal();
        bas.show();
    }
}

// Local innerclass
class Calculator{
    void display(){
        int x=20;
        class Basic{
            void show(){
                System.out.println("local inner class value is "+x);
            }
        }
        Basic b=new Basic();
        b.show();
    }
}
class Main{
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.display();
    }
}

// Employee and salary scenario
class Employee{
    void calculatesalary(int basic, int bonus){
        class Salary{
            int calculatetotal(){
                int total=basic+bonus;
                System.out.println("Total Salary: " + total);
                return total;
            }
        }
        Salary s=new Salary();
        s.calculatetotal();
    }
}
class Main{
    public static void main(String[] args){
        Employee e=new Employee();
        e.calculatesalary(300000,50000);
    }
}

