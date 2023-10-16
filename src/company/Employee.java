package company;

import java.util.Objects;

public class Employee {

    String fName;
    String lName;
    int id;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && fName.equals(employee.fName) && lName.equals(employee.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", id=" + id +
                '}';
    }

    public Employee(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }
}
