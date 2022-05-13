package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.services.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

@RestController
public class Getcontroller {

        @Autowired
         private Empservice empservice;

         @GetMapping("/home")
             public String home_method()
             {
                  return "welcome";
             }

         @PostMapping("/employee")
             public String addemp(@RequestBody Employee emp)
             {
                 return this.empservice.add_emp_ser(emp);
             }

         @PostMapping("/Changing_case")
             public String chang_case(@RequestBody Employee emp)
             {
                 return this.empservice.change_case_ser(emp);
             }


}
