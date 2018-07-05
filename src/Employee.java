import java.util.Objects;

public class Employee extends Person implements TryInterface {
    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return " Name of Employee: " + getName();
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
