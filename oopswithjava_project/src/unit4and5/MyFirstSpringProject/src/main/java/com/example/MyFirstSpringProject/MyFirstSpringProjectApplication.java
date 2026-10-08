package com.example.MyFirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class MyFirstSpringProjectApplication implements CommandLineRunner {

	@Autowired 
	HelloWorld hw;
	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}
 
	public void run(String... args) throws Exception{
		System.out.println(hw.display());
	}
	 
}
