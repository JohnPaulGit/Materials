/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coverage_OOP;


// 1. ENCAPSULATION: Hiding internal data and restricting direct access
class Employee {
    private String name; // private variable: cannot be accessed directly from outside
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Public Getters and Setters provide controlled access
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) { // Data validation
            this.salary = salary;
        }
    }

    // Base method to be overridden
    public void work() {
        System.out.println(name + " is performing general employee duties.");
    }
}

// 2. INHERITANCE: Developer reuses fields and methods from Employee using 'extends'
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Invokes the parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // 3. POLYMORPHISM: Overriding the parent's work() method to change its behavior
    @Override
    public void work() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing project timelines.");
    }
}

public class Coverage_OOP_EXAM {
    
}

