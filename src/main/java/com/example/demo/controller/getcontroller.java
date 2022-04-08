package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getcontroller {

     @GetMapping("/name_demo")
         public String getstring()
          {
               return "request for get mapping";
          }



     @PostMapping("/name_demo")
          public String poststring(@RequestBody String name)
         {
              return name;
         }

}
