class Employee {
    int age;
    int talab;
    String name;
    
    Employee(String name, int age, int talab)
    {
        this.name=name;
        this.age=age;
        this.talab=talab;
    }
}
public class CompObj {
    public static void main(String[] args)
    {
        System.out.println(2 == 2);

        Employee e1 = new Employee("pupsa", 23, 45000);
        Employee e2 = new Employee("Raj", 43, 35000);
        Employee e3 = new Employee("hari", 53, 25000);

        System.out.println(e1.equals(e2));
        
    }
}
