package com.ziletech.collectionsquestion;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Dipak");
        employee1.setLastName("kumar");
        employee1.setDepartment("Engineering");

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("Rahul");
        employee2.setLastName("Singh");
        employee2.setDepartment("Engineering");

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee2.setFirstName("Vikash");
        employee3.setLastName("Dewangan");
        employee3.setDepartment("executive");

        Employee employee4 = new Employee();
        employee4.setId(4);
        employee3.setFirstName("Monu");
        employee4.setLastName("Jaiswal");
        employee4.setDepartment("Engineering");

        Employee employee5 = new Employee();
        employee5.setId(5);
        employee5.setFirstName("Sonu");
        employee5.setLastName("kewat");
        employee5.setDepartment("Engineering");

        Employee employee6 = new Employee();
        employee6.setId(6);
        employee6.setFirstName("Ramesh");
        employee6.setLastName("patel");
        employee6.setDepartment("Support");

        Employee employee7 = new Employee();
        employee7.setId(7);
        employee7.setFirstName("Ram");
        employee7.setLastName("Chandel");
        employee7.setDepartment("Support");

        Employee employee8 = new Employee();
        employee8.setId(8);
        employee8.setFirstName("Nohar");
        employee8.setLastName("Chandrakar");
        employee8.setDepartment("Support");

        Employee employee9 = new Employee();
        employee9.setId(9);
        employee9.setFirstName("Daram");
        employee9.setLastName("Das");
        employee9.setDepartment("Support");

        Employee employee10 = new Employee();
        employee10.setId(10);
        employee10.setFirstName("Rajkumar");
        employee10.setLastName("Bhaghel");
        employee10.setDepartment("Support");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        //Employee count by department
        HashMap<String, Integer> departmentCount = new HashMap<>();
        for(Employee employee : employees){
            if(departmentCount.containsKey(employee.getDepartment())){
                int count = departmentCount.get(employee.getDepartment());
                departmentCount.put(employee.getDepartment(), count + 1);
            }else{
                departmentCount.put(employee.getDepartment(), 1);
            }
        }

        //Employees By Department
        HashMap<String, ArrayList<Employee>> employeesByDepartment = new HashMap<>();
        for(Employee employee : employees){
            if(employeesByDepartment.containsKey(employee.getDepartment())){
                ArrayList<Employee> empList = employeesByDepartment.get(employee.getDepartment());
                empList.add(employee);
                employeesByDepartment.put(employee.getDepartment(), empList);
            }else{
                ArrayList<Employee> employeeList = new ArrayList<>();
                employeeList.add(employee);
                employeesByDepartment.put(employee.getDepartment(), employeeList);
            }
        }

    }
}


