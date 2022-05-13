package com.example.demo.services;

import com.example.demo.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class Empservice {
    public String add_emp_ser(Employee emp) {
        String ans;
        ans = "Hi, ";
        ans = ans + emp.getName();
        return ans;
    }
    public String change_case_ser(Employee emp)
    {
        String ans;
        if(emp.getId()==1) {
            ans = emp.getName().toUpperCase();
        }
        else {
            ans = emp.getName().toLowerCase();
        }
        return ans;
    }


}
