package com.romal.springbootdemo.service;

import com.romal.springbootdemo.model.Employee;
import com.romal.springbootdemo.repository.RegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationDAO registrationDAO;

    @Override
    public Employee addEmployee(Employee employee) {
        try{
                registrationDAO.saveAndFlush(employee);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return employee;
    }
}
