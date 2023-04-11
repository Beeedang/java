package employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //생성자 -> alt+insert활용해서 만들기, 없는건 타입이랑 확인해서 만들기
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return this.salary*12;
    }

    public int raiseSalary(int percent) {
        this.salary += (this.salary*percent/100);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
