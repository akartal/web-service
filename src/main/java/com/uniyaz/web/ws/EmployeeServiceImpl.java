package com.uniyaz.web.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AKARTAL on 26.12.2019.
 */
@WebService(endpointInterface = "com.uniyaz.web.ws.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = getEmployeeList();
        return employeeList;
    }

    private List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1, "asdasd");
        employeeList.add(employee1);
        Employee employee2 = new Employee(2, "asdassdssdfffd");
        employeeList.add(employee2);
        Employee employee3 = new Employee(3, "asdasdwe");
        employeeList.add(employee3);
        Employee employee4 = new Employee(4, "rtgret");
        employeeList.add(employee4);
        return employeeList;
    }

    @Override
    public Employee findById(Long employeeId) {
        if (employeeId == null) {
            throw new RuntimeException("OLMAZ");
        }
        List<Employee> employeeList = getEmployeeList();
        List<Employee> collect = employeeList.stream().filter(employee -> employee.getId() == employeeId).collect(Collectors.toList());
        return collect.get(0);
    }
}