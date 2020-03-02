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
}
