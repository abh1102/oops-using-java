package employepayrollsystem;

import java.util.*;

abstract class employee {
    private String name;
    private int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    // applying encapsulation
    public String getName() {
        return name;

    }

    public int getid() {
        return id;
    }

    // creating abstract method
    public abstract double calculatesalary();

    @Override
    public String toString() {
        return "Employee[name=" + name + ",id=" + id + ",salary=" + calculatesalary() + "]";
    }
}
// creating child class of employee

class fullTimeEmployee extends employee {
    private double salary;

    public fullTimeEmployee(String name, int id, double salary) {
        super(name, id);
    }

    @Override
    public double calculatesalary() {
        return salary;

    }
}

/// creating another child class
class parttimeemployee extends employee {
    private double salary;
    private int hoursworked;
    private double hourlyRate;

    public parttimeemployee(String name, int id, int hoursworked, double hourlyRate) {
        super(name, id);
        this.hoursworked = hoursworked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatesalary() {
        return hoursworked * hourlyRate;
    }
}

class payrollsystem {
    private ArrayList<employee> employeelist;

    public payrollsystem() {
        employeelist = new ArrayList<>();
    }

    public void addEmployee(employee employee) {
        employeelist.add(employee);
    }

    // for removing the employee

    public void removeemployee(int id) {
        employee employeeremove = null;
        for (employee employee : employeelist) {
            if (employee.getid() == id) {
                employeeremove = employee;
                break;
            }
        }
        if (employeeremove != null) {
            employeelist.remove(employeeremove);
        }
    }

    public void diplayemployee() {
        for (employee employee : employeelist) {
            System.out.println(employee);
        }
    }
}

public class main {
    public static void main(String[] args) {

        payrollsystem obj = new payrollsystem();
        fullTimeEmployee emp1 = new fullTimeEmployee("abhi", 1, 10000);
        parttimeemployee emp2 = new parttimeemployee("pragya", 2, 5, 800);
        obj.addEmployee(emp1);
        obj.addEmployee(emp2);
        System.out.println("Initial employee details");
        obj.diplayemployee();
        System.out.println("Removing emplpoyee");
        obj.removeemployee(2);
        System.out.println("remaining employee details");
        obj.diplayemployee();
    }

}
