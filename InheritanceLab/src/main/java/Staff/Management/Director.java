package Staff.Management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void payBonus() {
        double salary = super.getSalary();
        double twoPerCent = salary*0.02;
        super.raiseSalary(twoPerCent);
    }
}
