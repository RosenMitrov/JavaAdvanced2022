package JavaAdvanced.ad06DefiningClasses.exercises.P07Google;

public class Company {
    private String companyName;
    private String companyDepartment;
    private double companySalary;

    public Company(String companyName, String companyDepartment, double companySalary) {
        this.companyName = companyName;
        this.companyDepartment = companyDepartment;
        this.companySalary = companySalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.companyName, this.companyDepartment, this.companySalary);
    }
}
