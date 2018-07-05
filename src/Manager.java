import java.util.List;

public class Manager extends Person implements TryInterface {

    private List<Employee> employee;
    private List<Praktikant> praktikants;

    public List<Praktikant> getPraktikants() {
        return praktikants;
    }

    public void setPraktikants(List<Praktikant> praktikants) {
        this.praktikants = praktikants;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String getCompanyName() {
        return Company;
    }

    @Override
    public void displayCompanyName() {
        System.out.println("Copmany Name : " + getCompanyName());

    }


}


