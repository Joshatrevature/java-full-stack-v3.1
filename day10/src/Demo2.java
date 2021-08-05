import java.sql.*;
import java.util.*;

public class Demo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Write data you want to insert
        //Employee employee = new Employee();
        //employee.setId(1);
        //employee.setName("Stacy");
        //5employee.setEmail("s@gmail.com");


        Scanner sc = new Scanner(System.in);
        String name;
        String email;

        // Employee Dao
        EmployeeDAO dao =  EmployeeDAOFactory.getEmployeeDao();
        //dao.addEmployee(employee);

        int input = -1;

        while (input != 7){
            System.out.println("1.add employee, \n2.update employee, \n3.delete employee \n4.get employee \n5.employee by id \n7.quit ");
            input = sc.nextInt();

            switch (input){
                case 1: Employee bob = new Employee();
                    System.out.println("id number");
                        input = sc.nextInt();
                        bob.setId(input);
                    System.out.println("name");
                        name = sc.next();
                        bob.setName(name);
                    System.out.println("enter email");
                        email = sc.next();
                        bob.setEmail(email);
                        dao.addEmployee(bob);
                        break;
                case 2: EmployeeDAO dao2 = EmployeeDAOFactory.getEmployeeDao();
                        Employee bob2 = new Employee();
                    System.out.println("enter id");
                        input = sc.nextInt();
                        bob2.setId(input);
                    System.out.println("enter name");
                        name = sc.next();
                        bob2.setName(name);
                    System.out.println("enter email");
                        email = sc.next();
                        bob2.setEmail(email);
                        dao2.updateEmployee(bob2);
                        break;
                case 3: System.out.println("enter id");
                        input = sc.nextInt();
                        dao.deleteEmployee(input);
                            break;
                case 4: List<Employee> employees = dao.getEmployees();
                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                            break;
                case 5: System.out.print("Enter Id: ");
                    int empId = sc.nextInt();
                    //Employee employee = dao.getemployeeById(empId);
                    //System.out.println(employee);
                            break;
            }
        }

    }
}