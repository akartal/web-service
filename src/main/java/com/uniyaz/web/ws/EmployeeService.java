package com.uniyaz.web.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by AKARTAL on 26.12.2019.
 */
@WebService
public interface EmployeeService {

    @WebMethod
    public List<Employee> findAllEmployee();

    @WebMethod
    public Employee findById( Long employeeId);

}
