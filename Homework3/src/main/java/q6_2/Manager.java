package q6_2;

public class Manager extends Employee {
    private double bonus;

    public Manager(String aName) { super(aName);}
    public void setBonus(double aBonus) { bonus = aBonus; } // new method
    public double getSalary() { return super.getSalary() + bonus; } // overrides Employee method
    public String toString(){
        return super.toString() +
            "\nBonus: " + bonus;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Bella");
        employee.setSalary(32000);
        System.out.println(employee.toString());

        Manager manager = new Manager("Dude");
        manager.setSalary(50000);
        manager.setBonus(15000);
        System.out.println(manager.toString());
    }
}
