import java.io.FilterOutputStream;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee() {
    }
    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
     public String getName() {
        return firstname + " " + lastname;
    }
    public int getAnnualSalary() {
        return this.salary*12;
    }
    public int raiseSalary(int percentage) {
        this.salary +=((this.salary*percentage)/100);
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";

    }
}
class TestEmployee extends Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is " + e1.getId());
        System.out.println("firstname is " + e1.getFirstname());
        System.out.println("lastname is " + e1.getLastname());
        System.out.println("salary is " + e1.getSalary());
        System.out.println("name is " + e1.getName());
        System.out.println("annual salary is " + e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);

    }
}
