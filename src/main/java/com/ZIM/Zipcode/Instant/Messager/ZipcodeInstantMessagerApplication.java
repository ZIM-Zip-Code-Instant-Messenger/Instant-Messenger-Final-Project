package com.ZIM.Zipcode.Instant.Messager;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ZIM.Zipcode.Instant.Messager.student.Student;

@SpringBootApplication
@RestController
public class ZipcodeInstantMessagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipcodeInstantMessagerApplication.class, args);
	}

//rest controller is making the the method below print out to the API
	@GetMapping
	public List <Student> hello(){
		return List.of(
			new Student (
				1L,
				"Andre",
				"andre.zip@gmail.com",
				LocalDate.of(2000, Month.NOVEMBER, 19), 
				29
			)
		);
				
				


			
	}

}
