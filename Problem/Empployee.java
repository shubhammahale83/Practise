package Problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Empployee {

    String name, department;
    int salary;
    
    public Empployee(String name, String department, int salary) {
         this.name = name; this.department = department; this.salary = salary;
    }

    public String toString() {
        return name + "(" + salary + ")";
    } 

    public static void main(String[] args) {

        List<Empployee> list = Arrays.asList(
            new Empployee("Shubham", "IT", 1000),
            new Empployee("Amit", "IT", 2000),  
            new Empployee("Koustubh", "IT", 3000),
            new Empployee("Manish", "O&M", 1000),
            new Empployee("Amay", "O&M", 5000),
            new Empployee("Kiran", "O&M", 3000),
            new Empployee("Himanshu", "HR", 1000),
            new Empployee("Bhushan", "HR", 5000),
            new Empployee("Nikhil", "HR", 4000)
            );

            System.out.println("Second Highest Salary Employees (per department):");
            list.stream()
            .collect(Collectors.groupingBy(e -> e.department))
            .forEach((department, emps) -> 
            {
                List<Integer> salaries = emps.stream()
                .map(e -> e.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

                if (salaries.size() < 2) {
                    System.out.println(department + ": No Second Highest Salary");
                 }

                int second = salaries.get(1);

                List<Empployee> result = emps.stream()
                .filter(e -> e.salary == second)
                .collect(Collectors.toList());

                System.out.println(department + ":" + result);
            });
    }
}
