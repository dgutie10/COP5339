package q6_2;

public class Employee {
    private String name;
    private double salary;

    public Employee(String aName) { name = aName; }
    public void setSalary(double aSalary) { salary = aSalary; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String toString (){
        return "\n ***** Employee Info *****" +
                "\n[Name: " + name + "]" +
                "\n[Base Salary: " + salary +
                "]";
    }
}
