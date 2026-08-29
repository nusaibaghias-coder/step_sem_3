package oop.class_problems;

public class Employee {
    String id;
    double salary;
    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printSalary() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }

    public static void main(String[] args) {
        String[] ids = {"E-101", "E-102", "E-103", "E-104"};
        double[] salaries = {40000, 55000, 62000, 48000};

        Employee[] employees = new Employee[ids.length];

        for (int i = 0; i < ids.length; i++) {
            employees[i] = new Employee(ids[i], salaries[i]);
            employees[i].raiseSalary(5000);
            employees[i].printSalary();
        }
    }
}
