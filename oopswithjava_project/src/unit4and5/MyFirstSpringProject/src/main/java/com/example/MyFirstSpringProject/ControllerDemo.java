package com.example.MyFirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 


@RestController 
public class ControllerDemo {
    @Autowired 
    HelloWorld hw;
    @GetMapping("/gethello")
    public String getHelloWorld( ) {
        return  hw.display();
    }
    @GetMapping("/{id}") 
	public String getHelloWorldwithid(@PathVariable int id){
		return "hello world with " + id;
	}
    
}
//http://localhost:8080/gethello