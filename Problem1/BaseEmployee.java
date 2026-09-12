public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName,
                        String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Base Salary: $" + baseSalary);
    }
}
